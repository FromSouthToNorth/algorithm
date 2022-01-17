<template>
  <footer class="basic-footer">
    <div class="basic-footer-inner">
      <section>
        <div class="site-legal">
          <a target="_blank" href="https://www.beian.miit.gov.cn/">蜀ICP备 20019889号</a>
          <a href="https://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51012202000694">川公网安备 51012202000694号</a>
        </div>
      </section>
    </div>
  </footer>
</template>

<script>
export default {
  name: "BasicFooter"
}
</script>

<style lang="scss" scoped>
@media (min-width: 1032px) {
  footer.basic-footer .basic-footer-inner{
    width: 1032px;
  }
}

footer.basic-footer {
  font-family: JetBrainsMono;
  position: relative;
  width: 100%;
  min-width: 992px;
  background: #202326;

  .basic-footer-inner {
    margin: 0 auto;
    width: 100%;
    font-size: 14px;
    padding: 16px;
    color: #fff;

    .site-legal {
      text-align: left;
      font-size: 12px;
      padding-top: 16px;
      width: 100%;

      & > a {
        color: hsla(0,0%,100%,0.5);
        margin-right: 16px;
        display: inline-block;
        padding-bottom: 5px;
      }
    }
  }
}
</style>