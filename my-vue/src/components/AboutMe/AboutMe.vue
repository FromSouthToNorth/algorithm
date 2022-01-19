<template>
  <div class="about-me-container">
    <p class="about-me-title">个人简介</p>
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
    <div>
      <div class="row-wrapper">
        <div class="row-icon">
          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"
               class="css-1rhb60f-Svg ea8ky5j0">
            <path fill-rule="evenodd"
                  d="M16.008 12.124A1.017 1.017 0 0116 12V7.586l-1.121 1.121a1 1 0 11-1.415-1.414l2.829-2.829a1 1 0 011.414 0l2.828 2.829a1 1 0 11-1.414 1.414L18 7.586V12c0 .042-.003.083-.008.124A4.002 4.002 0 0117 20a4 4 0 01-.992-7.876zm-8.016-.248c.005.04.008.082.008.124v1h2a1 1 0 110 2H8v4a1 1 0 11-2 0v-4H4a1 1 0 110-2h2v-1c0-.042.003-.083.008-.124A4.002 4.002 0 017 4a4 4 0 01.992 7.876zM7 10a2 2 0 100-4 2 2 0 000 4zm10 4a2 2 0 100 4 2 2 0 000-4z"
                  clip-rule="evenodd"></path>
          </svg>
        </div>
        <div class="row-content">男</div>
      </div>
    </div>
    <div class="tag-wrapper">
      <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"
           class="Svg-StyledIconTag">
        <path fill-rule="evenodd"
              d="M14.89 3.727l5.377 5.375a2.499 2.499 0 010 3.536l-7.77 7.776a2 2 0 01-1.415.586H5a2 2 0 01-2-2v-6.08a2 2 0 01.586-1.415l7.78-7.778a2.5 2.5 0 013.524 0zm-1.412 1.416l.002.002a.499.499 0 00-.702-.002L5 12.92V19h6.082l7.772-7.777a.499.499 0 000-.706l-5.376-5.374zm-4.01 9.389a1.249 1.249 0 11-1.766 1.766 1.249 1.249 0 011.766-1.766z"
              clip-rule="evenodd"></path>
      </svg>
      <div class="jvonow-container">
        <span title="Java" class="tag">Java</span>
      </div>
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
  box-shadow: 0 1px 2px rgba(var(--dsw-black-light-rgb), 0.1), 0 2px 8px rgba(var(--dsw-black-light-rgb), 0.08);
  user-select: none;
  min-width: 200px;

  .about-me-title {
    color: rgba(var(--dsw-label-primary-rgb), 1);
    font-size: 16px;
    line-height: 22px;
    font-weight: 600;
    margin-bottom: 16px;
  }

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

  .row-wrapper {
    display: flex;
    -webkit-box-align: center;
    align-items: center;
    position: relative;
  }

  .row-icon {
    flex-shrink: 0;
    width: 18px;
    height: 18px;

    svg {
      width: 100%;
      height: 100%;
      color: rgba(var(--dsw-label-tertiary-rgba));
    }
  }

  .row-content {
    width: calc(100% - 26px);
    margin-left: 8px;
    line-height: 17px;
    word-break: break-all;
    color: rgba(var(--dsw-label-secondary-rgba));
  }

  .tag-wrapper {
    display: flex;
    align-items: flex-start;
    margin-top: 10px;
    margin-bottom: -10px;
  }

  .jvonow-container {
    display: flex;
    flex-wrap: wrap;
    -webkit-box-pack: start;
    justify-content: flex-start;

    & > span:last-of-type {
      cursor: default;
    }
  }

  .tag {
    display: inline-block;
    max-width: 88px;
    margin: 0 4px 10px;
    padding: 2px 8px;
    background: rgba(var(--dsw-fill-tertiary-rgba));
    cursor: default;
    font-size: 12px;
    line-height: 17px;
    border-radius: 8px;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
  }

  .Svg-StyledIconTag Photoswipe {
    flex-shrink: 0;
    margin-right: 8px;
    width: 18px;
    height: 18px;
  }

  .about-me-tag {
    display: flex;
    margin-top: 16px;

    .tag-container {
      &:not(:last-of-type) {
        margin-right: 16px;
      }

      & > svg {
        color: rgba(var(--dsw-label-tertiary-rgba));
      }

      & > svg:hover {
        color: rgba(var(--grey-9-rgb), 1);
      }

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