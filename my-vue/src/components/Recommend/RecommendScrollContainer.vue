<template>
  <div class="ewpugi-container">
    <div ref="recommendScrollContainer" class="recommend-scroll-container">
      <a v-for="index in 10" :key="index">
        <div class="company-card-container">
          <img class="logo"
               src="https://images.unsplash.com/photo-1642201344145-0d49517e76e7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60"
               alt="">
          <div class="title-name">{{ index }} miHoYo</div>
          <div class="popularity">热门指数 <span class="num">7,595 ↑</span></div>
          <object>
            <a class="text-button" href="">
              <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"
                   class="svg">
                <path fill-rule="evenodd"
                      d="M2 11.001a9.001 9.001 0 014.974-8.047A8.876 8.876 0 0110.998 2h.535c.018 0 .037 0 .055.002 3.934.218 7.204 3.02 8.15 6.753a1 1 0 01-1.94.49c-.734-2.9-3.27-5.065-6.294-5.245h-.51a6.876 6.876 0 00-3.12.74l-.004.002A7.001 7.001 0 004 11.003v.002a6.873 6.873 0 00.738 3.117c.206.407.271.871.185 1.32l-.387 2.022 2.022-.387c.448-.086.912-.021 1.32.185.44.222.9.395 1.373.518a1 1 0 11-.502 1.936 8.865 8.865 0 01-1.773-.669.067.067 0 00-.042-.006l-3.47.665a1 1 0 01-1.17-1.17l.665-3.47a.067.067 0 00-.006-.043A8.873 8.873 0 012 11.001zM17.004 20h-.005a3 3 0 01-2.68-1.658l-.004-.007A2.936 2.936 0 0114 17.004v-.206a2.995 2.995 0 012.773-2.797l.233-.001c.46-.001.917.107 1.33.315l.007.004A3 3 0 0120 17v.005c.001.425-.09.845-.268 1.232l-.133.29a1 1 0 00-.074.606l.093.485-.484-.093a1 1 0 00-.606.073l-.29.134a2.937 2.937 0 01-1.234.268zm-.296-8A4.995 4.995 0 0012 16.738v.262c-.002.777.18 1.543.53 2.237a5 5 0 006.542 2.313l2.303.441c.365.07.686-.25.616-.615l-.441-2.303a5 5 0 00-2.312-6.541A4.937 4.937 0 0017 12h-.292z"
                      clip-rule="evenodd"></path>
              </svg>
              <span class="text">围观讨论</span>
              <span class="avatar-queue-container">
                <div class="avatar-container" v-for="index in 3" :key="index">
                <img class="avatar"
                     src="https://images.unsplash.com/photo-1536329583941-14287ec6fc4e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHwxfHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60"
                     alt="">
                </div>
              </span>
            </a>
          </object>
        </div>
      </a>
    </div>
    <div ref="leftMask" data-type="mask" class="left-mask" hidden></div>
    <div ref="rightMask" data-type="mask" class="right-mask"></div>
    <div @click="action('left')" ref="actionContainerLeft" data-type="action" data-is-disabled="true"
         class="action-container-left">
      <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"
           class="action-svg">
        <path fill-rule="evenodd"
              d="M14.707 16.293a1 1 0 01-1.414 1.414l-5-5a1 1 0 010-1.414l5-5a1 1 0 111.414 1.414L10.414 12l4.293 4.293z"
              clip-rule="evenodd"></path>
      </svg>
    </div>
    <div @click="action('right')" ref="actionContainerRight" data-type="action" data-is-disabled="false"
         class="action-container-right">
      <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"
           class="action-svg">
        <path fill-rule="evenodd"
              d="M9.293 7.707a1 1 0 011.414-1.414l5 5a1 1 0 010 1.414l-5 5a1 1 0 01-1.414-1.414L13.586 12 9.293 7.707z"
              clip-rule="evenodd"></path>
      </svg>
    </div>
    <div class="erd_scroll_detection_container erd_scroll_detection_container_animation_active"
         style="visibility: hidden; display: inline; width: 0; height: 0; z-index: -1; overflow: hidden; margin: 0; padding: 0;">
      <div dir="ltr" class="erd_scroll_detection_container"
           style="position: absolute; flex: 0 0 auto; overflow: hidden; z-index: -1; visibility: hidden; width: 100%; height: 100%; left: 0; top: 0;">
        <div class="erd_scroll_detection_container"
             style="position: absolute;flex: 0 0 auto;overflow: hidden;z-index: -1;visibility: hidden;inset: -18px -17px -17px -18px;">
          <div
              style="position: absolute;flex: 0 0 auto;overflow: scroll;z-index: -1;visibility: hidden;width: 100%;height: 100%;">
            <div style="position: absolute; left: 0; top: 0; width: 747px; height: 243px;"></div>
          </div>
          <div
              style="position: absolute; flex: 0 0 auto; overflow: scroll; z-index: -1; visibility: hidden; width: 100%; height: 100%;">
            <div style="position: absolute; width: 200%; height: 200%;"></div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "RecommendScrollContainer",
  data() {
    return {
      maxClickNum: 0,
      lastLeft: 0,
      clickNum: 0,
      currentClickNum: 1,
    }
  },
  mounted() {
    this.leftFun()
  },
  beforeDestroy() {
    document.removeEventListener('scroll', this.leftFun)
  },
  methods: {
    action(direction) {
      this.$nextTick(() => {
        const nodes = this.$refs.recommendScrollContainer.children
        const length = nodes.length
        let intLength = parseInt(length / 4)
        this.clickNum = length % 4 === 0 ? intLength : intLength + 1
        let number = nodes[0].clientWidth * 4;
        if (direction === 'right') {
          this.$refs.recommendScrollContainer.scrollLeft += number
          this.currentClickNum++
        }
        else {
          this.$refs.recommendScrollContainer.scrollLeft -= number
          this.currentClickNum--
        }
      })
    },
    leftFun(e) {
      document.addEventListener('scroll', this.leftScroll, true)
    },
    leftScroll(e) {
      const recommendScrollContainer = this.$refs.recommendScrollContainer
      let children = recommendScrollContainer.children
      let scrollWidth = recommendScrollContainer.scrollWidth
      scrollWidth = Math.floor(scrollWidth / children.length) * (children.length % 4)
      let actionContainerRight = this.$refs.actionContainerRight
      let actionContainerLeft = this.$refs.actionContainerLeft
      let leftMask  = document.querySelector('.left-mask')
      let rightMask = document.querySelector('.right-mask')
      this.lastLeft = this.$refs.recommendScrollContainer.scrollLeft || e.target.scrollLeft
      if (this.clickNum === this.currentClickNum) {
        actionContainerRight.dataset.isDisabled = true
        leftMask.removeAttribute('hidden')
        rightMask.setAttribute('hidden', 'hidden')
      }
      if (this.lastLeft > 0) {
        actionContainerLeft.dataset.isDisabled = false
        if (this.clickNum > this.currentClickNum) {
          actionContainerRight.dataset.isDisabled = false
          leftMask.removeAttribute('hidden')
          rightMask.removeAttribute('hidden')
        }
      }
      else {
        actionContainerRight.dataset.isDisabled = false
        actionContainerLeft.dataset.isDisabled = true
        leftMask.setAttribute('hidden', 'hidden')
        rightMask.removeAttribute('hidden')
      }
    }
  }
}
</script>

<style lang="scss" scoped>
.ewpugi-container {
  width: 100%;
  position: relative;
  z-index: 0;

  .recommend-scroll-container {
    scroll-behavior: smooth;
  }

  .recommend-scroll-container ~ div[class*="left-mask"] {
    left: -14px;
    margin: 8px 0;

    &::after {
      background: linear-gradient(to right, rgba(var(--dsw-overlay-3-rgb), 1) 61.98%, rgba(var(--dsw-overlay-3-rgb), 0) 100%);
    }
  }

  .left-mask {
    position: absolute;
    top: 0;
    bottom: 0;
    z-index: 1;
    background-color: rgba(var(--dsw-base-grey-1-rgb), 1);
    pointer-events: none;
    width: 0;
    left: -1px;

    &::after {
      content: "";
      position: absolute;
      top: 0;
      bottom: 0;
      width: 45px;
      transition: opacity 0.3s ease 0s;
      background: linear-gradient(to right, rgba(var(--dsw-base-grey-1-rgb), 1) 0%, rgba(var(--dsw-base-grey-1-rgb), 0) 100%);
      opacity: 1;
      right: 2px;
      transform: translateX(100%);
    }
  }

  .recommend-scroll-container ~ div[class*="right-mask"] {
    right: -14px;
    margin: 8px 0;

    &::after {
      background: linear-gradient(to left, rgba(var(--dsw-overlay-3-rgb), 1) 61.98%, rgba(var(--dsw-overlay-3-rgb), 0) 100%);
    }
  }

  .right-mask {
    position: absolute;
    top: 0;
    bottom: 0;
    z-index: 1;
    background-color: rgba(var(--dsw-base-grey-1-rgb), 1);
    pointer-events: none;
    width: 0;
    right: -1px;

    &::after {
      content: "";
      position: absolute;
      top: 0;
      bottom: 0;
      width: 45px;
      transition: opacity 0.3s ease 0s;
      background: linear-gradient(to left, rgba(var(--dsw-base-grey-1-rgb), 1) 0%, rgba(var(--dsw-base-grey-1-rgb), 0) 100%);
      opacity: 1;
      left: 2px;
      transform: translateX(-100%);
    }
  }

  & > [data-type="action"] {
    opacity: 0;
  }

  &:hover > [data-type="action"][data-is-disabled="false"] {
    opacity: 1;
  }

  & > [data-type="action"][data-is-disabled="false"] {
    pointer-events: auto;
  }

  .action-svg {
    width: 24px;
    height: 24px;
  }

  .recommend-scroll-container ~ div[class*="action-container"] {
    box-shadow: 0 2px 8px rgba(var(--dsw-black-rgb), 0.08), 0 1px 2px rgba(var(--dsw-black-rgb), 0.1);
    margin: 0 12px;
  }

  [class*="action-container"] {
    background: rgba(var(--dsw-overlay-3-rgb), 1);
    position: absolute;
    top: 50%;
    transform: translate(50%, -50%);
    width: 32px;
    height: 32px;
    border-radius: 100%;
    display: flex;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: center;
    justify-content: center;
    color: rgba(var(--dsw-base-grey-6-rgb), 1);
    cursor: pointer;
    z-index: 2;
    transition: background 0.3s ease 0s, color 0.3s ease 0s, opacity 0.3s ease 0s;
  }

  .action-container-right {
    right: 0;

    &:hover {
      color: rgba(var(--grey-0-rgb), 1);
      background: rgba(var(--dsw-primary-standard-rgb), 1);
    }
  }

  .action-container-left {
    left: 0;

    &:hover {
      color: rgba(var(--grey-0-rgb), 1);
      background: rgba(var(--dsw-primary-standard-rgb), 1);
    }
  }

  .erd_scroll_detection_container_animation_active {
    -webkit-animation-duration: 0.1s;
    animation-duration: 0.1s;
    -webkit-animation-name: erd_scroll_detection_container_animation;
    animation-name: erd_scroll_detection_container_animation;
  }
}

.recommend-scroll-container {
  overflow: auto hidden;
  white-space: nowrap;
  display: flex;
  margin: 0 0 0px -16px;
  box-sizing: content-box;
  width: calc(100% + 0px);
  direction: ltr;
  padding: 16px;
  height: 166px;

  &::-webkit-scrollbar {
    display: none;
  }

  &::after {
    content: "";
    display: block;
    padding-right: 0px;
  }

  a {
    text-decoration: none;

    .company-card-container {
      box-shadow: 0 2px 8px rgba(var(--dsw-black-rgb), 0.08), 0 1px 2px rgba(var(--dsw-black-rgb), 0.1);
      padding: 16px;
      background: rgba(var(--dsw-overlay-4-rgb), 1);
      display: inline-block;
      width: 168px;
      height: 166px;
      margin-right: 16px;
      border-radius: 13px;

      .logo {
        width: 42px;
        height: 42px;
        margin-bottom: 8px;
        min-height: 42px;
        border-radius: 5px;
        object-fit: contain;
      }

      .title-name {
        font-size: 16px;
        line-height: 22px;
        font-weight: 500;
        color: rgba(var(--dsw-label-primary-rgb), 1);
        white-space: nowrap;
        text-overflow: ellipsis;
        overflow: hidden;
      }

      .popularity {
        font-size: 12px;
        line-height: 18px;
        color: rgba(var(--dsw-base-grey-6-rgb), 1);

        .num {
          color: rgba(var(--dsw-green-standard-rgb), 1);
        }
      }

      .text-button {

        &:hover {
          background: rgba(var(--dsw-blue-2-rgba));
        }

        font-size: 12px;
        line-height: 18px;
        width: 136px;
        padding: 4px 11px;
        margin-top: 16px;
        color: rgba(var(--dsw-blue-standard-rgb), 1);
        background: rgba(var(--dsw-blue-0-rgba));
        border-radius: 7px;
        transition: all 0.4s ease 0s;
        display: flex;
        -webkit-box-align: center;
        align-items: center;
        user-select: none;
        height: 28px;

        svg {
          font-size: 14px;
          margin-right: 4px;
        }

        .text {
          margin-right: 8px;
        }

        .avatar-queue-container {
          font-size: 0;
          display: flex;
          flex-direction: row-reverse;

          .avatar-container {
            width: 12px;

            .avatar {
              width: 16px;
              height: 16px;
              border-radius: 50%;
              border: 1px solid transparent;
            }
          }
        }
      }
    }
  }
}
</style>