<template>
  <div class="container">
    <div class="main-content-container">
      <div class="container-left">
        <Recommend/>
        <FeedDivider/>
        <div v-for="index in 6" :key="index">
          <FeedContainer></FeedContainer>
          <FeedDivider v-if="index !== 6"/>
        </div>
      </div>
    </div>
    <div class="container-right">
      <AboutMe/>
    </div>
  </div>
</template>

<script>
import Recommend from "@/components/Recommend/Recommend";
import FeedDivider from "@/components/Feed/FeedDivider";
import FeedContainer from "@/components/Feed/FeedContainer";
import AboutMe from "@/components/AboutMe/AboutMe";

export default {
  name: "Home",
  components: {AboutMe, FeedContainer, FeedDivider, Recommend}
}
</script>

<style lang="scss" scoped>
.container {
  width: 1000px;
  display: flex;
  -webkit-box-pack: center;
  justify-content: center;
  margin: 12px auto 0;
  min-height: 900px;

  .main-content-container {
    box-shadow: 0 2px 8px rgba(var(--dsw-black-rgb), 0.08), 0 1px 2px rgba(var(--dsw-black-rgb), 0.1);
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