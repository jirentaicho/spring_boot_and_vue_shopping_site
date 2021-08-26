    import { createStore } from 'vuex'
    import createPersistedState from 'vuex-persistedstate'

    export default createStore({
        // レコードの記載
        // Viewファイルから直接アクセスは禁止する
        state: {
            username: "",
        },
        // actionから呼ばれてstateをcommitする
        mutations: {
            saveUser(state, username){
                state.username = username
            }
        },
        // Viewファイルから呼ばれて、mutationsを呼び出す
        actions: {
            saveUser({commit}, username){
                commit("saveUser",username)
            }
        },
        // Viewファイルからの値の参照を行います。
        getters: {
            getUserName(state){
                return state.username
            }
        },
        plugins: [createPersistedState({storage: window.sessionStorage})]
    })