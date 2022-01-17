<template>
  <div id="app">
    <Header />
    <router-view />
    <BasicFooter />
  </div>
</template>

<script>
import BasicFooter from "@/components/Footer/BasicFooter";
import Header from "@/components/Header/Header";

export default {
  name: 'App',
  components: {
    Header,
    BasicFooter,
  },
  data() {
    return {}
  },
  created() {
  }
}
</script>

<style lang="scss">

</style>
