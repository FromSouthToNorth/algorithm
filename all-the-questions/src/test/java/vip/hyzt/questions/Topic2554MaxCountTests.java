package vip.hyzt.questions;

import org.junit.Test;

public class Topic2554MaxCountTests {

    @Test
    public void maxCount() {
        Topic2554MaxCount topic2554MaxCount = new Topic2554MaxCount();
        System.out.printf("res: %d\n", topic2554MaxCount.macCount(new int[]{ 1, 6, 5 }, 5, 6));
        System.out.printf("res: %d\n", topic2554MaxCount.macCount(new int[]{ 1, 2, 3, 4, 5, 6, 7 }, 8, 1));
        System.out.printf("res: %d\n", topic2554MaxCount.macCount(new int[]{ 11 }, 7, 50));
    }

}
