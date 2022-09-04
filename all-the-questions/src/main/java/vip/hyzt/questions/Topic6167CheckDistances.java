package vip.hyzt.questions;

/**
 * <h2>6167. 检查相同字母间的距离</h2>
 * <p>给你一个下标从 <strong>0</strong> 开始的字符串 s ，该字符串仅由小写英文字母组成，s 中的每个字母都 <strong>恰好</strong> 出现 <strong>两次</strong> 。另给你一个下标从 <strong>0</strong> 开始、长度为 26 的的整数数组 distance 。</p>
 * <p>字母表中的每个字母按从 0 到 25 依次编号（即，'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25）。</p>
 * <p>在一个 <strong>匀整</strong> 字符串中，第 i 个字母的两次出现之间的字母数量是 distance[i] 。如果第 i 个字母没有在 s 中出现，那么 distance[i] 可以 <strong></strong> 。</p>
 * <p>如果 s 是一个 <strong>匀整</strong> 字符串，返回 true ；否则，返回 false 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：s = "abaccb", distance = [1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
 *     输出：true
 *     解释：
 *     - 'a' 在下标 0 和下标 2 处出现，所以满足 distance[0] = 1 。
 *     - 'b' 在下标 1 和下标 5 处出现，所以满足 distance[1] = 3 。
 *     - 'c' 在下标 3 和下标 4 处出现，所以满足 distance[2] = 0 。
 *     注意 distance[3] = 5 ，但是由于 'd' 没有在 s 中出现，可以忽略。
 *     因为 s 是一个匀整字符串，返回 true 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：s = "aa", distance = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
 *     输出：false
 *     解释：
 *     - 'a' 在下标 0 和 1 处出现，所以两次出现之间的字母数量为 0 。
 *     但是 distance[0] = 1 ，s 不是一个匀整字符串
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>2 <= s.length <= 52</li>
 *     <li>s 仅由小写英文字母组成</li>
 *     <li>s 中的每个字母恰好出现两次</li>
 *     <li>distance.length == 26</li>
 *     <li>0 <= distance[i] <= 50</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/check-distances-between-same-letters">https://leetcode.cn/problems/check-distances-between-same-letters</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic6167CheckDistances {

    public boolean checkDistances(String s, int[] distance) {
        int[] index = new int[256];
        for (int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if (index[c] == 0) {
                index[c] = i + 1;
            }
            else if (i - index[c] != distance[c - 'a']) {
                return false;
            }
        }
        return true;
    }

}
