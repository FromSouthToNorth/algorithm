package vip.hyzt.questions;

import org.junit.Test;

public class Topic1108DefangIPaddrTests {

    @Test
    public void defangIPaddr() {
        String a = "112.1.1.1";
        String ans = Topic1108DefangIPaddr.defangIPaddr(a);
        System.out.printf("%s \n", ans);
    }

}
