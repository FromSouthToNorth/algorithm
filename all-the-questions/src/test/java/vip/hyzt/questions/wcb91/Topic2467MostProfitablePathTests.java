package vip.hyzt.questions.wcb91;

import org.junit.Test;
import vip.hyzt.questions.wcb91.Topic2467MostProfitablePath;

public class Topic2467MostProfitablePathTests {

    @Test
    public void mostProfitablePath() {
        Topic2467MostProfitablePath topic2467MostProfitablePath = new Topic2467MostProfitablePath();
        System.out.printf("res: %d \n", topic2467MostProfitablePath.mostProfitablePath(new int[][]{{0, 1}, {1, 2}, {1, 3}, {3, 4}}, 3, new int[]{-2, 4, 2, -4, 6}));
        System.out.printf("res: %d \n", topic2467MostProfitablePath.mostProfitablePath(new int[][]{{0, 1}}, 1, new int[]{-7280,2350}));
    }

}
