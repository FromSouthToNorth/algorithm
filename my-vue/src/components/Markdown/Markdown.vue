<template>
  <div>
    <article id="write" ref="article" v-html="article" class="article markdown-body"/>
    <div id="toc" />
  </div>
</template>

<script>
import MarkdownIt from 'markdown-it'
import highlight from 'highlight.js'
import Clipboard from 'clipboard'
import tocbot from 'tocbot'

export default {
  name: 'Markdown',
  data() {
    return {
      article: '## 二分查找\n' +
          '\n' +
          '### 整体思路示例\n' +
          '\n' +
          '- 使用到二分查找的数组中的元素前提是升序排列\n' +
          '- 声明一个名为 **size** 的变量，用来存储需要查找的数组长度\n' +
          '- **start** 变量为二分查找的起始位置，默认起始位置为 0\n' +
          '- **end** 变量为二分查找的终止位置，默认为查询数组长度减一\n' +
          '- `while` 条件当 `start <= end` 为 false 迭代查找 target\n' +
          '  - **middle** 为 数组中的中位下标，(end - start) 这样处理是为了防止 int 值溢出\n' +
          '  - 当 target 目标数等于中位数则返回该下标\n' +
          '  - 当 target 目标数小于中位数则更新二分查找的起始位置 end 为当前中位数减一\n' +
          '  - 否则更新二分查找的起始下标为当前中位数加一\n' +
          '  - 可自行脑补画面\n' +
          '\n' +
          '- 当需要查找的目标数 target 为 3 时\n' +
          '- start 为 0，end 为 nums 数组长度减一 8 - 1 = 7;\n' +
          '\n' +
          '#### 第一次 while迭代\n' +
          '- start(0) <= end(7) 为 false 进入 `while` 迭代;\n' +
          '- 中位下标为 start(0) + (7 - 0) / 2。**向下取整 middle 为 3**;\n' +
          '~~~\n' +
          '此时 middle(3) 指向数组元素当中的 6。 因此 middleNum = 6\n' +
          ' [1, 3, 4, 6, 7, 8, 10, 23]\n' +
          '  ↑        ↑             ↑\n' +
          'start(0) middle(3)     end(7)\n' +
          '\n' +
          'target(3) 小于 middleNum(6)\n' +
          '\n' +
          'end(2) = middle(3) - 1\n' +
          '~~~\n' +
          '\n' +
          '#### 第二次 while 迭代\n' +
          '- start(0) <= end(2) 为 false 进入 `while` 迭代;\n' +
          '- 中位数下标为 start(0) + (2 - 0) / 2。**middle 为 1**;\n' +
          '~~~\n' +
          '[1,        3,        4]\n' +
          ' ↑         ↑         ↑\n' +
          'start(0) middle(1)  end(2)\n' +
          '\n' +
          'target(3) == middleNum(3)\n' +
          '\n' +
          '返回 middle(1)\n' +
          '\n' +
          '结束 while 迭代\n' +
          '~~~\n' +
          '### 代码示例\n' +
          '~~~java\n' +
          'int target = 3;\n' +
          'int[] nums = new int[] {1, 3, 4, 6, 7, 8, 10, 23};\n' +
          '\n' +
          'public static int bibarySearch(int[] nums, int target) {\n' +
          '    int size = nums.length - 1;\n' +
          '    int start = 0;\n' +
          '    int end = size;\n' +
          '    while(start <= end) {\n' +
          '        int middle = start + (end - start) / 2;\n' +
          '        int middleNum = nums[middle];\n' +
          '        if (target == middleNum) {\n' +
          '            return middle;\n' +
          '        }\n' +
          '        else if (target < middleNum) {\n' +
          '            end = middle - 1;\n' +
          '        }\n' +
          '        else {\n' +
          '            start = middle + 1;\n' +
          '        }\n' +
          '    }\n' +
          '    return -1;\n' +
          '}\n' +
          '~~~\n' +
          '## img 1\n' +
          '![img 1](https://images.unsplash.com/photo-1642201375226-79a36e4b21ae?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw1fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60)\n' +
          '## img 2\n' +
          '![img 2](https://images.unsplash.com/photo-1642185611844-d66846033977?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwzNnx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60)\n' +
          '## img 3\n' +
          '![img 3](https://images.unsplash.com/photo-1642169457812-c4b606c149bc?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwzOXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60)',
      clipboard: null,
      images: [],
    }
  },
  destroyed() {
    this.clipboard.destroy()
    tocbot.destroy()
  },
  created() {
    this.markdownToHtml(this.article)
  },
  mounted() {
    this.clipboardBtn()
    this.content()
    this.constructorImages()
  },
  methods: {
    /* 查看图片 */
    constructorImages() {
      const images = this.$refs.article.getElementsByTagName('img');
      console.log(images);
      for (let i = 0; i < images.length; i++) {
        images[i].addEventListener('click', e => {
          this.previewImages(e.target.currentSrc, i)
        })
        this.images.push({ src: images[i].src })
      }
    },
    previewImages(image, index) {
      this.$Pswp.open({
        items: this.images,
        options: {
          index: index,
          bgOpacity: 0.9
        }
      })
    },
    /* 目录生产 */
    content() {
      let nodes = this.$refs.article.children
      if (nodes.length) {
        for (let i = 0; i < nodes.length; i++) {
          let node = nodes[i];
          let reg = /^H[1-4]{1}$/
          if (reg.exec(node.tagName)) {
            node.id = i
          }
        }
      }
      tocbot.init({
        tocSelector: '#toc',            // 要把目录添加元素位置，支持选择器
        contentSelector: '.article',    // 获取html的元素
        headingSelector: 'h1, h2, h3, h4',  // 要显示的id的目录
        hasInnerContainers: true,
        onClick: function (e) {
          e.preventDefault();
        }
      })
    },
    /* 复制代码按钮 */
    clipboardBtn() {
      this.clipboard = new Clipboard('.copy-btn');
      this.clipboard.on('success', () => {
        console.log('clipboard success')
      })
    },
    /* 渲染 Markdown fo Html */
    markdownToHtml(article) {
      const md = new MarkdownIt({
        html: true,
        linkify: true,
        typographer: true,
        highlight: function (str, lang) {
          let date = new Date().getTime();
          if (window.performance && typeof window.performance.now === "function") {
            date += performance.now();
          }
          const codeIndex = "xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx".replace(
              /[xy]/g,
              function (c) {
                let r = (date + Math.random() * 16) % 16 | 0;
                date = Math.floor(date / 16);
                return (c === "x" ? r : (r & 0x3) | 0x8).toString(16);
              }
          );
          // 复制功能主要使用的是 clipboard.js
          let html = `<button class="copy-btn" type="button" data-clipboard-action="copy" data-clipboard-target="#copy${codeIndex}"><i></i></button>`;
          const linesLength = str.split(/\n/).length - 1;
          // 生成行号
          let linesNum = '<span aria-hidden="true" class="line-numbers-rows">';
          for (let index = 0; index < linesLength; index++) {
            linesNum = linesNum + "<span></span>";
          }
          linesNum += "</span>";
          if (!lang) {
            lang = "markdown";
          }
          if (lang && highlight.getLanguage(lang)) {
            // highlight.js 高亮代码
            const preCode = highlight.highlight(str, {language: lang}).value;
            html = html + preCode;
            if (linesLength) {
              html += '<b class="name">' + lang + "</b>";
            }
            // 将代码包裹在 textarea 中，由于防止textarea渲染出现问题，这里将 "<" 用 "<" 代替，不影响复制功能
            return `<pre class="hljs"><code>${html}</code>${linesNum}</pre><textarea style="position: absolute;top: -9999px;left: -9999px;z-index: -9999;" id="copy${codeIndex}">${str.replace(
                /<\/textarea>/g,
                "</textarea>"
            )}</textarea>`;
          }
        }
      })
      article = md.render(article)
      this.article = article
    }
  }
}
</script>

<style lang="scss">
.markdown-body pre.hljs {
  padding: 12px 2px 12px 30px;
  border-radius: 5px;
  position: relative;
  font-size: 13px ;
  line-height: 24px;
  overflow: hidden;
  &:hover .copy-btn {
    display: flex;
    justify-content: center;
    align-items: center;
  }
  code {
    display: block;
    margin: 0 10px;
    overflow-x: auto;
    &::-webkit-scrollbar {
      z-index: 11;
      width: 6px;
    }
    &::-webkit-scrollbar:horizontal {
      height: 6px;
    }
    &::-webkit-scrollbar-thumb {
      border-radius: 5px;
      width: 6px;
      background: #666;
    }
    &::-webkit-scrollbar-corner,
    &::-webkit-scrollbar-track {
      background: #1e1e1e;
    }
    &::-webkit-scrollbar-track-piece {
      background: #1e1e1e;
      width: 6px;
    }
  }
  .line-numbers-rows {
    position: absolute;
    pointer-events: none;
    top: 12px;
    bottom: 12px;
    left: 0;
    font-size: 12px;
    width: 30px;
    text-align: center;
    letter-spacing: -1px;
    border-right: 1px solid rgba(0, 0, 0, 0.66);
    user-select: none;
    counter-reset: linenumber;
    span {
      pointer-events: none;
      display: block;
      counter-increment: linenumber;
      &:before {
        content: counter(linenumber);
        color: #999;
        display: block;
        text-align: center;
      }
    }
  }
  b.name {
    position: absolute;
    top: 7px;
    right: 45px;
    z-index: 1;
    color: #999;
    pointer-events: none;
  }
  .copy-btn {
    padding: 4px;
    position: absolute;
    top: 6px;
    right: 6px;
    z-index: 1;
    color: #ccc;
    background-color: #525252;
    border-radius: 4px;
    display: none;
    width: 24px;
    height: 24px;
    outline: none;
    border: none;
    & i {
      background: url("../../assets/svg/copy.svg") center center / cover no-repeat;
      display: inline-block;
      width: 100%;
      height: 100%;
    }
  }
}
</style>