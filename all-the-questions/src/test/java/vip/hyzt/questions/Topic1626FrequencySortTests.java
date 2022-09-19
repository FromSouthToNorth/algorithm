package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic1626FrequencySortTests {

    @Test
    public void frequencySort() {
        Topic1626FrequencySort topic1626FrequencySort = new Topic1626FrequencySort();
        System.out.printf("res: %s\n", Arrays.toString(topic1626FrequencySort.frequencySort(new int[]{1, 1, 2, 2, 2, 3})));
        System.out.printf("res: %s\n", Arrays.toString(topic1626FrequencySort.frequencySort(new int[]{2, 3, 1, 3, 2})));
        System.out.printf("res: %s\n", Arrays.toString(topic1626FrequencySort.frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1})));
    }

}
