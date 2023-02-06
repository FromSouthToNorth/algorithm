package vip.hyzt.questions;

/**
 * <h1>2550. 猴子碰撞的方法数</h1>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-collisions-of-monkeys-on-a-polygon/description/">https://leetcode.cn/problems/count-collisions-of-monkeys-on-a-polygon/description/</a>
 */
public class Topic2550MonkeyMove {

    public int monkeyMove(int n) {
        int mod = (int) 1e9 + 7;
        long res = 1;
        long v = 2;
        while (n > 0) {
            int t = (n & 1);
            if (t == 1) {
                res = res * v % mod;
            }
            v = v * v % mod;
            n = n >> 1;
        }
        res = (res - 2 + mod) % mod;
        return (int) res;
    }

}
