<template>
    <div>
        <h1>ログイン</h1>
        <div class="shadow p-3 mt-5 mb-5 bg-white rounded">
            <form>
                <div class="mb-3">
                    <label class="form-label text-start">ユーザー名</label>
                    <input v-model="username" type="text" class="form-control" id="username">
                </div>
                <div class="mb-3">
                    <label class="form-label">パスワード</label>
                    <input v-model="password" type="password" class="form-control" id="password">
                </div>
                <button type="button" class="btn btn-primary" @click="login">ログイン</button>
            </form>
        </div>
    </div>

</template>


<script>
import axios from 'axios'
export default {
  name: 'Login',
  data(){
      return {
          username : "",
          password : "",
          isLoginStatus: false,
      }
  },
  methods:{
      login(){
        if(this.isLoginStatus){
            return;
        }
        if(!this.isInputValidation()){
            alert("ユーザー名かパスワードが未入力です。")
            return;
        }
        this.isLoginStatus = true;

        axios.post('/api/login', {
            username: this.username,
            password: this.password,
        })
        .then(r => {
            if(r)
            this.isLoginStatus = false;
            // TODO 画面リンクとvuexへログイン情報の保存を行う。
            alert("ログインしました")
            // ログインした場合はusernameをvuexに保持する
            this.$store.dispatch('saveUser',this.username)
            this.$router.push('/item')
        })
        .catch( (e) => {
            alert("ログインに失敗しました。" + e)
            this.$router.push('/')
        })
        .finally(() => {
            this.isLoginStatus = false;
        })
      },

      isInputValidation(){
          if(!this.username || !this.password){
              return false;
          }else{
              return true;
          }
      },
  },


}
</script>


<style>



</style>