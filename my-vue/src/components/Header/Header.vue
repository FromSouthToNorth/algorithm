<template>
  <div id="cssHeader" class="css-layer-NavWrapper">
    <nav class="css-NavContainer">
      <ul class="css-NavbarList">
        <li class="css-NavbarListItem"><a href="#"></a>首页</li>
      </ul>
      <div></div>
    </nav>
  </div>
</template>

<script>
export default {
  name: "Header"
}
</script>

<style lang="scss" scoped>
.css-layer-NavWrapper {
  font-family: JetBrainsMono;
  background: rgba(var(--dsw-overlay-3-rgb), 1);
  width: 100%;
  height: 44px;
  border-bottom: 1px solid rgba(var(--grey-2-rgb), 1);
  display: flex;
  -webkit-box-align: stretch;
  align-items: stretch;
  -webkit-box-pack: center;
  justify-content: center;
  font-size: 13px;
  min-width: 992px;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, "Noto Sans", sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
  position: relative;

  .css-NavContainer {
    display: flex;
    -webkit-box-pack: justify;
    justify-content: space-between;
    min-width: 992px;
    max-width: 1200px;
    width: 100%;
    flex-wrap: nowrap;
    padding: 0 20px;
    position: relative;
  }

  .css-NavbarList {
    display: flex;
    flex-wrap: nowrap;
    -webkit-box-align: center;
    align-items: center;
    margin-bottom: 0;
    padding: 0;

    .css-NavbarListItem {
      height: 20px;
      line-height: 20px;
      margin-right: 20px;
      color: rgba(var(--grey-8-rgb), 1);
      cursor: pointer;
      list-style: none;
      & a {
        height: 100%;
        width: auto;
        line-height: inherit;
        color: inherit;
      }
    }
  }
}
</style>