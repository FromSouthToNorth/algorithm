package vip.hyzt.questions;

import org.junit.Test;

public class Topic1460CanBeEqualTests {

    @Test
    public void canBeEqual() {
        int[] target = new int[] {7,7,7,7};
        int[] arr    = new int[] {7,7,7,7};
        boolean ans  = Topic1460CanBeEqual.canBeEqual1(target, arr);
        System.out.printf("%b\n", ans);
    }
}
