package vip.hyzt.questions;

import org.junit.Test;

public class Topic2542MaxScoreTests {

    @Test
    public void maxScore() {
        Topic2542MaxScore Topic2542MaxScore = new Topic2542MaxScore();
        System.out.printf("res: %d\n", Topic2542MaxScore.maxScore(new int[]{ 1, 3, 3, 2 }, new int[]{ 2, 1, 3, 4 }, 3));
        System.out.printf("res: %d\n", Topic2542MaxScore.maxScore(new int[]{ 4, 2, 3, 1, 1 }, new int[]{ 7, 5, 10, 9, 6 }, 1));
    }

}
