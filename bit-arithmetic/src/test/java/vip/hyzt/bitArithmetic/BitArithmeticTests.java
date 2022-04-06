package vip.hyzt.bitArithmetic;

import org.junit.Test;

public class BitArithmeticTests {

    @Test
    public void shiftLeft() {
        int num = BitArithmetic.shiftLeft(-5, 2);
        System.out.println(num);
    }

    @Test
    public void shiftRight() {
        int num = BitArithmetic.shiftRight(-5, 2);
        System.out.println(num);
    }

    @Test
    public void unsignedShiftRight() {
        int num = BitArithmetic.unsignedShiftRight(-5, 2);
        System.out.println(num);
    }

}
