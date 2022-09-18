package vip.hyzt.questions;

import org.junit.Test;

public class Topic6184CountDaysTogetherTests {

    @Test
    public void countDaysTogether() {
        Topic6184CountDaysTogether topic6184CountDaysTogether = new Topic6184CountDaysTogether();
        String arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-19";
        System.out.printf("res: %d\n", topic6184CountDaysTogether.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
        System.out.printf("res: %d\n", topic6184CountDaysTogether.countDaysTogether("10-01", "10-31", "11-01", "12-31"));
    }

}
