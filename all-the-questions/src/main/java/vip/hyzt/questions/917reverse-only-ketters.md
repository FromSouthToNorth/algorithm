# 917. 仅仅反转字母
给你一个字符串 `s` ，根据下述规则反转字符串：

- 所有非英文字母保留在原有位置。
- 所有英文字母（小写或大写）位置反转。

返回反转后的 `s`

**示例 1：**
```markdown
输入：s = "ab-cd"
输出："dc-ba"
```
**示例 2：**
```markdown
输入：s = "a-bC-dEf-ghIj"
输出："j-Ih-gfE-dCba"
```
**示例 3：**
```markdown
输入：s = s = "Test1ng-Leet=code-Q!"
输出："Qedo1ct-eeLg=ntse-T!"
```
提示
- `1 <= s.length <= 100`
- s 仅由 ASCII 值在范围 [33, 122] 的字符组成
- s 不含 '\"' 或 '\\'

## 双指针

### 思路与算法

使用两个指针 $left$ 和 $right$ 分别指向 输入的字符串 $S$ 转为 $chars$ 数组的起始位置与结束位置。当 $left < right$  并且 $chars[left]$ 不为字符时 

```markdown
s = "1ab-2cd"
chars = ['1', 'a', 'b', '-', '2', 'c', 'd']

left = 0
right = 7 - 1
['1', 'a', 'b', '-', '2', 'c', 'd']
  ↑                             ↑
 left++                      right--

left = 1
right = 5
['1', 'd', 'b', '-', '2', 'c', 'a']
       ↑                   ↑
     left++             right--

left = 2
right = 4
['1', 'd', 'c', '-', '2', 'b', 'a']
            ↑         ↑
          left++   right--

left = 3
right = 3
['1', 'd', 'c', '-', '2', 'b', 'a']
                 ↑
          left++ && right--

return "1dc-2ba"
```

```java
public static String reverseOnlyLetters(String s) {
    // 将字符串 s 转换为可迭代的 char 数组
    char[] chars = s.toCharArray();
    // 记录长度。声明左右指针
    int length = chars.length, left = 0, right = length - 1;
    // 迭代char数组当中的每一个字符
    while (left < right) {
        // 当左指针指向的字符不为大小写字母时左指针向前移动
        while (left < right && !Character.isLetter(chars[left])) {
            left++;
        }
        // 当右指针指向的字符不为大小写字母时右指针向后移动
        while (left < right && !Character.isLetter(chars[right])) {
            right--;
        }
        // 交换大小写字母的左右指针位置
        if (left < right) {
            char c = chars[left];
            chars[left++] = chars[right];
            chars[right--] = c;
        }
    }
    return String.valueOf(chars);
}
```