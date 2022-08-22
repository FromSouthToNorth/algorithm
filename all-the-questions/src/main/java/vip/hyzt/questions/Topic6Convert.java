package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h3>6. Z 字形变换</h3>
 * <p>将一个给定字符串 `s` 根据给定的行数 `numRows` ，以从上往下、从左到右进行 `Z` 字形排列。</p>
 * <p>比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：</p>
 * <pre>
 *     P   A   H   N
 *     A P L S I I G
 *     Y   I   R
 * </pre>
 * <p>之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。</p>
 * <p>请你实现这个将字符串进行指定行数变换的函数：</p>
 * <pre>
 *     string convert(string s, int numRows);
 * </pre>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：s = "PAYPALISHIRING", numRows = 3
 *     输出："PAHNAPLSIIGYIR"
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：s = "PAYPALISHIRING", numRows = 4
 *     输出："PINALSIGYAHRPI"
 *     解释：
 *     P     I    N
 *     A   L S  I G
 *     Y A   H R
 *     P     I
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：s = "A", numRows = 1
 *     输出："A"
 * </pre>
 * <h3>提示：</h3>
 * <li>1 <= s.length <= 1000</li>
 * <li>s 由英文字母（小写和大写）、',' 和 '.' 组成</li>
 * <li>1 <= numRows <= 1000</li>
 * @see <a href="https://leetcode.cn/problems/zigzag-conversion"> 链接：https://leetcode.cn/problems/zigzag-conversion</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic6Convert {

    static int N = 1010;
    static char[][] g = new char[N][N];
    static int[] idxs = new int[N];

    public static String convert(String s, int m) {
        if (m == 1) return s;
        int n = s.length();
        Arrays.fill(idxs, 0);
        for (int i = 0, j = 0, k = 1; i < n; i++) {
            g[j][idxs[j]++] = s.charAt(i);
            j += k;
            if (j < 0) {
                j += 2; k = 1;
            }
            else if (j == m) {
                j -= 2; k = -1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < idxs[i]; j++) {
                sb.append(g[i][j]);
            }
        }
        return sb.toString();
    }
}
