package vip.hyzt.questions.wc336;

import org.junit.Test;

public class Topic2587MaxScoreTests {

    @Test
    public void maxScore() {
        Topic2587MaxScore topic2587MaxScore = new Topic2587MaxScore();
        System.out.printf("res: %d\n", topic2587MaxScore.maxScore(new int[] { 2, -1, 0, 1, -3, 3, -3 }));
        System.out.printf("res: %d\n", topic2587MaxScore.maxScore(new int[] { -2, -3, 0 }));
    }

}
