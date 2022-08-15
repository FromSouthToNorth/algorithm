package vip.hyzt.weeks.weeks_306;

/**
 * <h3>6149. 边积分最高的节点</h3>
 * <p>给你一个有向图，图中有 n 个节点，节点编号从 0 到 n - 1 ，其中每个节点都 <strong>恰有一条</strong> 出边。</p>
 * <p>图由一个下标从 <strong>0</strong> 开始、长度为 n 的整数数组 edges 表示，其中 edges[i] 表示存在一条从节点 i 到节点 edges[i] 的 <strong>有向</strong> 边。</p>
 * <p>节点 i 的 <strong>边积分</strong> 定义为：所有存在一条指向节点 i 的边的节点的 <strong>编号</strong> 总和。</p>
 * <p>返回 <strong>边积分</strong> 最高的节点。如果多个节点的 <strong>边积分</strong> 相同，返回编号 <strong>最小</strong> 的那个。</p>
 * <h4>示例 1：</h4>
 * <img src="https://assets.leetcode.com/uploads/2022/06/20/image-20220620195403-1.png">
 * <pre>
 *     输入：edges = [1,0,0,0,0,7,7,5]
 *     输出：7
 *     解释：
 *     - 节点 1、2、3 和 4 都有指向节点 0 的边，节点 0 的边积分等于 1 + 2 + 3 + 4 = 10 。
 *     - 节点 0 有一条指向节点 1 的边，节点 1 的边积分等于 0 。
 *     - 节点 7 有一条指向节点 5 的边，节点 5 的边积分等于 7 。
 *     - 节点 5 和 6 都有指向节点 7 的边，节点 7 的边积分等于 5 + 6 = 11 。
 *     节点 7 的边积分最高，所以返回 7 。
 * </pre>
 * <h4>示例 2：</h4>
 * <img src="https://assets.leetcode.com/uploads/2022/06/20/image-20220620200212-3.png">
 * <pre>
 *     输入：edges = [2,0,0,2]
 *     输出：0
 *     解释：
 *     - 节点 1 和 2 都有指向节点 0 的边，节点 0 的边积分等于 1 + 2 = 3 。
 *     - 节点 0 和 3 都有指向节点 2 的边，节点 2 的边积分等于 0 + 3 = 3 。
 *     节点 0 和 2 的边积分都是 3 。由于节点 0 的编号更小，返回 0 。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>n == edges.length</li>
 *     <li>2 <= n <= 10<sup>5</sup></li>
 *     <li>0 <= edges[i] < n</li>
 *     <li>edges[i] != i</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/node-with-highest-edge-score/">https://leetcode.cn/problems/node-with-highest-edge-score/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class EdgeScore_02 {

    public int edgeScore(int[] edges) {
        long length = edges.length, sum[] = new long[edges.length], max = 0;
        for (int i = 0; i < length; i++) {
            sum[edges[i]] += i;
        }
        for (int i = 1; i < length; i++) {
            max = sum[i] > sum[(int) max] ? i : max;
        }
        return (int) max;
    }

}
