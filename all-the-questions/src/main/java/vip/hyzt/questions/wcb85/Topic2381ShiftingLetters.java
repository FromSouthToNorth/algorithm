package vip.hyzt.questions.wcb85;

/**
 * <h3>6158. 字母移位 II</h3>
 * <p>给你一个小写英文字母组成的字符串 s 和一个二维整数数组 shifts ，其中 shifts[i] = [start<sub>i</sub>, end<sub>i</sub>, direction<sub>i</sub>] 。对于每个 i ，将 s 中从下标 start<sub>i</sub> 到下标 end<sub>i</sub> （两者都包含）所有字符都进行移位运算，如果 direction<sub>i</sub> = 1 将字符向后移位，如果 direction<sub>i</sub> = 0 将字符向前移位。</p>
 * <p>将一个字符 <strong>向后</strong> 移位的意思是将这个字符用字母表中 <strong>下一个</strong> 字母替换（字母表视为环绕的，所以 'z' 变成 'a'）。类似的，将一个字符 <strong>向前</strong> 移位的意思是将这个字符用字母表中 <strong>前一个</strong> 字母替换（字母表是环绕的，所以 'a' 变成 'z' ）。</p>
 * <p>请你返回对 s 进行所有移位操作以后得到的最终字符串。</p>
 * <h4>示例 1：</h4>
 * <pre>
 *     输入：s = "abc", shifts = [[0,1,0],[1,2,1],[0,2,1]]
 *     输出："ace"
 *     解释：首先，将下标从 0 到 1 的字母向前移位，得到 s = "zac" 。
 *     然后，将下标从 1 到 2 的字母向后移位，得到 s = "zbd" 。
 *     最后，将下标从 0 到 2 的字符向后移位，得到 s = "ace" 。
 * </pre>
 * <h4>示例 2:</h4>
 * <pre>
 *     输入：s = "dztz", shifts = [[0,0,0],[1,1,1]]
 *     输出："catz"
 *     解释：首先，将下标从 0 到 0 的字母向前移位，得到 s = "cztz" 。
 *     最后，将下标从 1 到 1 的字符向后移位，得到 s = "catz" 。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>1 <= s.length, shifts.length <= 5 * 10<sup>4</sup></li>
 *     <li>shifts[i].length == 3</li>
 *     <li>0 <= start<sub>i</sub> <= end<sub>i</sub> < s.length</li>
 *     <li>0 <= direction<sub>i</sub> <= 1</li>
 *     <li>s 只包含小写英文字母。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/shifting-letters-ii">https://leetcode.cn/problems/shifting-letters-ii</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2381ShiftingLetters {

    public String shiftingLetters(String s, int[][] shifts) {
        int[] count = new int[s.length() + 1];
        for (int[] shift : shifts) {
            count[shift[0]] += 2 * shift[2] - 1;
            count[shift[1] + 1]  += 1 - 2 * shift[2];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0, sum = 0; i < s.length(); i++) {
            sb.append((char) (((s.charAt(i) - 'a' + (sum += count[i])) % 26 + 26) % 26 + 'a'));
        }
        return "" + sb;
    }

}
