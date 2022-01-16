<template>
  <div id="app">
    <div class="container">
      <div class="main-content-container">
        <div class="container-left">
          <Recommend/>
          <FeedDivider />
          <div v-for="index in 6" :key="index">
            <FeedContainer></FeedContainer>
            <FeedDivider v-if="index !== 6"/>
          </div>
        </div>
      </div>
      <div class="container-right"></div>
    </div>
  </div>
</template>

<script>

import Markdown from "@/components/Markdown/Markdown";
import FeedContainer from "@/components/Feed/FeedContainer";
import FeedDivider from "@/components/Feed/FeedDivider";
import Recommend from "@/components/Recommend/Recommend";

export default {
  name: 'App',
  components: {
    Recommend,
    FeedDivider,
    FeedContainer,
    Markdown
  },
  data() {
    return {}
  },
  created() {
  }
}
</script>

<style lang="scss">
.container {
  width: 1000px;
  display: flex;
  -webkit-box-pack: center;
  justify-content: center;
  margin: 12px auto 0;

  .main-content-container {
    box-shadow: 0 2px 8px rgba(var(--dsw-black-rgb), 0.08),0 1px 2px rgba(var(--dsw-black-rgb), 0.1);
    background: rgba(var(--dsw-overlay-3-rgb), 1);
    border-radius: 8px;
    padding: 16px;
    margin-top: 10px;
    margin-bottom: 40px;

    .container-left {
      width: 734px;
    }
  }

  .container-right {
    width: 256px;
    margin-left: 10px;
  }
}
</style>
