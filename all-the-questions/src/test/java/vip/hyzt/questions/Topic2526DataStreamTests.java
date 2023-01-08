package vip.hyzt.questions;

import org.junit.Test;

public class Topic2526DataStreamTests {

    @Test
    public void dataStream() {
        Topic2526DataStream topic2526DataStream = new Topic2526DataStream(4, 3);
        System.out.printf("%b\n", topic2526DataStream.consec(4));
        System.out.printf("%b\n", topic2526DataStream.consec(4));
        System.out.printf("%b\n", topic2526DataStream.consec(4));
        System.out.printf("%b\n", topic2526DataStream.consec(3));
    }

}
