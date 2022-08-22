package vip.hyzt.questions;

/**
 * <h3>6156. 得到 K 个黑块的最少涂色次数</h3>
 * <p>给你一个长度为 n 下标从 <strong>0</strong> 开始的字符串 blocks ，blocks[i] 要么是 'W' 要么是 'B' ，表示第 i 块的颜色。字符 'W' 和 'B' 分别表示白色和黑色。</p>
 * <p>给你一个整数 k ，表示想要 <strong>连续</strong> 黑色块的数目。</p>
 * <p>每一次操作中，你可以选择一个白色块将它 <strong>涂成</strong> 黑色块。</p>
 * <p>请你返回至少出现 一次 连续 k 个黑色块的 <strong>最少</strong> 操作次数。</p>
 * <h4>示例 1：</h4>
 * <pre>
 *     输入：blocks = "WBBWWBBWBW", k = 7
 *     输出：3
 *     解释：
 *     一种得到 7 个连续黑色块的方法是把第 0 ，3 和 4 个块涂成黑色。
 *     得到 blocks = "BBBBBBBWBW" 。
 *     可以证明无法用少于 3 次操作得到 7 个连续的黑块。
 *     所以我们返回 3 。
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *     输入：blocks = "WBWBBBW", k = 2
 *     输出：0
 *     解释：
 *     不需要任何操作，因为已经有 2 个连续的黑块。
 *     所以我们返回 0 。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>n == blocks.length</li>
 *     <li>1 <= n <= 100</li>
 *     <li>blocks[i] 要么是 'W' ，要么是 'B' 。</li>
 *     <li>1 <= k <= n</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks">https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic6156MinimumRecolors {

    public int minimumRecolors(String blocks, int k) {
        int curr = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < blocks.length(); i++) {
            curr += blocks.charAt(i) / 'W' - (i < k ? 0 : blocks.charAt(i - k) / 'W');
            min = i < k - 1 ? min : Math.min(min, curr);
        }
        return min;
    }

}
