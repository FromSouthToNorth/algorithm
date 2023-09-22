package vip.hyzt.questions.wc362;

import java.util.ArrayList;

/**
 * <h1>2850. 将石头分散到网格图的最少移动次数</h1>
 * <p></p>
 * <p>给你一个大小为 3 * 3 ，下标从 <strong>0</strong> 开始的二维整数矩阵 grid ，分别表示每一个格子里石头的数目。网格图中总共恰好有 9 个石头，一个格子里可能会有 <strong>多个</strong> 石头。</p>
 * <p>每一次操作中，你可以将一个石头从它当前所在格子移动到一个至少有一条公共边的相邻格子。</p>
 * <p>请你返回每个格子恰好有一个石头的 <strong>最少移动次数</strong> 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <img alt src="https://assets.leetcode.com/uploads/2023/08/23/example1-3.svg">
 * <pre>
 *     输入：grid = [[1,1,0],[1,1,1],[1,2,1]]
 *      输出：3
 *      解释：让每个格子都有一个石头的一个操作序列为：
 *      1 - 将一个石头从格子 (2,1) 移动到 (2,2) 。
 *      2 - 将一个石头从格子 (2,2) 移动到 (1,2) 。
 *      3 - 将一个石头从格子 (1,2) 移动到 (0,2) 。
 *      总共需要 3 次操作让每个格子都有一个石头。
 *      让每个格子都有一个石头的最少操作次数为 3 。
 * </pre>
 * <h2>示例 2：</h2>
 * <img alt src="https://assets.leetcode.com/uploads/2023/08/23/example2-2.svg">
 * <pre>
 *     输入：grid = [[1,3,0],[1,0,0],[1,0,3]]
 *     输出：4
 *     解释：让每个格子都有一个石头的一个操作序列为：
 *     1 - 将一个石头从格子 (0,1) 移动到 (0,2) 。
 *     2 - 将一个石头从格子 (0,1) 移动到 (1,1) 。
 *     3 - 将一个石头从格子 (2,2) 移动到 (1,2) 。
 *     4 - 将一个石头从格子 (2,2) 移动到 (2,1) 。
 *     总共需要 4 次操作让每个格子都有一个石头。
 *     让每个格子都有一个石头的最少操作次数为 4 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>grid.length == grid[i].length == 3</li>
 *     <li>0 <= grid[i][j] <= 9</li>
 *     <li>grid 中元素之和为 9 。</li>
 * </ul>
 *
 * @see <a href="https://leetcode.cn/problems/minimum-moves-to-spread-stones-over-grid/description/">https://leetcode.cn/problems/minimum-moves-to-spread-stones-over-grid/description/</a>
 * <p></p>
 * @author hy
 */
public class Topic2850MinimumMoves {

    public int minimumMoves(int[][] grid) {
        ArrayList<int[]> list1 = new ArrayList<>(), list2 = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    list1.add(new int[] { i, j });
                }
                for (int k = 1; k < grid[i][j]; k++) {
                    list2.add(new int[] { i, j });
                }
            }
        }
        return minimumMoves(0, list1, list2);
    }

    private int minimumMoves(int index, ArrayList<int[]> list1, ArrayList<int[]> list2) {
        if (index == list1.size()) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int[] temp = list1.get(index);
        for (int i = index; i < list1.size(); i++) {
            list1.set(index, list1.get(i));
            list1.set(i, temp);
            min = Math.min(min, Math.abs(list1.get(index)[0] - list2.get(index)[0])
                    + Math.abs(list1.get(index)[1] - list2.get(index)[1]) + minimumMoves(index + 1, list1, list2));
            list1.set(i, list1.get(index));
            list1.set(index, temp);
        }
        return min;
    }

}
