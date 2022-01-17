<template>
  <div class="wrapper">
    <div class="content-wrapper">
      <div class="article-wrapper">
        <div class="">
          <div class="article-detail-wrapper">
            <div class="header-breadcrumb">
              <div class="breadcrumb secondary-primary-disable">
              <span>
                <span class="styled-item">
                  <a href="">文章</a>
                </span>
                <span>/</span>
              </span>
                <span>
                <span class="styled-item">
                  <a href="">分类</a>
                </span>
                <span>/</span>
              </span>
                <span>
                <span class="primary-title-item">文章标题</span>
              </span>
              </div>
            </div>
            <div class="article-content">
              <div class="article-title">
                文章标题
              </div>
              <div class="article-info-content">
                <span class="info-item">5 小时前发起于</span>
              </div>
              <div class="zoom-wrapper">
                <div class="markdown-content">
                  <Markdown />
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <aside class="aside-wrapper"></aside>
    </div>
  </div>
</template>

<script>
import Markdown from "@/components/Markdown/Markdown";
export default {
  components: {Markdown}
}
</script>

<style lang="scss" scoped>
.wrapper {
  flex: 1 1 auto;
  padding: 10px 0;
  background: rgba(var(--grey-1-rgb), 1);
  min-width: 992px;
}
.content-wrapper {
  max-width: 1048px;
  padding: 0 24px;
  margin: 0 auto;
  display: flex;
  -webkit-box-pack: center;
  justify-content: center;
  font-family: JetBrainsMono;

  .article-wrapper {
    flex: 1 1 auto;
    height: 100%;
    max-width: 734px;

    .article-detail-wrapper {
      background: rgba(var(--dsw-overlay-3-rgb), 1);
      box-shadow: 0 1px 2px rgba(var(--dsw-black-light-rgb), 0.1),0 2px 8px rgba(var(--dsw-black-light-rgb), 0.08);
      width: 100%;
      padding: 0 16px;
      margin-bottom: 10px;
      border-radius: 8px;

      .header-breadcrumb {
        width: 100%;
        display: flex;
        -webkit-box-pack: justify;
        justify-content: space-between;
        -webkit-box-align: center;
        align-items: center;
        height: 36px;
        border-bottom-color: rgba(var(--grey-2-rgb), 1);
        padding: 0;

        .secondary-primary-disable {
          font-size: 14px;
          display: flex;
          -webkit-box-align: center;
          align-items: center;

          & > span {
            display: flex;
            -webkit-box-align: center;
            align-items: center;
          }
        }

        .breadcrumb {
          -webkit-box-sizing: border-box;
          box-sizing: border-box;
          margin: 0;
          padding: 0;
          font-variant: tabular-nums;
          line-height: 1.5715;
          list-style: none;
          -webkit-font-feature-settings: "tnum";
          font-feature-settings: "tnum";
          color: rgba(0,0,0,0.45);
          font-size: 14px;

          & a {
            color: rgba(var(--grey-6-rgb), 1);
            transition: color 0.3s;

            &:hover {
              color: rgba(var(--grey-7-rgb), 1);
            }
          }
        }

        .styled-item {
          max-width: 100px;
          overflow: hidden;
          text-overflow: ellipsis;
          white-space: nowrap;
        }
      }

      .article-content {
        padding-top: 8px;
        position: relative;

        .article-title {
          width: 100%;
          font-size: 18px;
          font-weight: 500;
          line-height: 32px;
          color: rgba(var(--grey-9-rgb), 1);
          word-break: break-word;
          display: flex;
          -webkit-box-align: center;
          align-items: center;
        }
      }
    }
  }
}

.article-info-content {
  display: flex;
  -webkit-box-align: center;
  align-items: center;
  font-size: 12px;
  margin-top: 10px;
}

.article-info-content span {
  white-space: nowrap;
}

.info-item {
  color: rgba(var(--grey-5-rgb), 1);
}

.markdown-content {
  font-family: JetBrainsMono;;
  font-size: 16px;
  line-height: 162%;
  word-break: break-word;
  text-align: justify;
  padding: 0;
  margin-top: 6px;
}

.aside-wrapper {
  flex: 0 0 auto;
  width: 256px;
  margin-left: 10px;
}
</style>