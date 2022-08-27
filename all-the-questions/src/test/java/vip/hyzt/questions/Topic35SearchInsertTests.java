package vip.hyzt.questions;

import org.junit.Test;

public class Topic35SearchInsertTests {

    @Test
    public void searchInsert() {
        Topic35SearchInsert topic35SearchInsert = new Topic35SearchInsert();
        int nums[] = { 1, 3, 5, 6 }, target = 5;
        int i = topic35SearchInsert.searchInsert(nums, target);
        System.out.printf("%d\n", i);
    }

}
