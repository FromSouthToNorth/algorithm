package vip.hyzt.questions;

/**
 * <h3>面试题 01.05. 一次编辑</h3>
 * <p>字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     <strong>输入: </strong>
 *     first = "pale"
 *     second = "ple"
 *     <strong>输出：</strong>True
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     <strong>输入: </strong>
 *     first = "pales"
 *     second = "pal"
 *     <strong>输出：</strong>False
 * </pre>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/one-away-lcci/">链接：https://leetcode.cn/problems/one-away-lcci/</a>
 */
public class Topic01_05_OneEditAway {

    public static boolean oneEditAway(String first, String second) {
        int n = first.length(), m = second.length();
        if (Math.abs(n - m) > 1) return false;
        if (n > m) return oneEditAway(second, first);
        int i = 0, j = 0, cnt = 0;
        while (i < n && j < m && cnt <= 1) {
            char c1 = first.charAt(i), c2 = second.charAt(j);
            if (c1 == c2) {
                i++; j++;
            }
            else {
                if (n == m) {
                    i++; j++; cnt++;
                }
                else {
                    j++; cnt++;
                }
            }
        }
        return cnt <= 1;
    }

}
