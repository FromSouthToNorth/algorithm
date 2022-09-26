package vip.hyzt.algebra.multiply;

/**
 * <h2>快速幂</h2>
 * <p>x<sup>y</sup> mod m</p>
 * <h3>示例1：</h3>
 * <pre>
 *     输入：x=2, y=10, m=9
 *     输出：7
 *     解释：2<sup>10</sup> % 9 = 7
 * </pre>
 * @author hy
 */
public class FastPower {

    public int recursion(int x, int y, int m) {
        if (y == 0) {
            return 1 % m;
        }
        int half = recursion(x, y / 2, m);
        int res = (half * half) % m;
        if ((y & 1) == 1) {
            res *= x % m;
        }
        return res;
    }

    public int iterate(int x, int y, int m) {
        int res = 1 % m;
        while (y > 0) {
            if ((y & 1) == 1) {
                res *= x % m;
            }
            x *= x % m;
            y >>= 1;
        }
        return res % m;
    }

}
