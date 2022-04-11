package vip.hyzt.bitArithmetic;

import org.junit.Test;

public class BitArithmeticTests {

    @Test
    public void shiftLeft() {
        System.out.println("5 << 1 = " + BitArithmetic.shiftLeft(5, 1));
        System.out.println("-5 << 2 = " + BitArithmetic.shiftLeft(-5, 2));
    }

    @Test
    public void shiftRight() {
        System.out.println("5 >> 1 = " + BitArithmetic.shiftRight(5, 1));
        System.out.println("-5 >> 2 = " + BitArithmetic.shiftRight(-5, 2));
    }

    @Test
    public void unsignedShiftRight() {
        System.out.println("-5 >>> 2 = " + BitArithmetic.unsignedShiftRight(-5, 2));
    }

    @Test
    public void bitAnd() {
        System.out.println("5 & 3 = " + BitArithmetic.bitAnd(5, 3));
        System.out.println("4 & 3 = " + BitArithmetic.bitAnd(4, 3));
        System.out.println("6 & 4 = " + BitArithmetic.bitAnd(6, 4));
    }

    @Test
    public void bitOr() {
        System.out.println("5 | 3 = " + BitArithmetic.bitOr(5, 3));
        System.out.println("9 | 8 = " + BitArithmetic.bitOr(9, 8));
        System.out.println("4 | 8 = " + BitArithmetic.bitOr(4, 8));
    }

    @Test
    public void bitXOR() {
        System.out.println("5 ^ 3 = " + BitArithmetic.bitXOR(5, 3));
        System.out.println("9 ^ 4 = " + BitArithmetic.bitXOR(9, 4));
        System.out.println("1 ^ 1 = " + BitArithmetic.bitXOR(1, 1));
    }

    @Test
    public void bitNot() {
        System.out.println("~5 = " + BitArithmetic.bitNot(5));
        System.out.println("~9 = " + BitArithmetic.bitNot(9));
        System.out.println("~1 = " + BitArithmetic.bitNot(1));
    }

}
