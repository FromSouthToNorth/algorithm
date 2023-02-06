package vip.hyzt.questions;

import org.junit.Test;

public class Topic2551PutMarblesTests {

    @Test
    public void putMarbles() {
        Topic2551PutMarbles topic2551PutMarbles = new Topic2551PutMarbles();
        System.out.printf("res: %d\n", topic2551PutMarbles.putMarbles(new int[]{ 1, 3, 5, 1 }, 2));
        System.out.printf("res: %d\n", topic2551PutMarbles.putMarbles(new int[]{ 1, 3 }, 2));
    }

}
