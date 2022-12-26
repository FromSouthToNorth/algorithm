package vip.hyzt.questions;

import org.junit.Test;

public class Topic2513MinimizeSetTests {

    @Test
    public void minimizeSet() {
        Topic2513MinimizeSet topic2513MinimizeSet = new Topic2513MinimizeSet();
        System.out.printf("res: %d\n", topic2513MinimizeSet.minimizeSet(2, 7, 1, 3));
        System.out.printf("res: %d\n", topic2513MinimizeSet.minimizeSet(3, 4, 2, 1));
        System.out.printf("res: %d\n", topic2513MinimizeSet.minimizeSet(2, 4, 8, 2));
    }

}
