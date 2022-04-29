package vip.hyzt.questions;

import org.junit.Test;

public class Topic1036IsEscapePossibleTests {

    @Test
    public void isEscapePossible() {
        int[][] blocked = new int[][] {{0, 1}, {1, 0}};
        int[] source = new int[]{0, 0};
        int[] target = new int[] {0, 2};
        boolean escapePossible = Topic1036IsEscapePossible.isEscapePossible(blocked, source, target);
        System.out.println(escapePossible);
    }

}
