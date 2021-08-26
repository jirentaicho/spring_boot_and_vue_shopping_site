import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import About from '../views/About.vue'
import Login from '../views/Login.vue'
import Item from '../views/Item.vue'
import ItemDetail from '../views/ItemDetail.vue'
import Cart from '../views/Cart.vue'

const routes = [
    {
        path: '/',
        name: 'Home',
        component: Home
    },
    {
        path: '/about',
        name: 'About',
        component: About
    },
    {
        path: '/login',
        name: 'Login',
        component: Login
    },
    {
        path: '/item',
        name: 'Item',
        component: Item
    },
    {
        path: '/item/:itemId',
        name: 'ItemDetail',
        component: ItemDetail,
    },
    {
        path: '/cart',
        name: 'Cart',
        component: Cart,
    },
]
const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes 
})


export default router