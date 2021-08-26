<template>

    <div>

        <div class="container mb-5">
            <div class="row">
                <div class="col-sm-8">
                    
                    <div class="card" style="width: 90%;">
                        <img src="https://pics.prcm.jp/ab4ec1ac077b2/84741053/png/84741053.png" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">{{item.name}}</h5>
                            <p class="card-text">{{item.note}}</p>
                        </div>
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item">{{item.price}}円</li>
                            <li class="list-group-item">在庫数{{item.stock}}個</li>
                        </ul>
                    </div>

                </div>
                <!-- UI -->
                <div class="col-sm-4">

                    <form>
                        <div class="mb-3">
                            <h4>{{item.name}}</h4>
                            <label for="exampleInputEmail1" class="form-label">数量</label>
                            <input type="number" class="form-control" min="0" max="99" v-model="choiceCount">
                            <div class="form-text">お一人様99個までとさせていただきます。</div>
                        </div>
                        
                        <div>合計<B>{{getAmt}}</B>円</div>
                        <hr />
                        <!-- ログインしているときのみカートに追加ボタンを表示する -->
                        <button type="submit" class="btn btn-primary" v-if="isLogin" @click="addCart">カートに入れる</button>
                        <router-link to="/login" class="btn btn-danger" v-else>ログインしてください</router-link>
                    </form>

                </div>
            </div>
        </div>

    </div>

</template>


<script>
import axios from 'axios'
export default {
    data(){
        return {
            id: 0,
            choiceCount: 0,
            item: {},
        }
    },
    mounted(){
        this.id = this.$route.params.itemId;
        axios.get('/public/item/' + this.$route.params.itemId)
        .then(r => {
            this.item = r.data;
        })
        .catch( (e) => {
            alert("予期せぬエラーが発生しました。" + e)
            this.$router.push('/')
        })
        .finally(() => {
            //TODO 最後にやる処理を記載する。
        })
    },
    computed:{
        getAmt(){
            if(!Object.keys(this.item).length){
                return 0;
            }
            return this.item.price * this.choiceCount;
        },
        isLogin(){
            if(!this.$store.getters.getUserName){
                return false;
            } else {
                return true;
            }
        }
    },
    methods:{
        addCart(){
            if(!this.lenghtValidation() || !this.formatValidation()){
                //ここで本番でエラー残る→ルーティングがitem/1?のようになる。
                alert("エラーがあります");
                return;
            }
            // TODO post backend
            axios.post('/api/addCart', {
                username: this.$store.getters.getUserName,
                itemId: this.id,
                itemName: this.item.name,
                count: this.choiceCount,
                amt: this.getAmt,
            })
            .then( () => {
                this.$router.push('/')
            })
            .catch( (e) => {
                alert("エラーが発生しました" + e)
                this.$router.push('/')
            })
            .finally( () => {

            })
        },
        lenghtValidation(){
            if(this.choiceCount <= 0){
                return false
            }
            if(this.choiceCount >= 100){
                return false
            }
            return true;
        },
        formatValidation(){
            const regexp = new RegExp(/^[0-9]+$/)
            return regexp.test(this.choiceCount)
        }
    }


}
</script>
