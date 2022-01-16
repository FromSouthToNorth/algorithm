<template>
  <div id="app">
    <Markdown />
    <div v-for="index in 6" :key="index">
      <FeedContainer></FeedContainer>
      <FeedDivider v-if="index !== 6" />
    </div>
  </div>
</template>

<script>

import Markdown from "@/components/Markdown/Markdown";
import FeedContainer from "@/components/Feed/FeedContainer";
import FeedDivider from "@/components/Feed/FeedDivider";
export default {
  name: 'App',
  components: {
    FeedDivider,
    FeedContainer,
    Markdown
  },
  data() {
    return {
    }
  },
  created() {
  }
}
</script>

<style>
</style>
