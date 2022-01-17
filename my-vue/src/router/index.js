import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        component: resolve => require(["@/views/Home"], resolve)
    },
    {
        path: '/article',
        component: resolve => require(["@/views/Article"], resolve)
    }
]

const router = new VueRouter({
    mode: "history",
    routes
});

export default router;