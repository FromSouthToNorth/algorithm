package vip.hyzt.questions.wcb100;

import org.junit.Test;

public class Topic2593FindScoreTests {

    @Test
    public void findScore() {
        Topic2593FindScore topic2593FindScore = new Topic2593FindScore();
        System.out.printf("res: %d\n", topic2593FindScore.findScore(new int[] { 2, 1, 3, 4, 5, 2 }));
        System.out.printf("res: %d\n", topic2593FindScore.findScore(new int[] { 2, 3, 5, 1, 3, 2 }));
    }

}
