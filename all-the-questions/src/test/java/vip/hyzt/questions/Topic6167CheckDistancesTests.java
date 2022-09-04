package vip.hyzt.questions;

import org.junit.Test;

public class Topic6167CheckDistancesTests {

    @Test
    public void checkDistances() {
        Topic6167CheckDistances topic6167CheckDistances = new Topic6167CheckDistances();
        String s = "abacb";
        int[] distance = {1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(topic6167CheckDistances.checkDistances(s, distance));
    }

}
