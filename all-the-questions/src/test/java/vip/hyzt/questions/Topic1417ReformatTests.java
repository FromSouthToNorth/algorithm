package vip.hyzt.questions;

import org.junit.Test;

public class Topic1417ReformatTests {

    @Test
    public void reformat() {
        String s1 = "a0b1c2";
        Topic1417Reformat topic1417Reformat = new Topic1417Reformat();
        System.out.println(topic1417Reformat.reformat(s1));
        String s2 = "leetcode";
        System.out.println(topic1417Reformat.reformat(s2));
        String s3 = "1224566789";
        System.out.println(topic1417Reformat.reformat(s3));
        String s4 = "covid2019";
        System.out.println(topic1417Reformat.reformat(s4));
    }

}
