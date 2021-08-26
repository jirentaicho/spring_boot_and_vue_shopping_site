import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import store from './store'

// 本番用→後で修正する
// import axios from 'axios'
// axios.defaults.baseURL = "http://localhost:8080/wannai"


createApp(App).use(router).use(store).mount('#app')
