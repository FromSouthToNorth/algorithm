package vip.hyzt.questions.wc337;

import org.junit.Test;

public class Topic2597BeautifulSubsetsTests {

    @Test
    public void beautifulSubsets() {
        Topic2597BeautifulSubsets topic2597BeautifulSubsets = new Topic2597BeautifulSubsets();
        System.out.printf("res: %d\n", topic2597BeautifulSubsets.beautifulSubsets(new int[] { 2, 4, 6 }, 2));
        System.out.printf("res: %d\n", topic2597BeautifulSubsets.beautifulSubsets(new int[] { 1 }, 1));
        System.out.printf("res: %d\n", topic2597BeautifulSubsets.beautifulSubsets(new int[] { 10, 4, 5, 7, 2, 1 }, 5));
    }

}
