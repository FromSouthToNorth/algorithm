package vip.hyzt.questions.wcb87;

import org.junit.Test;
import vip.hyzt.questions.wcb87.Topic2410MatchPlayersAndTrainers;

public class Topic2410MatchPlayersAndTrainersTests {

    @Test
    public void matchPlayersAndTrainers() {
        Topic2410MatchPlayersAndTrainers topic2410MatchPlayersAndTrainers = new Topic2410MatchPlayersAndTrainers();
        System.out.printf("res: %d\n", topic2410MatchPlayersAndTrainers.matchPlayersAndTrainers(new int[]{4, 7, 9}, new int[]{8, 2, 5, 8}));
        System.out.printf("res: %d\n", topic2410MatchPlayersAndTrainers.matchPlayersAndTrainers(new int[]{1, 1, 1}, new int[]{10}));
    }

}
