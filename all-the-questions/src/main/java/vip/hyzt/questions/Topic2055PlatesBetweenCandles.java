package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>2055. 蜡烛之间的盘子</h3>
 * <p>
 *     给你一个长桌子，桌子上盘子和蜡烛排成一列。给你一个下标从 <b>0</b> 开始的字符串<code>s</code>，它只包含字符'*' 和'|'，其中'*'表示一个 盘子，'|'表示一支蜡烛。
 * </p>
 * <p>
 *     同时给你一个下标从 0 开始的二维整数数组 queries，其中queries[i] = [lefti, righti]表示 子字符串 s[lefti...righti]（包含左右端点的字符）。
 *     对于每个查询，你需要找到 子字符串中 在 两支蜡烛之间的盘子的 数目。
 *     如果一个盘子在 子字符串中左边和右边 都至少有一支蜡烛，那么这个盘子满足在 两支蜡烛之间。
 * </p>
 * <ul>
 *     <li>比方说，s = "||**||**|*"，查询[3, 8]，表示的是子字符串"*||**|"。子字符串中在两支蜡烛之间的盘子数目为 2，子字符串中右边两个盘子在它们左边和右边 都 至少有一支蜡烛
 * </ul>
 * <b>示例 1：</b>
 * <div><img src="https://assets.leetcode.com/uploads/2021/10/04/ex-1.png" /></div>
 * <pre>
 *     <strong>输入：</strong> s = "**|**|***|", queries = [[2,5],[5,9]]
 *     <strong>输出：</strong> [2,3]
 *     <strong>解释：</strong>
 *      - queries[0] 有两个盘子在蜡烛之间。
 *      - queries[1] 有三个盘子在蜡烛之间。
 * </pre>
 * <b>示例 2：</b>
 * <div><img src="https://assets.leetcode.com/uploads/2021/10/04/ex-2.png" /></div>
 * <pre>
 *     <strong>输入：</strong> s = "***|**|*****|**||**|*", queries = [[1,17],[4,5],[14,17],[5,11],[15,16]]
 *     <strong>输出：</strong> [9,0,0,0,0]
 *     <strong>解释：</strong>
 *     - queries[0] 有 9 个盘子在蜡烛之间。
 *     - 另一个查询没有盘子在蜡烛之间。
 * </pre>
 * @author 力扣（LeetCode）
 * @see <a href="https://leetcode-cn.com/problems/plates-between-candles">2055. 蜡烛之间的盘子</a>
 */
public abstract class Topic2055PlatesBetweenCandles {

    public static int[] platesBetweenCandles1(String s, int[][] queries) {
        char[] cs = s.toCharArray();
        int n = cs.length, m = queries.length;
        int[] ans = new int[m], sum = new int[n + 1];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (cs[i] == '|') {
                list.add(i);
            }
            sum[i + 1] = sum[i] + (cs[i] == '*' ? 1 :0);
        }
        if (list.size() == 0) {
            return ans;
        }
        for (int i = 0; i < m; i++) {
            int a = queries[i][0], b = queries[i][1];
            int c, d;
            // 找到 a 右边最近的蜡烛
            int l = 0, r = list.size() - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (list.get(mid) >= a) {
                    r = mid;
                }
                else {
                    l = mid + 1;
                }
            }
            if (list.get(r) >= a) {
                c = list.get(r);
            }
            else {
                continue;
            }
            // 找到 b 左边最近的蜡烛
            l = 0; r = list.size() - 1;
            while (l < r) {
                int mid = l + r + 1 >> 1;
                if (list.get(mid) <= b) {
                    l = mid;
                }
                else {
                    r = mid - 1;
                }
            }
            if (list.get(r) <= b) {
                d = list.get(r);
            }
            else {
                continue;
            }
            if (c <= d) {
                ans[i] = sum[d + 1] - sum[c];
            }
        }
        return ans;
    }

    public static int[] platesBetweenCandles2(String s, int[][] queries) {
        char[] cs = s.toCharArray();
        int n = cs.length, m = queries.length;
        int[] l = new int[n], r = new int[n];
        int[] sum = new int[n + 1];
        for (int i = 0, j = n - 1, p = -1, q = -1; i < n; i++, j--) {
            if (cs[i] == '|') {
                p = i;
            }
            if (cs[j] == '|') {
                q = j;
            }
            l[i] = p; r[j] = q;
            sum[i + 1] = sum[i] + (cs[i] == '*' ? 1 : 0);
        }
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int a = queries[i][0], b = queries[i][1];
            int c = r[a], d = l[b];
            if (c != -1 && c <= d) {
                ans[i] = sum[d + 1] - sum[c];
            }
        }
        return ans;
    }

}
