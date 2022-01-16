<template>
  <div class="feed-container">
    <img
        class="feed-image"
        src="https://images.unsplash.com/photo-1638913976381-5b8ed66c36d6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHw2fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60"
        alt="">
    <div class="feed-content">
      <div class="feed-header">
        <div class="feed-main-header">
          <div>
            <a href="">
              <picture>
                <source
                    srcset="https://images.unsplash.com/photo-1638913976381-5b8ed66c36d6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHw2fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60"
                    type="image/webp">
                <img
                    src="https://images.unsplash.com/photo-1638913976381-5b8ed66c36d6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHw2fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60"
                    alt="MaricoCheung" class="feed-avatar">
              </picture>
            </a>
          </div>
          <a class="feed-title-title-link">92. 反转链表【幼儿园都懂】</a>
        </div>
        <div class="feed-text-from-now">热门围观</div>
      </div>
      <div class="feed-content-summary">
        三指针 + 两占位符
        定义 “前指针 prev”、“当前指针 curr”、“后指针 next”
        让 “当前指针 curr” 快进到反转左节点
        启动链表占位符 “prevStand”、“currStand”
        遍历变更反向链表指针，直至反转右节点【该过程与 206. 反向链表 相近】
        完成反向链表操作后，用链表占位符完成
      </div>
      <div class="feed-tags">
        <div class="main-blue-text-tag">
          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="1em" height="1em" fill="currentColor"
               class="css-1rhb60f-Svg ea8ky5j0">
            <path fill-rule="evenodd"
                  d="M5 4h14a3 3 0 013 3v10a3 3 0 01-3 3H5a3 3 0 01-3-3V7a3 3 0 013-3zm0 2a1 1 0 00-1 1v10a1 1 0 001 1h14a1 1 0 001-1V7a1 1 0 00-1-1H5zm4.027 6L6.906 9.879A1 1 0 018.32 8.464l2.475 2.475a1.5 1.5 0 010 2.122L8.32 15.536a1 1 0 11-1.414-1.415L9.027 12zM13 16a1 1 0 110-2h3a1 1 0 110 2h-3z"
                  clip-rule="evenodd"></path>
          </svg>
          题解
        </div>
        <a href="" class="text-tag">
          链表
        </a>
        <a href="" class="text-tag">
          双指针
        </a>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "FeedContainer"
}
</script>

<style lang="scss" scoped>
.feed-container {
  font-family: "JetBrainsMono";
  display: flex;
  padding: 16px 0;
  cursor: pointer;

  .feed-image {
    width: 200px;
    height: 120px;
    margin-right: 16px;
    object-fit: cover;
    border-radius: 12px;
  }

  .feed-content {
    flex: 1 1 0%;
    width: 0;

    .feed-header {
      display: flex;
      -webkit-box-align: center;
      align-items: center;
      -webkit-box-pack: justify;
      justify-content: space-between;

      .feed-main-header {
        display: flex;
        -webkit-box-align: center;
        align-items: center;
        overflow: hidden;

        .feed-avatar {
          width: 22px;
          height: 22px;
          border-radius: 50%;
          margin-right: 8px;
        }

        .feed-title-title-link {
          font-size: 16px;
          line-height: 22px;
          font-weight: 500;
          overflow: hidden;
          text-overflow: ellipsis;
          white-space: pre;
          margin-right: 10px;
          flex: 1 1 0%;
        }
      }

      .feed-text-from-now {
        font-size: 12px;
        line-height: 18px;
        flex: 0 0 auto;
      }
    }

    .feed-content-summary {
      font-size: 14px;
      line-height: 20px;
      -webkit-line-clamp: 2;
      overflow: hidden;
      display: -webkit-box;
      -webkit-box-orient: vertical;
      margin: 16px 0 18px;
      height: 40px;
    }

    .feed-tags {
      display: flex;

      .main-blue-text-tag {
        font-size: 12px;
        overflow: hidden;
        text-overflow: ellipsis;
        color: rgba(var(--dsw-blue-standard-rgb), 1);
        background: rgba(var(--dsw-blue-0-rgba));
        height: 24px;
        line-height: 20px;
        padding: 2px 8px;
        border-radius: 12px;
        margin-right: 10px;
        white-space: nowrap;
        max-width: 120px;
      }

      .main-green-text-tag {
        font-size: 12px;
        overflow: hidden;
        text-overflow: ellipsis;
        color: rgba(var(--dsw-green-standard-rgb), 1);
        background: rgba(var(--dsw-green-1-rgba));
        height: 24px;
        line-height: 20px;
        padding: 2px 8px;
        border-radius: 12px;
        margin-right: 10px;
        white-space: nowrap;
        max-width: 120px;
      }
      [class*=-text-tag] svg {
        font-size: 14px;
        margin-right: 4px;
        vertical-align: text-bottom;
      }
      .text-tag {
        font-size: 12px;
        overflow: hidden;
        text-overflow: ellipsis;
        color: rgba(var(--dsw-label-tertiary-rgba));
        background: rgba(var(--dsw-fill-tertiary-rgba));
        height: 24px;
        line-height: 20px;
        padding: 2px 8px;
        border-radius: 12px;
        margin-right: 10px;
        white-space: nowrap;
        max-width: 120px;
      }
    }
  }
}
</style>