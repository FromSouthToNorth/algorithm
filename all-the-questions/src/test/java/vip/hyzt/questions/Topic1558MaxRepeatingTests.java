package vip.hyzt.questions;

import org.junit.Test;

public class Topic1558MaxRepeatingTests {

    @Test
    public void maxRepeating() {
        Topic1558MaxRepeating topic1558MaxRepeating = new Topic1558MaxRepeating();
        System.out.printf("%s res: %d\n", "ababc", topic1558MaxRepeating.maxRepeating("ababc", "ab"));
        System.out.printf("%s res: %d\n", "ababcab", topic1558MaxRepeating.maxRepeating("ababcab", "ab"));
        System.out.printf("%s res: %d\n", "aceaeca", topic1558MaxRepeating.maxRepeating("abcde", "adc"));
        System.out.printf("%s res: %d\n", "aaacaabcaaacaaaaba", topic1558MaxRepeating.maxRepeating("aaacaabcaaacaaaaba", "a"));
    }

}
