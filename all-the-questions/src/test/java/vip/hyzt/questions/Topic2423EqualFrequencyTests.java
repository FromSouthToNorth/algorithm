package vip.hyzt.questions;

import org.junit.Test;

public class Topic2423EqualFrequencyTests {

    @Test
    public void equalFrequency() {
        Topic2423EqualFrequency topic2423EqualFrequency = new Topic2423EqualFrequency();
        String[] words = {"abcc", "aazz", "aaccbbb", "ababcd", "ababc", "yzssyaazs"};
        for (String word : words) {
            System.out.printf("res: %b\n", topic2423EqualFrequency.equalFrequency(word));
        }
    }

}
