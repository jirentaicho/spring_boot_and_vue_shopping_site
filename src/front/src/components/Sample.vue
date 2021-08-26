<template>
  <div class="hello">
    <h1>ログインします</h1>
    <button @click="doLogin">LOGIN</button>
    <hr />
    <h1>湾内さんの可愛いを知る</h1>
    <button @click="onget">湾内さんLOVE</button>
    <h1>存在しないURLへのリクエスト</h1>
    <button @click="ongetDamy">湾内さんLOVE</button>
  </div>
</template>

<script>
import axios from 'axios'

export default {
    
  name: 'Sample',
  data(){
      return {
          message: "",
      }
  },
  methods:{
      onget(){
          axios.get('/api/getItem/')
          .then( r => {
              console.log(r)
          })
      },
      ongetDamy(){
          axios.get('/api/damy/')
          .then( r => {
              console.log(r)
          })
      },
      doLogin(){
          axios.post('/api/login',{
              username : "misaka",
              password: "mikoto",
          })
          .then(r => {
              console.log(r)
          })
      }
  },
  created(){
      // this.onget();
  },
}
</script>

<style scoped>

</style>
