package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>386. 字典序排数</h3>
 * <p>给你一个整数 n ，按字典序返回范围 [1, n] 内所有整数。</p>
 * <p>你必须设计一个时间复杂度为 O(n) 且使用 O(1) 额外空间的算法。</p>
 * <p><b>示例 1：</b></p>
 * <pre>
 *     <strong>输入：</strong>n = 13
 *     <strong>输出：</strong>[1,10,11,12,13,2,3,4,5,6,7,8,9]
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong> n = 2
 *     <strong>输出：</strong>[1,2]
 * </pre>
 * <p><b>提示：</b></p>
 * <li>1 <= n <= 5 * 10<sup>4</sup></li>
 * @see <a href="https://leetcode-cn.com/problems/lexicographical-numbers">链接：https://leetcode-cn.com/problems/lexicographical-numbers</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic386LexicalOrder {

    static List<Integer> ANS = new ArrayList<>();


    public static List<Integer> lexicalOrder(int n) {
        for (int i = 1; i <= 9; i++)  dfs(i, n);
        return ANS;
    }

    public static void dfs(int cur, int limit) {
        if (cur > limit) return;
        ANS.add(cur);
        for (int i = 0; i <= 9; i++) dfs(cur * 10 + i, limit);
    }

    public static List<Integer> lexicalOrder2(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0, j = 1; i < n; i++) {
            ans.add(j);
            if (j * 10 <= n) {
                j *= 10;
            }
            else {
                while (j % 10 == 9 || j + 1 > n) j /= 10;
                j++;
            }
        }
        return ans;
    }

}
