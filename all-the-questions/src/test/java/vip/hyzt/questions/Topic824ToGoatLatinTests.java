package vip.hyzt.questions;

import org.junit.Test;

public class Topic824ToGoatLatinTests {

    @Test
    public void toGoatLatin() {
        String sentence  = "I speak Goat Latin";
        String ans = Topic824ToGoatLatin.toGoatLatin(sentence );
        System.out.printf("%s \n", ans);
    }

}
