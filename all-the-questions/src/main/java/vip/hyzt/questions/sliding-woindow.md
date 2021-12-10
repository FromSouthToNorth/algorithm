# 滑动窗口

### 代码

```java
/**
 * 滑动窗口解法
 * @param str - 查询的字符串
 * @return 不重复子字符串的长度
 */
public static int slidingWindow(String str) {
    int result = 0;
    int start = 0;
    int end = 0;
    int length = 0;
    int size = str.length();
    for (;end < size; end++) {
        char c = str.charAt(end);
        for (int i = start; i < end; i++) {
            if (c == str.charAt(i)) {
                start = i + 1;
                length = end - start;
                break;
            }
        }
        length++;
        result = Math.max(result, length);
    }
    return result;
}
```

### 测试用例
```markdown
设立左指针 end 和右指针 start
end 指针指向右侧伸缩 {
    每个strArray[end]判断是否在之前的数组中出现过;
    如果出现，指针 end 指向出现过的位置的下一个位置;
    更新 start 指针 和最大长度
}
```

### 时间空间复杂度
```markdown
时间复杂度 O(n^2)
空间复杂度 O(1)
```