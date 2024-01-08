import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import RequestListViewVue from '@/views/RequestListView.vue'
import CreateRequestViewVue from '@/views/CreateRequestView.vue'
import { useAuthStore } from '@/stores/auth'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/request',
      name: 'request list',
      component: RequestListViewVue,
      // meta: { requiresAuth: true}
    },
    {
      path: '/new_request',
      name: 'new request',
      component: CreateRequestViewVue,
      // meta: { requiresAuth: true}
    }
  ]
})

// router.beforeEach( (to)=>{
//   const store = useAuthStore();

//   if(to.meta.requiresAuth && !store.user.isAuthenticated){
//     return { name: 'home'}
//   }
// })

export default router
