package vip.hyzt.questions;

import org.junit.Test;

public class TopicOffer10_1FibTests {

    @Test
    public void fib() {
        TopicOffer10_1Fib topicOffer10_1Fib = new TopicOffer10_1Fib();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 100; i++) {
            System.out.printf("%d res: %d\n", i, topicOffer10_1Fib.fib(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("%dms\n", endTime - startTime);
    }

}
