package vip.hyzt.questions;

import org.junit.Test;

public class OfferII041MovingAverageTests {

    @Test
    public void movingAverage() {
        TopicOfferII041MovingAverage movingAverage = new TopicOfferII041MovingAverage(3);
        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(10));
        System.out.println(movingAverage.next(3));
        System.out.println(movingAverage.next(5));
    }

}
