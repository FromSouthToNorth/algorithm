package vip.hyzt.questions;

import org.junit.Test;

public class Topic1805NumDifferentIntegersTests {

    @Test
    public void numDifferentIntegers() {
        Topic1805NumDifferentIntegers topic1805NumDifferentIntegers = new Topic1805NumDifferentIntegers();
        System.out.printf("res: %d\n", topic1805NumDifferentIntegers.numDifferentIntegers("a123bc34d8ef34"));
        System.out.printf("res: %d\n", topic1805NumDifferentIntegers.numDifferentIntegers("leet1234code234"));
        System.out.printf("res: %d\n", topic1805NumDifferentIntegers.numDifferentIntegers("a1b01c001"));
        System.out.printf("res: %d\n", topic1805NumDifferentIntegers.numDifferentIntegers("a001b010001c0010000"));
    }

}
