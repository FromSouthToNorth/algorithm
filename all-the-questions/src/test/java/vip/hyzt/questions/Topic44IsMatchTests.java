package vip.hyzt.questions;

import org.junit.Test;

public class Topic44IsMatchTests {

    @Test
    public void isMatch() {
        Topic44IsMatch topic44IsMatch = new Topic44IsMatch();
        System.out.printf("res: %b\n", topic44IsMatch.isMatch("aa", "??"));
        System.out.printf("res: %b\n", topic44IsMatch.isMatch("aa", "*"));
        System.out.printf("res: %b\n", topic44IsMatch.isMatch("aac", "ca?"));
        System.out.printf("res: %b\n", topic44IsMatch.isMatch("aa", "a"));
        System.out.printf("res: %b\n", topic44IsMatch.isMatch("aacss", "a*???"));
        System.out.printf("res: %b\n", topic44IsMatch.isMatch("aacss", "a*ca?"));
    }

}
