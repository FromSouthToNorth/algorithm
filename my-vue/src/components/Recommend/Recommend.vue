<template>
  <div class="recommend-container">
    <recommend-header/>

    <recommend-scroll-container />
  </div>
</template>

<script>
import RecommendHeader from "@/components/Recommend/RecommendHeader";
import RecommendScrollContainer from "@/components/Recommend/RecommendScrollContainer";

export default {
  name: "Recommend",
  components: {RecommendScrollContainer, RecommendHeader}
}
</script>

<style lang="scss" scoped>
.recommend-container {
  font-family: "JetBrainsMono";

}
</style>