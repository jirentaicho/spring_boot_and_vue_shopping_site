<template>

    <div>
        <h1>商品一覧</h1>
        <div class="row">
            <div v-for='item in items' v-bind:key='item.id'>
                <!-- 子コンポーネントにObjectを渡す -->
                <ItemCard :item='item' />
            </div>
        </div>
    </div>

</template>


<script>
import axios from 'axios'
import ItemCard from './../components/ItemCard.vue'

export default {
  name: 'Item',
  components:{
      ItemCard
  },
  data(){
      return {
        items : [],
      }
  },
  methods:{
      hogeFunc(){
          return true;
      },
      
  },
  mounted(){
        axios.get('/public/items')
        .then(r => {
            this.items = r.data;
        })
        .catch( (e) => {
            alert("予期せぬエラーが発生しました。" + e)
            this.$router.push('/')
        })
        .finally(() => {
            //TODO 最後にやる処理を記載する。
        })
  },
  computed: {
      getUserName(){
          return this.$store.getters.getUserName;
      }
  },
}
</script>


<style>



</style>