package vip.hyzt.questions;

/**
 * <h1>2511. 最多可以摧毁的敌人城堡数目</h1>
 * <p>给你一个长度为 n ，下标从 <strong>0</strong> 开始的整数数组 forts ，表示一些城堡。forts[i] 可以是 -1 ，0 或者 1 ，其中：</p>
 * <ul>
 *     <li>-1 表示第 i 个位置 <strong>没有</strong> 城堡。</li>
 *     <li>0 表示第 i 个位置有一个 <strong>敌人</strong> 的城堡。</li>
 *     <li>1 表示第 i 个位置有一个你控制的城堡。</li>
 *
 *
 * </ul>
 * <p>现在，你需要决定，将你的军队从某个你控制的城堡位置 i 移动到一个空的位置 j ，满足：</p>
 * <ul>
 *     <li>0 <= i, j <= n - 1</li>
 *      <li>军队经过的位置 <strong>只有</strong> 敌人的城堡。正式的，对于所有 min(i,j) < k < max(i,j) 的 k ，都满足 forts[k] == 0 。</li>
 * </ul>
 * <p>当军队移动时，所有途中经过的敌人城堡都会被 <strong>摧毁</strong> 。</p>
 * <p>请你返回 <strong>最多</strong> 可以摧毁的敌人城堡数目。如果 <strong>无法</strong> 移动你的军队，或者没有你控制的城堡，请返回 0 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：forts = [1,0,0,-1,0,0,0,0,1]
 *     输出：4
 *     解释：
 *     - 将军队从位置 0 移动到位置 3 ，摧毁 2 个敌人城堡，位置分别在 1 和 2 。
 *     - 将军队从位置 8 移动到位置 3 ，摧毁 4 个敌人城堡。
 *     4 是最多可以摧毁的敌人城堡数目，所以我们返回 4 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：forts = [0,0,1,-1]
 *     输出：0
 *     解释：由于无法摧毁敌人的城堡，所以返回 0 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= forts.length <= 1000</li>
 *     <li>-1 <= forts[i] <= 1</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/maximum-enemy-forts-that-can-be-captured/">https://leetcode.cn/problems/maximum-enemy-forts-that-can-be-captured/</a>
 */
public class Topic2511CaptureForts {

    public int captureForts(int[] forts) {
        int max = 0;
        for (int i = 0; i < forts.length; i++) {
            if (forts[i] != 0) {
                for (int j =  i + 1; j < forts.length; j++) {
                    if (forts[j] != 0) {
                        max = Math.max(max, forts[i] == forts[j] ? 0 : j - i - 1);
                        i = j;
                    }
                }
            }
        }
        return max;
    }

}
