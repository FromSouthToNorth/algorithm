package vip.hyzt.questions;

import org.junit.Test;

public class Topic42TrapTests {

    @Test
    public void trap() {
        Topic42Trap topic42Trap = new Topic42Trap();
        int[][] traps = {{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, {4, 2, 0, 3, 2, 5}, {1, 2, 3, 4, 5}, {2, 0, 3, 4, 2}};
        for (int[] height : traps) {
            System.out.printf("res: %d\n", topic42Trap.trap(height));
        }
    }

}
