package vip.hyzt.questions;

import org.junit.Test;

public class Topic1945GetLuckyTests {

    @Test
    public void getLucky() {
        Topic1945GetLucky topic1945GetLucky = new Topic1945GetLucky();
        System.out.printf("res: %d\n", topic1945GetLucky.getLucky("iiii", 1));
        System.out.printf("res: %d\n", topic1945GetLucky.getLucky("leetcode", 2));
        System.out.printf("res: %d\n", topic1945GetLucky.getLucky("zbax", 2));
        System.out.printf("res: %d\n", topic1945GetLucky.getLucky("zzbscscba", 3));
    }

}
