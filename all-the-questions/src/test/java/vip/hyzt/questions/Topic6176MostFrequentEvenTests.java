package vip.hyzt.questions;

import org.junit.Test;

public class Topic6176MostFrequentEvenTests {

    @Test
    public void mostFrequentEven() {
        Topic6176MostFrequentEven topic6176MostFrequentEven = new Topic6176MostFrequentEven();
        int[] nums = {1,1,2,6,3,4,2,6,2,3,3,4,4,4,5};
        System.out.printf("res: %d\n", topic6176MostFrequentEven.mostFrequentEven(nums));
    }

}
