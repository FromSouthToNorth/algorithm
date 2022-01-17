import Vue from 'vue'
import App from './App.vue'
import '@/assets/css/index.scss'
import 'github-markdown-css/github-markdown.css'
import 'highlight.js/styles/github-dark.css'
import router from "@/router";

import Photoswipe from "vue-pswipe";
Vue.use(Photoswipe)

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
