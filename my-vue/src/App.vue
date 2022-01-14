<template>
  <div id="app">
    <Markdown :content="content" />
  </div>
</template>

<script>

import Markdown from "@/components/Markdown/Markdown";
export default {
  name: 'App',
  components: {
    Markdown
  },
  data() {
    return {
      content: ""
    }
  },
  created() {
    this.content = '## 二分查找\\n" +\n' +
        '      "\\n" +\n' +
        '      "### 整体思路示例\\n" +\n' +
        '      "\\n" +\n' +
        '      "- 使用到二分查找的数组中的元素前提是升序排列\\n" +\n' +
        '      "- 声明一个名为 **size** 的变量，用来存储需要查找的数组长度\\n" +\n' +
        '      "- **start** 变量为二分查找的起始位置，默认起始位置为 0\\n" +\n' +
        '      "- **end** 变量为二分查找的终止位置，默认为查询数组长度减一\\n" +\n' +
        '      "- `while` 条件当 `start <= end` 为 false 迭代查找 target\\n" +\n' +
        '      "  - **middle** 为 数组中的中位下标，(end - start) 这样处理是为了防止 int 值溢出\\n" +\n' +
        '      "  - 当 target 目标数等于中位数则返回该下标\\n" +\n' +
        '      "  - 当 target 目标数小于中位数则更新二分查找的起始位置 end 为当前中位数减一\\n" +\n' +
        '      "  - 否则更新二分查找的起始下标为当前中位数加一\\n" +\n' +
        '      "  - 可自行脑补画面\\n" +\n' +
        '      "\\n" +\n' +
        '      "- 当需要查找的目标数 target 为 3 时\\n" +\n' +
        '      "- start 为 0，end 为 nums 数组长度减一 8 - 1 = 7;\\n" +\n' +
        '      "\\n" +\n' +
        '      "#### 第一次 while迭代\\n" +\n' +
        '      "\\n" +\n' +
        '      "- start(0) <= end(7) 为 false 进入 `while` 迭代;\\n" +\n' +
        '      "- 中位下标为 start(0) + (7 - 0) / 2。**向下取整 middle 为 3**;\\n" +\n' +
        '      "\\n" +\n' +
        '      "~~~\\n" +\n' +
        '      "此时 middle(3) 指向数组元素当中的 6。 因此 middleNum = 6\\n" +\n' +
        '      " [1, 3, 4, 6, 7, 8, 10, 23]\\n" +\n' +
        '      "  ↑        ↑             ↑\\n" +\n' +
        '      "start(0) middle(3)     end(7)\\n" +\n' +
        '      "\\n" +\n' +
        '      "target(3) 小于 middleNum(6)\\n" +\n' +
        '      "\\n" +\n' +
        '      "end(2) = middle(3) - 1\\n" +\n' +
        '      "~~~\\n" +\n' +
        '      "\\n" +\n' +
        '      "#### 第二次 while 迭代\\n" +\n' +
        '      "\\n" +\n' +
        '      "- start(0) <= end(2) 为 false 进入 `while` 迭代;\\n" +\n' +
        '      "- 中位数下标为 start(0) + (2 - 0) / 2。**middle 为 1**;\\n" +\n' +
        '      "\\n" +\n' +
        '      "~~~\\n" +\n' +
        '      "[1,        3,        4]\\n" +\n' +
        '      " ↑         ↑         ↑\\n" +\n' +
        '      "start(0) middle(1)  end(2)\\n" +\n' +
        '      "\\n" +\n' +
        '      "target(3) == middleNum(3)\\n" +\n' +
        '      "\\n" +\n' +
        '      "返回 middle(1)\\n" +\n' +
        '      "\\n" +\n' +
        '      "结束 while 迭代\\n" +\n' +
        '      "~~~\\n" +\n' +
        '      "\\n" +\n' +
        '      "### 代码示例\\n" +\n' +
        '      "\\n" +\n' +
        '      "~~~java\\n" +\n' +
        '      "int target = 3;\\n" +\n' +
        '      "int[] nums = new int[] {1, 3, 4, 6, 7, 8, 10, 23};\\n" +\n' +
        '      "\\n" +\n' +
        '      "public static int bibarySearch(int[] nums, int target) {\\n" +\n' +
        '      "    int size = nums.length - 1;\\n" +\n' +
        '      "    int start = 0;\\n" +\n' +
        '      "    int end = size;\\n" +\n' +
        '      "    while(start <= end) {\\n" +\n' +
        '      "        int middle = start + (end - start) / 2;\\n" +\n' +
        '      "        int middleNum = nums[middle];\\n" +\n' +
        '      "        if (target == middleNum) {\\n" +\n' +
        '      "            return middle;\\n" +\n' +
        '      "        }\\n" +\n' +
        '      "        else if (target < middleNum) {\\n" +\n' +
        '      "            end = middle - 1;\\n" +\n' +
        '      "        }\\n" +\n' +
        '      "        else {\\n" +\n' +
        '      "            start = middle + 1;\\n" +\n' +
        '      "        }\\n" +\n' +
        '      "    }\\n" +\n' +
        '      "    return -1;\\n" +\n' +
        '      "}\\n" +\n' +
        '      "~~~'
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
