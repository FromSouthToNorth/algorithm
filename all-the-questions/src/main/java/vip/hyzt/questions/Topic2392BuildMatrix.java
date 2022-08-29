package vip.hyzt.questions;

import java.util.ArrayList;

/**
 * <h2>2392. 给定条件下构造矩阵</h2>
 * <p>给你一个 <strong>正</strong> 整数 k ，同时给你：</p>
 * <ul>
 *     <li>一个大小为 n 的二维整数数组 rowConditions ，其中 rowConditions[i] = [above<sub>i</sub>, below<sub>i</sub>] 和</li>
 *     <li>一个大小为 m 的二维整数数组 colConditions ，其中 colConditions[i] = [left<sub>i</sub>, right<sub>i</sub>] </li>
 * </ul>
 * <p>两个数组里的整数都是 1 到 k 之间的数字。</p>
 * <p>你需要构造一个 k x k 的矩阵，1 到 k 每个数字需要 <strong>恰好出现一次</strong> 。剩余的数字都是 0 。</p>
 * <p>矩阵还需要满足以下条件：</p>
 * <ul>
 *     <li>对于所有 0 到 n - 1 之间的下标 i ，数字 above<sub>i</sub> 所在的 <strong>行</strong> 必须在数字 below<sub>i</sub> 所在行的上面。</li>
 *     <li>对于所有 0 到 m - 1 之间的下标 i ，数字 left<sub>i</sub> 所在的 <strong>列</strong> 必须在数字 right<sub>i</sub> 所在列的左边。</li>
 * </ul>
 * <p>返回满足上述要求的 <strong>任意</strong> 矩阵。如果不存在答案，返回一个空的矩阵。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：k = 3, rowConditions = [[1,2],[3,2]], colConditions = [[2,1],[3,2]]
 *     输出：[[3,0,0],[0,0,1],[0,2,0]]
 *     解释：上图为一个符合所有条件的矩阵。
 *     行要求如下：
 *     - 数字 1 在第 1 行，数字 2 在第 2 行，1 在 2 的上面。
 *     - 数字 3 在第 0 行，数字 2 在第 2 行，3 在 2 的上面。
 *     列要求如下：
 *     - 数字 2 在第 1 列，数字 1 在第 2 列，2 在 1 的左边。
 *     - 数字 3 在第 0 列，数字 2 在第 1 列，3 在 2 的左边。
 *     注意，可能有多种正确的答案。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：k = 3, rowConditions = [[1,2],[2,3],[3,1],[2,3]], colConditions = [[2,1]]
 *     输出：[]
 *     解释：由前两个条件可以得到 3 在 1 的下面，但第三个条件是 3 在 1 的上面。
 *     没有符合条件的矩阵存在，所以我们返回空矩阵。
 * </pre>
 * <ul>
 *     <li>2 <= k <= 400</li>
 *     <li>1 <= rowConditions.length, colConditions.length <= 10<sup>4</sup></li>
 *     <li>rowConditions[i].length == colConditions[i].length == 2</li>
 *     <li>1 <= above<sub>i</sub>, below<sub>i</sub>, left<sub>i</sub>, right<sub>i</sub> <= k</li>
 *     <li>above<sub>i</sub> != below<sub>i</sub></li>
 *     <li>left<sub>i</sub> != right<sub>i</sub></li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/build-a-matrix-with-conditions">https://leetcode.cn/problems/build-a-matrix-with-conditions</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2392BuildMatrix {

    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        ArrayList<Integer> row = buildMatrix(k, rowConditions), col = buildMatrix(k, colConditions);
        if (row.size() < k || col.size() < k) {
            return new int[0][];
        }
        int[] map = new int[k + 1], result[] = new int[k][k];
        for (int i = 0; i < k; i++) {
            map[row.get(i)] = i;
        }
        for (int i = 0; i < k; i++) {
            result[map[col.get(i)]][i] = col.get(i);
        }
        return result;
    }

    private ArrayList<Integer> buildMatrix(int k, int[][] conditions) {
        ArrayList<Integer> graph[] = new ArrayList[k + 1], list = new ArrayList<>(), result = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            graph[i] = new ArrayList<>();
        }
        int[] count = new int[k + 1];
        for (int[] condition : conditions) {
            graph[condition[0]].add(condition[1]);
            count[condition[1]]++;
        }
        for (int i = 1; i <= k; i++) {
            if (count[i] == 0) {
                list.add(i);
            }
        }
        while (!list.isEmpty()) {
            result.add(list.remove(list.size() - 1));
            for (int i : graph[result.get(result.size() - 1)]) {
                if (--count[i] == 0) {
                    list.add(i);
                }
            }
        }
        return result;
    }

}
