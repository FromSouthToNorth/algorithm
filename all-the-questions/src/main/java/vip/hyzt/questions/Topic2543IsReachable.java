package vip.hyzt.questions;

import java.math.BigInteger;

/**
 * <h1>2543. 判断一个点是否可以到达</h1>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/check-if-point-is-reachable/">https://leetcode.cn/problems/check-if-point-is-reachable/</a>
 */
public class Topic2543IsReachable {

    public boolean isReachable(int targetX, int targetY) {
//        int gcd = gcd(targetX, targetY);
//        while (gcd % 2 == 0) {
//            gcd /= 2;
//        }
//        return gcd == 1;

        return BigInteger.valueOf(targetX).gcd(BigInteger.valueOf(targetY)).bitCount() == 1;
    }

    private int gcd(int a, int b) {
        if (a <= b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

}
