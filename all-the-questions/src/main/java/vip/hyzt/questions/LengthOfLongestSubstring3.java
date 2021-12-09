package vip.hyzt.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。<p/>
 * <p>示例 1:<p/>
 * 输入: s = "abcabcbb"<br/>
 * 输出: 3<br/>
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。<br/>
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/">https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/</a>
 */
public abstract class LengthOfLongestSubstring3 {

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

    /**
     * 用 HashMap 记录字符出现的次数优化一层循环
     * @param str - 查询的字符串
     * @return 不重复子字符串的长度
     */
    public static int hashSlidingWindow(String str) {

        int result = 0;
        int start = 0;
        int end = 0;
        int length = 0;
        int size = str.length();
        Map<Character, Integer> hashMap = new HashMap<>();
        for (;end < size; end++) {
            char c = str.charAt(end);
            if (hashMap.containsKey(c) && hashMap.get(c) >= start) {
                start = hashMap.get(c) + 1;
                length = end - start;
            }
            hashMap.put(c, end);
            length++;
            result = Math.max(result, length);
        }

        return result;
    }

}
