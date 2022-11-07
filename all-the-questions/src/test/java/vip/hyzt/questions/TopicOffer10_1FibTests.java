package vip.hyzt.questions;

import org.junit.Test;

public class TopicOffer10_1FibTests {

    @Test
    public void fib() {
        TopicOffer10_1Fib topicOffer10_1Fib = new TopicOffer10_1Fib();
        for (int i = 0; i <= 67; i++) {
            long startTime = System.currentTimeMillis();
            int res = topicOffer10_1Fib.fib(i);
            long endTime = System.currentTimeMillis();
            System.out.printf("f(%d) res: %d \t\t run time %d ms\n", i, res, endTime - startTime);
        }
    }

}
