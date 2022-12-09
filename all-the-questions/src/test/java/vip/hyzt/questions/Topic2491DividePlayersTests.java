package vip.hyzt.questions;

import org.junit.Test;

public class Topic2491DividePlayersTests {

    @Test
    public void dividePlayers() {
        Topic2491DividePlayers topic2491DividePlayers = new Topic2491DividePlayers();
        System.out.printf("res: %d\n", topic2491DividePlayers.dividePlayers(new int[]{3, 2, 5, 1, 3, 4}));
        System.out.printf("res: %d\n", topic2491DividePlayers.dividePlayers(new int[]{3, 4}));
        System.out.printf("res: %d\n", topic2491DividePlayers.dividePlayers(new int[]{13, 1, 14, 3, 2, 15}));
    }

}
