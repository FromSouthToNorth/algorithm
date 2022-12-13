package vip.hyzt.questions;

import org.junit.Test;

public class Topic2492MinScoreTests {

    @Test
    public void minScore() {
        Topic2492MinScore topic2492MinScore = new Topic2492MinScore();
        System.out.printf("res: %d\n", topic2492MinScore.minScore(4, new int[][]{{1, 2, 9}, {2, 3, 6}, {2, 4, 5}, {1, 4, 7}}));
        System.out.printf("res: %d\n", topic2492MinScore.minScore(4, new int[][]{{1, 2, 2}, {1, 3, 4}, {3, 4, 7}}));
        System.out.printf("res: %d\n", topic2492MinScore.minScore(6, new int[][]{{5, 6, 1}, {6, 7, 2}, {8, 5, 3}, {1, 3, 5}, {2, 1, 6}}));
    }

}
