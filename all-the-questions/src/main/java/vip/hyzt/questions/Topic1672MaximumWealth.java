package vip.hyzt.questions;

/**
 * <h3>1672. 最富有客户的资产总量</h3>
 * <p>给你一个 `m x n` 的整数网格 `accounts` ，其中 `accounts[i][j]` 是第 `i` 位客户在第 `j` 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。</p>
 * <p>客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。</p>
 * <p><b>示例 1：</b></p>
 * <pre>
 *     <strong>输入：</strong>accounts = [[1,2,3],[3,2,1]]
 *     <strong>输出：</strong>6
 *     <strong>解释：</strong>
 *     第 1 位客户的资产总量 = 1 + 2 + 3 = 6
 *     第 2 位客户的资产总量 = 3 + 2 + 1 = 6
 *     两位客户都是最富有的，资产总量都是 6 ，所以返回 6 。
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong>accounts = [[1,5],[7,3],[3,5]]
 *     <strong>输出：</strong>10
 *     <strong>解释：</strong>
 *     第 1 位客户的资产总量 = 6
 *     第 2 位客户的资产总量 = 10
 *     第 3 位客户的资产总量 = 8
 *     第 2 位客户是最富有的，资产总量是 10
 * </pre>
 * <p><b>示例 3：</b></p>
 * <pre>
 *     <strong>输入：</strong>accounts = [[2,8,7],[7,1,3],[1,9,5]]
 *     <strong>输出：</strong>17
 * </pre>
 * <p><b>提示：</b></p>
 * <ul>
 *     <li>m == accounts.length</li>
 *     <li>n == accounts[i].length</li>
 *     <li>1 <= m, n <= 50</li>
 *     <li>1 <= accounts[i][j] <= 100</li>
 * </ul>
 * @see <a href="https://leetcode-cn.com/problems/richest-customer-wealth">https://leetcode-cn.com/problems/richest-customer-wealth</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public abstract class Topic1672MaximumWealth {

    public static int maximumWealth(int[][] accounts) {
        int row = accounts[0].length, ans = 0;
        for (int[] account : accounts) {
            int cur = 0;
            for (int j = 0; j < row; j++) {
                cur += account[j];
            }
            ans = Math.max(cur, ans);
        }
        return ans;
    }

}
