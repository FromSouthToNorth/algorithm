package vip.hyzt.questions;

import org.junit.Test;

public class Topic799ChampagneTowerTests {

    @Test
    public void champagneTower() {
        Topic799ChampagneTower topic799ChampagneTower = new Topic799ChampagneTower();
        System.out.printf("%f\n", topic799ChampagneTower.champagneTower(1, 1, 1));
        System.out.printf("%f\n", topic799ChampagneTower.champagneTower(2, 1, 1));
        System.out.printf("%f\n", topic799ChampagneTower.champagneTower(100000009, 33, 17));
    }

}
