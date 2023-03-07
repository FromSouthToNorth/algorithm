package vip.hyzt.questions.wcb87;

import org.junit.Test;
import vip.hyzt.questions.wcb87.Topic2409CountDaysTogether;

public class Topic2409CountDaysTogetherTests {

    @Test
    public void countDaysTogether() {
        Topic2409CountDaysTogether topic2409CountDaysTogether = new Topic2409CountDaysTogether();
        String arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-19";
        System.out.printf("res: %d\n", topic2409CountDaysTogether.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
        System.out.printf("res: %d\n", topic2409CountDaysTogether.countDaysTogether("10-01", "10-31", "11-01", "12-31"));
    }

}
