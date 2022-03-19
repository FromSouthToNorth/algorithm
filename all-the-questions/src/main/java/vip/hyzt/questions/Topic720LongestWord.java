package vip.hyzt.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * <h3>720. 词典中最长的单词</h3>
 * <p>给出一个字符串数组words 组成的一本英语词典。返回words 中最长的一个单词，该单词是由words词典中其他单词逐步添加一个字母组成。</p>
 * <p>若其中有多个可行的答案，则返回答案中字典序最小的单词。若无答案，则返回空字符串。</p>
 * <b>示例 1：</b>
 * <pre>
 *     <strong>输入：</strong>words = ["w","wo","wor","worl","world"]
 *     <strong>输出：</strong>"world"
 *     <strong>解释：</strong>单词"world"可由"w", "wo", "wor", 和 "worl"逐步添加一个字母组成。
 * </pre>
 * <b>示例 2：</b>
 * <pre>
 *     <strong>输入：</strong>words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
 *     <strong>输出：</strong>"apple"
 *     <strong>解释：</strong>"apply" 和 "apple" 都能由词典中的单词组成。但是 "apple" 的字典序小于 "apply"
 * </pre>
 * @see <a href="https://leetcode-cn.com/problems/longest-word-in-dictionary">720.词典中最长的单词</a>
 * @author  力扣（LeetCode）
 * @author hy
 */
public abstract class Topic720LongestWord {

    /**
     * 模拟解法
     */
    public static String longestWordSimulation(String[] words) {
        String ans = "";
        Set<String> set = new HashSet<>();
        for (String s : words) {
            set.add(s);
        }
        for (String s : set) {
            int n = s.length(), m = ans.length();
            if (n < m) {
                continue;
            }
            if (n == m && s.compareTo(ans) > 0) {
                continue;
            }
            boolean ok = true;
            for (int i = 1; i <= n && ok; i++) {
                String sub = s.substring(0, i);
                if (!set.contains(sub)) {
                    ok = false;
                }
            }
            if (ok) {
                ans = s;
            }
        }
        return ans;
    }

}
