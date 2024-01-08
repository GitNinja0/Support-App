<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>
    <h1>ITPro Assist</h1>
      <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/request">Lista de Solicitudes</RouterLink>
        <router-link to="new_request">Crear Solicitud</router-link>
      </nav>
  </header>
  <main>

    <RouterView />
  </main>
  <footer>
      <svg xmlns="http://www.w3.org/2000/svg" class="icon icon-tabler icon-tabler-copyright" width="40" height="40" viewBox="0 0 24 24" stroke-width="1.5" stroke="#ffffff" fill="none" stroke-linecap="round" stroke-linejoin="round">
      <path stroke="none" d="M0 0h24v24H0z" fill="none"/>
      <path d="M12 12m-9 0a9 9 0 1 0 18 0a9 9 0 1 0 -18 0" />
      <path d="M14 9.75a3.016 3.016 0 0 0 -4.163 .173a2.993 2.993 0 0 0 0 4.154a3.016 3.016 0 0 0 4.163 .173" />
      </svg>
      <p>Todos los derechos reservados</p>
  </footer>
</template>

<style lang="scss" scoped>
header{
  background-color: #0D21A1;
  color: white;
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 1rem;
  
  a{
    color: #fff;
    text-decoration: none;
    margin-right: 10px;
  }
}
footer{
  color: white;
  background-color: #141414;
  position: fixed;
  display: flex;
  align-items: center;
  gap: 1rem;
  height: 75px;
  width: 100%;
  bottom: 0;
}
.icon-tabler-copyright{
  margin-left: 1rem;
}
</style>
