package vip.hyzt.questions.wc309;

import org.junit.Test;
import vip.hyzt.questions.wc309.Topic2399CheckDistances;

public class Topic2399CheckDistancesTests {

    @Test
    public void checkDistances() {
        Topic2399CheckDistances topic2399CheckDistances = new Topic2399CheckDistances();
        String s = "abacb";
        int[] distance = {1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(topic2399CheckDistances.checkDistances(s, distance));
    }

}
