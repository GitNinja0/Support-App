import { defineStore } from "pinia";
import { reactive } from "vue";

export const useAuthStore = defineStore('auth', ()=>{
    const user = reactive()(
        {
            username: 'admin',
            password: '12345'
            // isAuthenticated: false
        }
    )

    return {user}
})