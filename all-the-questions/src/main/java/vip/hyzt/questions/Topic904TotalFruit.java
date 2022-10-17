package vip.hyzt.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>904. 水果成篮</h1>
 * <p>你正在探访一家农场，农场从左到右种植了一排果树。这些树用一个整数数组 fruits 表示，其中 fruits[i] 是第 i 棵树上的水果 <strong>种类</strong> 。</p>
 * <p>你想要尽可能多地收集水果。然而，农场的主人设定了一些严格的规矩，你必须按照要求采摘水果：</p>
 * <ul>
 *     <li>你只有 <strong>两个</strong> 篮子，并且每个篮子只能装 <strong>单一类型</strong> 的水果。每个篮子能够装的水果总量没有限制。</li>
 *     <li>你可以选择任意一棵树开始采摘，你必须从 <strong>每棵</strong> 树（包括开始采摘的树）上 <strong>恰好摘一个水果</strong> 。采摘的水果应当符合篮子中的水果类型。每采摘一次，你将会向右移动到下一棵树，并继续采摘。</li>
 *     <li>一旦你走到某棵树前，但水果不符合篮子的水果类型，那么就必须停止采摘。</li>
 * </ul>
 * <p>给你一个整数数组 fruits ，返回你可以收集的水果的 <strong>最大</strong> 数目。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：fruits = <em>[<strong>1,2,1</strong>]</em>
 *     输出：3
 *     解释：可以采摘全部 3 棵树。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：fruits = [1,2,<em><strong>3,2,2</strong></em>]
 *     输出：4
 *     解释：可以采摘 [2,3,2,2] 这四棵树。
 *     如果从第一棵树开始采摘，则只能采摘 [1,2] 这两棵树。
 * </pre>
 * <h2>示例 4：</h2>
 * <pre>
 *     输入：fruits = [3,3,3,<em><strong>1,2,1,1,2</strong></em>,3,3,4]
 *     输出：5
 *     解释：可以采摘 [1,2,1,1,2] 这五棵树。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= fruits.length <= 10<sup>5</sup></li>
 *     <li>0 <= fruits[i] < fruits.length</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/fruit-into-baskets/description/">https://leetcode.cn/problems/fruit-into-baskets/description/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic904TotalFruit {

    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, res = 0;
        for (int right = 0; right < n; right++) {
            int r = fruits[right];
            map.put(r, map.getOrDefault(r, 0) + 1);
            while (map.size() > 2) {
                int l = fruits[left];
                map.put(l, map.get(l) - 1);
                if (map.get(l) == 0) {
                    map.remove(l);
                }
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }

}
