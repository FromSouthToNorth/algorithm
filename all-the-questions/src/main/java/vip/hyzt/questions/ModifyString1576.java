package vip.hyzt.questions;

/**
 * <p>给你一个仅包含小写英文字母和 '?' 字符的字符串 s，请你将所有的 '?' 转换为若干小写字母，使最终的字符串不包含任何 连续重复 的字符。</p>
 *
 * <p>注意：你 不能 修改非 '?' 字符。</p>
 *
 * <p>题目测试用例保证 除 '?' 字符 之外，不存在连续重复的字符。</p>
 *
 * <p>在完成所有转换（可能无需转换）后返回最终的字符串。如果有多个解决方案，请返回其中任何一个。可以证明，在给定的约束条件下，答案总是存在的。</p>
 * <h3>示例 1:</h3>
 * <ul>
 *     <li>输入：s = "?zs"</li>
 *     <li>输出："azs"</li>
 *     <li>解释：该示例共有 25 种解决方案，从 "azs" 到 "yzs" 都是符合题目要求的。只有 "z" 是无效的修改，因为字符串 "zzs" 中有连续重复的两个 'z' 。</li>
 * </ul>
 * <h3>示例 2:</h3>
 * <ul>
 *     <li>输入：s = "ubv?w"</li>
 *     <li>输出："ubvaw"</li>
 *     <li>解释：该示例共有 24 种解决方案，只有替换成 "v" 和 "w" 不符合题目要求。因为 "ubvvw" 和 "ubvww" 都包含连续重复的字符。</li>
 * </ul>
 * <h3>示例 3:</h3>
 * <ul>
 *     <li>输入：s = "j?qg??b"</li>
 *     <li>输出："jaqgacb"</li>
 * </ul>
 * <h3>示例 4:</h3>
 * <ul>
 *     <li>输入：s = "??yw?ipkj?"</li>
 *     <li>输出："acywaipkja"</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters">链接：https://leetcode-cn.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters</a>
 */
public abstract class ModifyString1576 {

    /**
     * 遍历扫描
     * @param   s 需要替换所以 ? 保证不包含任何 连续重复 的字符
     * @return  替换后的字符串
     */
    public static String traversalScan(String s) {
        int length = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < length; i++) {
            if (arr[i] == '?') {
                for (char ch = 'a'; ch <= 'c'; ++ch) {
                    if ((i > 0 && arr[i - 1] == ch) || (i < length - 1 && arr[i + 1] == ch)) {
                        continue;
                    }
                    arr[i] = ch;
                    break;
                }
            }
        }
        return new String(arr);
    }

}
