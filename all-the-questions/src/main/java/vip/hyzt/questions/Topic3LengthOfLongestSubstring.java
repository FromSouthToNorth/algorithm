package vip.hyzt.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。<p/>
 * <p>示例 1:<p/>
 * 输入: s = "abcabcbb"<br/>
 * 输出: 3<br/>
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。<br/>
 * <p>示例 2:<p/>
 * 输入: s = "bbbbb"<br>
 * 输出: 1<br/>
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。<br/>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/">https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/</a>
 */
public abstract class Topic3LengthOfLongestSubstring {

    /**
     * 滑动窗口解法
     * @param str - 查询的字符串
     * @return 不重复子字符串的长度
     */
    public static int slidingWindow(String str) {

        // 返回的结果
        int result = 0;
        // 左指针(迭代 s 字符串的指针)
        int end = 0;
        // 滑动窗口的开始指针
        int start = 0;
        // 更新最长子字符串的长度
        int length = 0;
        // 字符串长度
        int size = str.length();
        for (; end < size; end++) {
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

    /**
     * 用 HashMap 记录字符出现的次数，优化一层循环
     * @param str - 查询的字符串
     * @return 不重复子字符串的长度
     */
    public static int hashSlidingWindow(String str) {

        // 返回的结果
        int result = 0;
        // 左指针 迭代 s 字符串子字符的指针
        int end = 0;
        // 右指针 滑动窗口的起始指针
        int start = 0;
        // 子字符串的长度
        int length = 0;
        // 字符串 s 的大小
        int size = str.length();
        // 【用来记录重复子字符的 HashMap 来进行优化一层迭代，当然还有利用 ASCII 码桶 来替代 HashMap】
        Map<Character, Integer> hashMap = new HashMap<>();

        // 迭代 s 字符串
        for (; end < size; end++) {
            // 取出 s 字符串当中的子字符
            char c = str.charAt(end);
            // 模拟滑动窗口 当 hashMap 当中包含重复子字符
            // 并且该重复子字符的下标大于滑动窗口起始下标。
            if (hashMap.containsKey(c) && hashMap.get(c) >= start) {
                // 更新 滑动窗口的起始下标
                start = hashMap.get(c) + 1;
                // 更新 无重复子字符串长度
                length = end - start;
            }
            hashMap.put(c, end);
            length++;
            result = Math.max(result, length);
        }

        return result;
    }

    /**
     * <p>利用桶替代 优化 HashMap<p/>
     * int[26] 用于字母， 'a' - 'z' 或者 'A' - 'Z'<br/>
     * int[128] 用于 ASCII 码<br/>
     * int[256] 用于扩展 ASCII 码<br/>
     * @param str - 查询的字符串
     * @return 不重复子字符串的长度
     */
    public static int bucketDingWindow(String str) {

        int result = 0, start = 0, end = 0, length = 0, size = str.length();
        int[] asciiArray = new int[256];
        Arrays.fill(asciiArray, -1);
        while (end < size) {
            char c = str.charAt(end);
            // 当子字符下标大于滑动窗口起始下标
            if (asciiArray[c] >= start) {
                // 更新滑动窗口起始下标
                start = asciiArray[c] + 1;
                // 更新子字符串长度
                length = end - start;
            }
            asciiArray[c] = end;
            end++;
            length++;
            result = Math.max(result, length);
        }

        return result;
    }

}
