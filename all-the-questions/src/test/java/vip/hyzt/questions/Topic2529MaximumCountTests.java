package vip.hyzt.questions;

import org.junit.Test;

public class Topic2529MaximumCountTests {

    @Test
    public void maximumCount() {
        Topic2529MaximumCount topic2529MaximumCount = new Topic2529MaximumCount();
        System.out.printf("res: %d\n", topic2529MaximumCount.maximumCount(new int[]{-2, -1, -1, 1, 2, 3}));
        System.out.printf("res: %d\n", topic2529MaximumCount.maximumCount(new int[]{-3, -2, -1, 0, 0, 1, 2}));
        System.out.printf("res: %d\n", topic2529MaximumCount.maximumCount(new int[]{5, 20, 66, 1314}));
    }

}
