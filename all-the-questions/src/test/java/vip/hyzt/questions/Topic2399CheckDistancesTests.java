package vip.hyzt.questions;

import org.junit.Test;

public class Topic2399CheckDistancesTests {

    @Test
    public void checkDistances() {
        Topic2399CheckDistances topic2399CheckDistances = new Topic2399CheckDistances();
        String s = "abacb";
        int[] distance = {1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(topic2399CheckDistances.checkDistances(s, distance));
    }

}
