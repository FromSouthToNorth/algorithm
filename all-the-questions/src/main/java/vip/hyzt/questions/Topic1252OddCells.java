package vip.hyzt.questions;

/**
 * <h3>1252. 奇数值单元格的数目</h3>
 * @see <a href="https://leetcode.cn/problems/cells-with-odd-values-in-a-matrix/">https://leetcode.cn/problems/cells-with-odd-values-in-a-matrix/</a>
 * @author hy
 */
public class Topic1252OddCells {

    public static int oddCells(int m, int n, int[][] indices) {
        int[] r = new int[m];
        int[] c = new int[n];
        for (int[] index : indices) {
            r[index[0]]++;
            c[index[1]]++;
        }
        int dx = 0, dy = 0;
        for (int i = 0; i < m || i < n; i++) {
            if (i < m && (r[i] & 1) != 0) {
                dx++;
            }
            if (i < n && (c[i] & 1) != 0) {
                dy++;
            }
        }
        return dx * (n - dy) + (m - dx) * dy;
    }

}
