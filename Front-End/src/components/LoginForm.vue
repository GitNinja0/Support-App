<script setup>
import { ref } from 'vue'; 
import { useAuthStore } from '@/stores/auth'
// import { useRouter } from 'vue-router';

let username = ref('')
let password = ref('')
let store = useAuthStore();
// let router = useRouter


function login(){
    if(username.value = store.user.username && password.value == store.user.password){
        // store.user.isAuthenticated = true;
        // router.push('/request')
        console.log('hello')
    }
}
</script>
<template>
    <section>
        <H2 class="login_h2">Inicio de Sesión</H2>

        <form @submit.prevent="login">
            <label for="">
                <h4>Usuario</h4>
                <input type="text" name="username" v-model="username">
            </label>
            <label for="">
                <h4>Contraseña</h4>
                <input type="password" name="password" v-model="password">            
            </label>

            <button  type="submit">Login</button>
        </form>
    </section>
</template>
<style lang="scss" scoped>
section{
    display: grid;
    justify-items: center;
}
.login_h2{
    font-size: 30px;
}
form{
    display: flex;
    flex-direction: column;
    align-items: center;
    background-color: #001971;
    color: white;
    width: 50%;
    gap: 1rem;
    border-radius: 15px;

    label{
        display: flex;
        flex-direction: column;
        align-items: center;

        h4{
            font-size: 25px;
            font-weight: 550;
        }
    }
    input{
        width: 400px;
        height: 40px;
        border-radius: 20px;
    }
    @media (max-width: 968px) {
        input{
            width: 300px;
        }    
    }
    @media (max-width: 668px) {
        input{
            width: 200px;
        }    
    }
    @media (max-width: 468px) {
        input{
            width: 100px;
        }    
    }
    button{
        outline: none;
        color: #141414;
        background-color: #fff;
        border: none;
        border-radius: 20px;
        height: 40px;
        width: 150px;
        margin-bottom: 30px;
        font-weight: 700;
        font-size: 25px;
    }
}
</style>