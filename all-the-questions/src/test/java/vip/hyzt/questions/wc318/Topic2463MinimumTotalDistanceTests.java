package vip.hyzt.questions.wc318;

import org.junit.Test;
import vip.hyzt.questions.wc318.Topic2463MinimumTotalDistance;

import java.util.ArrayList;
import java.util.Arrays;

public class Topic2463MinimumTotalDistanceTests {

    @Test
    public void minimumTotalDistance() {
        Topic2463MinimumTotalDistance topic2463MinimumTotalDistance = new Topic2463MinimumTotalDistance();
        System.out.printf("res: %d\n", topic2463MinimumTotalDistance.minimumTotalDistance(new ArrayList<>(Arrays.asList(0, 4, 6)), new int[][]{{2, 2}, {6, 2}}));
    }

}