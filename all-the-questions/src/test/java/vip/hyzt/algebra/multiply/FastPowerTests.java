package vip.hyzt.algebra.multiply;

import org.junit.Test;

/**
 * <h2>快速幂</h2>
 * <p>快速幂是倍增最常见的引用场景</p>
 * @author hy
 */
public class FastPowerTests {

    @Test
    public void recursion() {
        FastPower fastPower = new FastPower();
        System.out.printf("res: %d\n", fastPower.recursion(2, 10, 9));
        System.out.printf("res: %d\n", fastPower.iterate(2, 10, 9));
    }

}
