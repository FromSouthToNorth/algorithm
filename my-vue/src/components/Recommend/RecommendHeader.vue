<template>
  <div class="recommend-header-container">
    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"
         class="Svg-card-ShadowedIconTrendingUp">
      <path fill-rule="evenodd"
            d="M20 9.505l-6.066 6.066a1 1 0 01-1.414 0l-3.384-3.384-5.429 5.43a1 1 0 11-1.414-1.415l6.136-6.136a1 1 0 011.414 0l3.384 3.383 5.359-5.358H16.09a1 1 0 110-2H21a1 1 0 011 1V12a1 1 0 11-2 0V9.505z"
            clip-rule="evenodd"></path>
    </svg>
    <span class="recommend-header-title">推荐文章</span>
  </div>
</template>

<script>
export default {
  name: "RecommendHeader"
}
</script>

<style lang="scss" scoped>
.recommend-header-container {
  display: flex;
  -webkit-box-align: center;
  align-items: center;
  position: relative;

  .Svg-card-ShadowedIconTrendingUp {
    box-shadow: 0 2px 8px rgba(var(--dsw-black-rgb), 0.08), 0 1px 2px rgba(var(--dsw-black-rgb), 0.1);
    width: 22px;
    height: 22px;
    padding: 3px;
    margin-right: 8px;
    border-radius: 11px;
    color: rgba(var(--dsw-red-standard-rgb), 1);
    background: rgba(var(--dsw-white-light-rgb), 1);
  }

  .recommend-header-title {
    font-size: 16px;
    line-height: 22px;
    font-weight: 500;
    color: rgba(var(--dsw-label-primary-rgb), 1);
  }
}
</style>