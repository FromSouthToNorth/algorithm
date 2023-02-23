package vip.hyzt.questions;

import org.junit.Test;

public class Topic2573FindTheStringTests {

    @Test
    public void findTheString() {
        Topic2573FindTheString topic2573FindTheString = new Topic2573FindTheString();
        System.out.printf("res: %s\n", topic2573FindTheString.findTheString(new int[][] { { 4, 0, 2, 0 }, { 0, 3, 0, 1 }, { 2, 0, 2, 0 }, { 0, 1, 0, 1 } }));
        System.out.printf("res: %s\n", topic2573FindTheString.findTheString(new int[][] { { 4, 3, 2, 1 }, { 3, 3, 2, 1 }, { 2, 2, 2, 1 }, { 1, 1, 1, 1 } }));
        System.out.printf("res: %s\n", topic2573FindTheString.findTheString(new int[][] { { 4, 3, 2, 1 }, { 3, 3, 2, 1 }, { 2, 2, 2, 1 }, { 1, 1, 1, 3 } }));
    }

}
