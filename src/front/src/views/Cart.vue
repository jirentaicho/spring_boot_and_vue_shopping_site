<template>

    <div>
        <h1>ショッピングカート</h1>

        <div class="container mt-5 mb-5">

            <div v-if="orders.length">
                {{orders}}

                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">商品名</th>
                            <th scope="col">数量</th>
                            <th scope="col">値段</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr v-for='order in orders' v-bind:key='order.id'>
                            <td>{{order.itemName}}</td>
                            <td>{{order.count}}</td>
                            <td>{{order.amt}}</td>
                        </tr>
                    </tbody>
                </table>
                <P>合計金額<B>{{getTotalAmt}}</B>円</P>
                <hr />
                <button type="button" class="btn btn-primary" @click="checkout">注文する</button>
            </div>
            <div v-else>
                <h2>カートは空です。</h2>
            </div>

        </div>

    </div>

</template>


<script>
import axios from 'axios'

export default {
    data(){
        return {
            orders:[],
        }
    },
    mounted(){
        axios.get('/api/getcart')
        .then( r => {
            this.orders = r.data;
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
        getTotalAmt(){
            const total = this.orders.reduce((sum,order) => {
                return sum + order.amt
            },0)
            return total;
        }
    },
    methods:{
        checkout(){
            axios.post('/api/checkout')
            .then( () => {
                alert("ご注文ありがとうございまました。")
                this.$router.push('/')
            })
            .catch( (e) => {
                alert("予期せぬエラーが発生しました。" + e)
                this.$router.push('/')
            })
            .finally(() => {
                //TODO 最後にやる処理を記載する。
            })        
        }
    }
   
}
</script>


<style>



</style>