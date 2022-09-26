package vip.hyzt.questions;

import org.junit.Test;

public class Topic46PermuteTests {

    @Test
    public void permute() {
        Topic46Permute topic46Permute = new Topic46Permute();
        int[][] nums = {{1, 2, 0}, {8, 10, 10, 11}};
        for (int[] num : nums) {
            System.out.printf("res: %s\n", topic46Permute.permute(num));
        }
    }

}
