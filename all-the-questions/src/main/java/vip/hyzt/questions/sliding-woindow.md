
<p>给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。<p/>
<p>示例 1:<p/>
输入: s = "abcabcbb"<br/>
输出: 3<br/>
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。<br/>
<p>示例 2:<p/>
输入: s = "bbbbb"<br>
输出: 1<br/>
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。<br/>

# 滑动窗口

### 代码

```java
/**
 * 滑动窗口解法
 * @param str - 查询的字符串
 * @return 不重复子字符串的长度
 */
public static int slidingWindow(String str) {
    // 返回的结果
    int result = 0;
    // 滑动窗口的开始指针
    int start = 0;
    // 左指针(迭代 s 字符串的指针)
    int end = 0;
    // 更新最长子字符串的长度
    int length = 0;
    // 字符串长度
    int size = str.length();
    for (;end < size; end++) {
        // 迭代字符串当中的每个子字符        
        char c = str.charAt(end);
        // 模拟滑动窗口, 起始位置(指针)为 start 终止位置(指针)为 end
        for (int i = start; i < end; i++) {
            // 当有子字符重复出现 更新起始位置及最长子字符串的长度
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

### 用 HashMap 记录字符出现的次数，优化一层循环

#### 实例代码
~~~
public static int hashSlidingWindow(String str) {
    int result = 0;
    int length = 0;
    // 滑动窗口起始下标
    int start = 0; 
    // 滑动窗口结束下标
    int end = 0;
    // 字符串 str 的大小
    int size = str.length();
    // 【用来记录重复子字符的 HashMap 来进行优化一层迭代，当然还有利用 ASCII 码桶 来替代 HashMap】
    Map<Character, Integer> hashMap = new HashMap<>();
    
    while (end < size) {
        // 取出 s 字符串当中的子字符
        char c = str.chatAt(end);
        // 模拟滑动窗口 当 hashMap 当中包含重复子字符
        // 并且该重复子字符的下标大于滑动窗口起始下标。
        if (hashMap.containsKey(c) && hashMap.get(c) >= start) {
            // 更新 滑动窗口的起始下标
            strat = hashMap.get(c) + 1;
            // 更新 无重复子字符串长度
            length = end - start;
        }
        hashMap.put(c, end);
        end++;
        length++;
        result = Math.max(result, length);
    }
    
    return result'
}
~~~
### 利用桶替代 HashMap

#### 示例代码

~~~
/**
 * <p>利用桶替代 HashMap<p/>
 * @param str - 查询的字符串
 * @return 不重复子字符串的长度
 */
public static int bucketDingWindow(String str) {

    int result = 0;
    int start = 0;
    int end = 0;
    int size = str.length();
    
    // int[26] 用于字母， 'a' - 'z' 或者 'A' - 'Z'
    // int[128] 用于 ASCII 码
    // int[256] 用于扩展 ASCII 码
    int[] asciiBucket = new int[256];
    Arrays.fill(asciiBucket, -1);
    
    while (end < size) {
        char c = str.charAt(end);
        if (asciiBucket[c] >= start) {
            end = asciiBucket[c] + 1;
            length = end - start;
        }
        asciiBucket[c] = end;
        end++;
        length++;
        result = Math.max(result, length);
    }
    
    return result;
}
~~~
