package vip.hyzt.questions;

import java.util.*;

/**
 * <h3>1345. 跳跃游戏 IV</h3>
 *
 * <p>给你一个整数数组arr，你一开始在数组的第一个元素处（下标为 0）。</p>
 *
 * <p>每一步，你可以从下标i跳到下标：</p>
 * <ul>
 *     <li>i + 1满足：i + 1 < arr.length</li>
 *     <li>i - 1满足：i - 1 >= 0</li>
 *     <li>j满足：arr[i] == arr[j]且i != j</li>
 * </ul>
 *
 * <p>请你返回到达数组最后一个元素的下标处所需的最少操作次数。</p>
 *
 * <p>注意：任何时候你都不能跳到数组外面。</p>
 *
 * <p>示例 1：</p>
 * <pre>
 *     <strong>输入：</strong>arr = [100,-23,-23,404,100,23,23,23,3,404]
 *     <strong>输出：</strong>3
 *     <strong>解释：</strong>那你需要跳跃 3 次，下标依次为 0 --> 4 --> 3 --> 9 。下标 9 为数组的最后一个元素的下标。
 * </pre>
 *
 * <p>示例 2：</p>
 * <pre>
 *     <strong>输入：</strong>arr = [7,6,9,6,9,6,9,7]
 *     <strong>输出：</strong>1
 *     <strong>解释：</strong>你可以直接从下标 0 处跳到下标 7 处，也就是数组的最后一个元素处。
 * </pre>
 *
 * <p>示例 3：</p>
 * <pre>
 *     <strong>输入：</strong>arr = [7]
 *     <strong>输出：</strong>0
 *     <strong>解释：</strong>一开始就在最后一个元素处，所以你不需要跳跃。
 * </pre>
 *
 * <p>示例 4：</p>
 * <pre>
 *     <strong>输入：</strong>arr = [6,1,9]
 *     <strong>输出：</strong>2
 * </pre>
 *
 * <p>示例 5：</p>
 * <pre>
 *     <strong>输入：</strong>arr = [11,22,7,7,7,7,7,7,7,22,13]
 *     <strong>输出：</strong>3
 * </pre>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * <a href="https://leetcode-cn.com/problems/jump-game-iv">链接：https://leetcode-cn.com/problems/jump-game-iv</a>
 */
public abstract class Topic1345MinJumps {

    public static int minJumps(int[] arr) {
        Map<Integer, List<Integer>> idxSameValue = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            idxSameValue.putIfAbsent(arr[i], new ArrayList<>());
            idxSameValue.get(arr[i]).add(i);
        }
        Set<Integer> visitedIndex = new HashSet<>();
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {0, 0});
        visitedIndex.add(0);
        while (!queue.isEmpty()) {
            int[] idxStep = queue.poll();
            int idx = idxStep[0], step = idxStep[1];
            if (idx == arr.length - 1) {
                return step;
            }
            int v = arr[idx];
            step++;
            if (idxSameValue.containsKey(v)) {
                for (int i : idxSameValue.get(v)) {
                    if (visitedIndex.add(i)) {
                        queue.offer(new int[] {i, step});
                    }
                }
                idxSameValue.remove(v);
            }
            if (idx + 1 < arr.length && visitedIndex.add(idx + 1)) {
                queue.offer(new int[] {idx + 1, step});
            }
            if (idx - 1 >= 0 && visitedIndex.add(idx - 1)) {
                queue.offer(new int[] {idx - 1, step});
            }
        }
        return -1;
    }

}
