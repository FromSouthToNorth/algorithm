package vip.hyzt.questions.wc309;

import org.junit.Test;
import vip.hyzt.questions.wc309.Topic2400NumberOfWays;

public class Topic2400NumberOfWaysTests {

    @Test
    public void numberOfWays() {
        Topic2400NumberOfWays topic2400NumberOfWays = new Topic2400NumberOfWays();
        int res = topic2400NumberOfWays.numberOfWays(1, 2, 3);
        System.out.printf("%d\n", res);
    }

}
