package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic942DiStringMatchTests {

    @Test
    public void diStringMatch() {
        String s = "IDID";
        int[] ans = Topic942DiStringMatch.diStringMatch(s);
        System.out.println(Arrays.toString(ans));
    }

}
