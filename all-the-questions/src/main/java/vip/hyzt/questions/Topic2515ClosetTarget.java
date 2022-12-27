package vip.hyzt.questions;

/**
 * <h1>2515. 到目标字符串的最短距离</h1>
 * <p>给你一个下标从 <strong>0</strong> 开始的 <strong>环形</strong> 字符串数组 words 和一个字符串 target 。<strong>环形数组</strong> 意味着数组首尾相连。</p>
 * <ul>
 *     <li>形式上， words[i] 的下一个元素是 words[(i + 1) % n] ，而 words[i] 的前一个元素是 words[(i - 1 + n) % n] ，其中 n 是 words 的长度。</li>
 * </ul>
 * <p>从 startIndex 开始，你一次可以用 1 步移动到下一个或者前一个单词。</p>
 * <p>返回到达目标字符串 target 所需的最短距离。如果 words 中不存在字符串 target ，返回 -1 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：words = ["hello","i","am","leetcode","hello"], target = "hello", startIndex = 1
 *     输出：1
 *     解释：从下标 1 开始，可以经由以下步骤到达 "hello" ：
 *     - 向右移动 3 个单位，到达下标 4 。
 *     - 向左移动 2 个单位，到达下标 4 。
 *     - 向右移动 4 个单位，到达下标 0 。
 *     - 向左移动 1 个单位，到达下标 0 。
 *     到达 "hello" 的最短距离是 1 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：words = ["a","b","leetcode"], target = "leetcode", startIndex = 0
 *     输出：1
 *     解释：从下标 0 开始，可以经由以下步骤到达 "leetcode" ：
 *     - 向右移动 2 个单位，到达下标 3 。
 *     - 向左移动 1 个单位，到达下标 3 。
 *     到达 "leetcode" 的最短距离是 1 。
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：words = ["i","eat","leetcode"], target = "ate", startIndex = 0
 *     输出：-1
 *     解释：因为 words 中不存在字符串 "ate" ，所以返回 -1 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= words.length <= 100</li>
 *     <li>1 <= words[i].length <= 100</li>
 *     <li>words[i] 和 target 仅由小写英文字母组成</li>
 *     <li>0 <= startIndex < words.length</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/shortest-distance-to-target-string-in-a-circular-array/description/">https://leetcode.cn/problems/shortest-distance-to-target-string-in-a-circular-array/description/</a>
 */
public class Topic2515ClosetTarget {

    public int  closetTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (words[(startIndex + i) % n].equals(target)
                    || words[(startIndex - i + n) % n].equals(target)) {
                return i;
            }
        }
        return -1;
    }

}
