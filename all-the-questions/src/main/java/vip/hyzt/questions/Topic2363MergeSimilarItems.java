package vip.hyzt.questions;

import java.util.*;

/**
 * <h3>2363. 合并相似的物品</h3>
 * <p>给你两个二维整数数组 items1 和 items2 ，表示两个物品集合。每个数组 items 有以下特质：</p>
 * <ul>
 *     <li>items[i] = [value<sub>i</sub>, weight<sub>i</sub>] 其中 value<sub>i</sub> 表示第 i 件物品的 <strong>价值</strong> ，weight<sub>i</sub> 表示第 i 件物品的 <strong>重量</strong> 。</li>
 *     <li>items 中每件物品的价值都是 <strong>唯一的</strong> 。</li>
 * </ul>
 * <p>请你返回一个二维数组 ret，其中 ret[i] = [value<sub>i</sub>, weight<sub>i</sub>]， weight<sub>i</sub> 是所有价值为 value<sub>i</sub> 物品的 <strong>重量之和</strong> 。</p>
 * <p><strong>注意：</strong>ret 应该按价值 <strong>升序</strong> 排序后返回。</p>
 * <h4>示例 1：</h4>
 * <pre>
 *     输入：items1 = [[1,1],[4,5],[3,8]], items2 = [[3,1],[1,5]]
 *     输出：[[1,6],[3,9],[4,5]]
 *     解释：
 *     value = 1 的物品在 items1 中 weight = 1 ，在 items2 中 weight = 5 ，总重量为 1 + 5 = 6 。
 *     value = 3 的物品再 items1 中 weight = 8 ，在 items2 中 weight = 1 ，总重量为 8 + 1 = 9 。
 *     value = 4 的物品在 items1 中 weight = 5 ，总重量为 5 。
 *     所以，我们返回 [[1,6],[3,9],[4,5]] 。
 * </pre>
 * <h4>示例 2：</h4>
 * <pre>
 *     输入：items1 = [[1,1],[3,2],[2,3]], items2 = [[2,1],[3,2],[1,3]]
 *     输出：[[1,4],[2,4],[3,4]]
 *     解释：
 *     value = 1 的物品在 items1 中 weight = 1 ，在 items2 中 weight = 3 ，总重量为 1 + 3 = 4 。
 *     value = 2 的物品在 items1 中 weight = 3 ，在 items2 中 weight = 1 ，总重量为 3 + 1 = 4 。
 *     value = 3 的物品在 items1 中 weight = 2 ，在 items2 中 weight = 2 ，总重量为 2 + 2 = 4 。
 *     所以，我们返回 [[1,4],[2,4],[3,4]] 。
 * </pre>
 * <h4>示例 3：</h4>
 * <pre>
 *     输入：items1 = [[1,3],[2,2]], items2 = [[7,1],[2,2],[1,4]]
 *     输出：[[1,7],[2,4],[7,1]]
 *     解释：
 *     value = 1 的物品在 items1 中 weight = 3 ，在 items2 中 weight = 4 ，总重量为 3 + 4 = 7 。
 *     value = 2 的物品在 items1 中 weight = 2 ，在 items2 中 weight = 2 ，总重量为 2 + 2 = 4 。
 *     value = 7 的物品在 items2 中 weight = 1 ，总重量为 1 。
 *     所以，我们返回 [[1,7],[2,4],[7,1]] 。
 * </pre>
 * <ul>
 *     <li>1 <= items1.length, items2.length <= 1000</li>
 *     <li>items1[i].length == items2[i].length == 2</li>
 *     <li>1 <= value<sub>i</sub>, weight<sub>i</sub> <= 1000</li>
 *     <li>items1中每个 value<sub>i</sub>都是 唯一的。</li>
 *     <li>items2中每个 value<sub>i</sub>都是 唯一的。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/merge-similar-items/">https://leetcode.cn/problems/merge-similar-items/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic2363MergeSimilarItems {

    Map<Integer, Integer> map = new TreeMap<>();

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> res = new ArrayList<>();

        buildMap(items1);
        buildMap(items2);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> item = new ArrayList<>();
            item.add(entry.getKey());
            item.add(entry.getValue());
            res.add(item);
        }

        return res;
    }

    void buildMap(int[][] items) {
        for (int[] item : items) {
            int value = item[1];
            map.put(item[0], map.getOrDefault(item[0], 0) + value);
        }
    }

}
