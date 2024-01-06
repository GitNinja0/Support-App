import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import RequestListViewVue from '@/views/RequestListView.vue'
import CreateRequestViewVue from '@/views/CreateRequestView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue')
    },
    {
      path: '/request',
      name: 'request list',
      component: RequestListViewVue
    },
    {
      path: '/new_request',
      name: 'new request',
      component: CreateRequestViewVue
    }
  ]
})

export default router
