<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
      <router-link to="/" class="navbar-brand">湾内SHOP</router-link>
      <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
          <router-link to="/" class="nav-link">Home</router-link>
          <router-link to="/about" class="nav-link">About</router-link>
          <router-link to="/item" class="nav-link">Item</router-link>
          <!-- ログインしているときはログアウトにする -->
          <router-link to="/cart" class="nav-link" v-if="isLogin">カート</router-link>
          <a class="nav-link" v-if="isLogin" @click="logout">Logout</a>
          <router-link to="/login" class="nav-link" v-else>Login</router-link>
        </div>
      </div>
    </div>
  </nav>

  <div class="container mt-5">
    <router-view/>
  </div>
</template>

<script>
//import Sample from './components/Sample.vue'
import axios from 'axios'
export default {
  name: 'App',
  components: {
//    Sample
  },
  data(){
    return {
      hasLoginState:false,
    }
  },
  // TODO refacotr dry
  computed: {
    isLogin(){
      if(!this.$store.getters.getUserName){
        return false;
      } else {
        return true;
      }
    }
  },
  methods:{
    logout(){
      axios.post('/api/logout')
      .then(() => {
        alert("ログアウトしました")
        this.$store.dispatch('saveUser',"")
        this.$router.push('/')
      })
    },
  },
  // もしサーバーでセッションがない場合は削除する
  mounted(){
    axios.get('/public/getisLogin')
      .then( hasServerSession => {
        if(!hasServerSession.data){
          this.$store.dispatch('saveUser',"")
        }
      })
      .catch((e) => {
          alert("エラーが発生しました" + e)
      })
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;

}
</style>
