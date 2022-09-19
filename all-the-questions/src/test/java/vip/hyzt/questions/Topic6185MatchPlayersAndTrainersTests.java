package vip.hyzt.questions;

import org.junit.Test;

public class Topic6185MatchPlayersAndTrainersTests {

    @Test
    public void matchPlayersAndTrainers() {
        Topic6185MatchPlayersAndTrainers topic6185MatchPlayersAndTrainers = new Topic6185MatchPlayersAndTrainers();
        System.out.printf("res: %d\n", topic6185MatchPlayersAndTrainers.matchPlayersAndTrainers(new int[]{4, 7, 9}, new int[]{8, 2, 5, 8}));
        System.out.printf("res: %d\n", topic6185MatchPlayersAndTrainers.matchPlayersAndTrainers(new int[]{1, 1, 1}, new int[]{10}));
    }

}
