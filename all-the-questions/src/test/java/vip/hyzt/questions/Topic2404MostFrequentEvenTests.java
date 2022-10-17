package vip.hyzt.questions;

import org.junit.Test;

public class Topic2404MostFrequentEvenTests {

    @Test
    public void mostFrequentEven() {
        Topic2404MostFrequentEven topic2404MostFrequentEven = new Topic2404MostFrequentEven();
        int[] nums = {1,1,2,6,3,4,2,6,2,3,3,4,4,4,5};
        System.out.printf("res: %d\n", topic2404MostFrequentEven.mostFrequentEven(nums));
    }

}
