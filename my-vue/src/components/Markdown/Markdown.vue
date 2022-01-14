<template>
  <component :is="html" class="markdown-body"/>
</template>

<script>
import MarkdownIt from 'markdown-it'
import highlightjs from 'markdown-it-highlightjs'
import latex from 'markdown-it-katex'

export default {
  name: "Markdown",
  props: {
    content: String
  },
  data() {
    return {
      md: null
    }
  },
  computed: {
    html() {
      let res = this.md.render(this.content)
      res = res.replace(
          /<a href="(?!http:\/\/|https:\/\/)([^#]*?)">(.*?)<\/a>/g,
          '<router-link to="$1">$2</router-link>'
      )
      res = res.replace(/<a href="(.*?)">(.*?)<\/a>/g, '<a href="$1" target="_blank">$2</a>')
      return {
        template: '<div>' + res + '</div>'
      }
    }
  },
  created() {
    this.md = new MarkdownIt()
    this.md.use(highlightjs).use(latex)
  }
}
</script>

<style scoped>

</style>