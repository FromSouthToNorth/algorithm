<template>
  <div class="about-me-container">
    <picture>
      <source
          srcset="https://images.unsplash.com/photo-1638913971789-667874197280?ixlib=rb-1.2.1&ixid=MnwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHwxNnx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60"
          type="image/webp">
      <img
          src="https://images.unsplash.com/photo-1638913971789-667874197280?ixlib=rb-1.2.1&ixid=MnwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHwxNnx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60"
          alt="被禁忌的游戏"
          class="about-me-avatar">
    </picture>
    <div class="name-row">
      被禁忌的游戏
    </div>
    <div class="premium-notice">
      有容乃大，无欲则刚
    </div>
    <div class="about-me-tag">
      <a href="" class="tag-container">
        <svg viewBox="0 0 24 24" width="1em" height="1em" color="rgba(var(--grey-9-rgb), 1)"
             class="about-me-tag-icon">
          <path fill-rule="evenodd"
                d="M11.337 21a1.646 1.646 0 01-1.652-1.635l-.007-1.17c-3.246.706-3.931-1.377-3.931-1.377-.531-1.348-1.296-1.707-1.296-1.707-1.06-.724.08-.71.08-.71 1.17.082 1.788 1.203 1.788 1.203 1.04 1.784 2.73 1.268 3.395.97.105-.754.408-1.269.741-1.56-2.591-.295-5.316-1.297-5.316-5.767 0-1.274.456-2.314 1.203-3.132-.121-.295-.52-1.48.112-3.088 0 0 .98-.313 3.21 1.196a11.197 11.197 0 012.921-.392c.991.004 1.99.133 2.923.392 2.227-1.51 3.206-1.196 3.206-1.196.635 1.608.236 2.794.115 3.088.748.816 1.201 1.858 1.201 3.132 0 4.482-2.73 5.468-5.328 5.757.418.363.791 1.072.791 2.161 0 1.562-.005 2.2-.005 2.2A1.647 1.647 0 0113.838 21h-2.502z"></path>
        </svg>
      </a>
    </div>
  </div>
</template>

<script>
export default {
  name: "AboutMe"
}
</script>

<style lang="scss" scoped>
.about-me-container {
  display: flex;
  flex-direction: column;
  -webkit-box-align: center;
  align-items: center;
  -webkit-box-pack: center;
  justify-content: center;
  padding: 24px 0;
  border-bottom: solid 1px rgba(var(--dsw-border-1-rgba));
  position: sticky;
  margin-top: 10px;
  top: 10px;
  font-family: "JetBrainsMono";
  background: rgba(var(--dsw-overlay-3-rgb), 1);
  border-radius: 8px;
  box-shadow: 0 1px 2px rgba(var(--dsw-black-light-rgb), 0.1),0 2px 8px rgba(var(--dsw-black-light-rgb), 0.08);
  user-select: none;
  min-width: 200px;

  .about-me-avatar {
    width: 60px;
    height: 60px;
    border-radius: 5px;
    margin-bottom: 12px;
  }

  .name-row {
    margin-bottom: 10px;
    font-size: 16px;
    height: 24px;
    color: rgba(var(--dsw-label-primary-rgb), 1);
    display: flex;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: center;
    justify-content: center;
  }

  .premium-notice {
    margin-bottom: 12px;
    font-size: 12px;
    line-height: 16px;
    color: rgba(var(--dsw-label-tertiary-rgba));
  }

  .about-me-tag {
    display: flex;

    .tag-container {
      margin-right: 8px;

      .about-me-tag-icon {
        vertical-align: middle;
        fill: currentcolor;
        overflow: hidden;
        width: 18px;
        height: 18px;
      }
    }
  }
}
</style>