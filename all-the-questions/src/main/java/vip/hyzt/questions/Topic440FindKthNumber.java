package vip.hyzt.questions;

/**
 * <h3>440. 字典序的第K小数字</h3>
 * <p>给定整数 <code>n</code> 和 <code>k</code>，返回<code>[1, n]</code> 中字典序第 <code>k</code> 小的数字</p>
 * <p><b>示例 1：</b></p>
 * <pre>
 *     <strong>输入: </strong>n = 13, k = 2
 *     <strong>输出: </strong>10
 *     <strong>解释: </strong>字典序的排列是 [1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9]，所以第二小的数字是 10。
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入: </strong>n = 1, k = 1
 *     <strong>输出: </strong>1
 * </pre>
 *
 * @author LeetCode
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/k-th-smallest-in-lexicographical-order/">440. 字典序的第K小数字</a>
 */
public abstract class Topic440FindKthNumber {

    public static int findKthNumber(int n, int k) {
        int ans = 1;
        while (k > 1) {
            int cnt = getCnt(ans, n);
            if (cnt < k) {
                k -= cnt;
                ans++;
            }
            else {
                k--;
                ans *= 10;
            }
        }
        return ans;
    }

    static int getCnt(int x, int limit) {
        String a = String.valueOf(x), b = String.valueOf(limit);
        int n = a.length(), m = b.length(), k = m - n;
        int ans = 0, u = Integer.parseInt(b.substring(0, n));
        for (int i = 0; i < k; i++) {
            ans += Math.pow(10, i);
        }
        if (u > x) {
            ans += Math.pow(10, k);
        }
        else if (u == x) {
            ans += limit - x * Math.pow(10, k) + 1;
        }
        return ans;
    }


}
