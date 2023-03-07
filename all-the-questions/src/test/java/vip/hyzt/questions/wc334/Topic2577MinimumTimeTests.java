package vip.hyzt.questions.wc334;

import org.junit.Test;
import vip.hyzt.questions.wc334.Topic2577MinimumTime;

public class Topic2577MinimumTimeTests {

    @Test
    public void minimumTime() {
        Topic2577MinimumTime topic2577MinimumTime = new Topic2577MinimumTime();
        System.out.printf("res: %d\n", topic2577MinimumTime.minimumTime(new int[][] { { 0, 1, 3, 2 }, { 5, 1, 2, 5 }, { 4, 3, 8, 6 } }));
        System.out.printf("res: %d\n", topic2577MinimumTime.minimumTime(new int[][] { { 0, 2, 4 }, { 3, 2, 1 }, { 1, 0, 4 } }));
    }

}
