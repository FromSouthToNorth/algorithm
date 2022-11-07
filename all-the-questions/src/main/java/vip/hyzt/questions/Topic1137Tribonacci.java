package vip.hyzt.questions;

/**
 * <h3>1137. 第 N 个泰波那契数</h3>
 * <p>泰波那契序列 Tn 定义如下： </p>
 * <p>T<sub>0</sub> = 0, T<sub>1</sub> = 1, T<sub>2</sub> = 1, 且在 n >= 0 的条件下 T<sub>n+3</sub> = T<sub>n</sub> + T<sub>n+1</sub> + T<sub>n+2</sub></p>
 * <p>给你整数 n，请返回第 n 个泰波那契数 Tn 的值。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：n = 4
 *     输出：4
 *     解释：
 *     T_3 = 0 + 1 + 1 = 2
 *     T_4 = 1 + 1 + 2 = 4
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：n = 25
 *     输出：1389537
 * </pre>
 * <h3>提示：</h3>
 * <li>0 <= n <= 37</li>
 * <li>答案保证是一个 32 位整数，即 answer <= 2^31 - 1。</li>
 * @see <a href="https://leetcode.cn/problems/n-th-tribonacci-number/">https://leetcode.cn/problems/n-th-tribonacci-number/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1137Tribonacci {

    public static int tribonacci1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 0, b = 1, c = 1;
        for (int i = 3; i <= n; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }

    static int[] cache = new int[40];
    public static int tribonacci2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n ==1 || n == 2) {
            return 1;
        }
        if (cache[n] != 0) {
            return cache[n];
        }
        cache[n] = tribonacci2(n - 1) + tribonacci2(n - 2) + tribonacci2(n - 3);
        return cache[n];
    }

    static {
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 1;
        for (int i = 3; i < cache.length; i++) {
            cache[i] = cache[i - 1] + cache[i - 2] + cache[i - 3];
        }
    }
    public static int tribonacci4(int n) {
        return cache[n];
    }

    static int N = 3;
    static int[][] mul(int[][] a, int [][] b) {
        int[][] c = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                c[i][j] = a[i][0] + a[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
            }
        }
        return c;
    }
    public static int tribonacci3(int n) {
        if (n == 0 ) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int[][] ans = new int[][] {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        int[][] mat = new int[][] {
                {1,1,1},
                {1,0,0},
                {0,1,0}
        };
        int k = n - 2;
        while (k != 0) {
            if ((k & 1) != 0) {
                ans = mul(ans, mat);
            }
            mat = mul(mat, mat);
            k >>= 1;
        }
        return ans[0][0] + ans[0][1];
    }

}
