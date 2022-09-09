package vip.hyzt.questions;

import org.junit.Test;

public class Topic1598MinOperationsTests {

    @Test
    public void minOperations() {
        Topic1598MinOperations topic1598MinOperations = new Topic1598MinOperations();
        String[] logs = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
        System.out.printf("res: \n", topic1598MinOperations.minOperations(logs));
    }

}
