package vip.hyzt.questions;

import org.junit.Test;

public class Topic1759CountHomogenousTests {

    @Test
    public void countHomogenous() {
        Topic1759CountHomogenous topic1759CountHomogenous = new Topic1759CountHomogenous();
        System.out.printf("res: %d\n", topic1759CountHomogenous.countHomogenous("abbcccaa"));
        System.out.printf("res: %d\n", topic1759CountHomogenous.countHomogenous("xy"));
        System.out.printf("res: %d\n", topic1759CountHomogenous.countHomogenous("zzzzz"));
    }

}
