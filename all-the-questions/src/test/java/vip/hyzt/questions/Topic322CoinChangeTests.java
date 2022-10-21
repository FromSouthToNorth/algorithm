package vip.hyzt.questions;

import org.junit.Test;

public class Topic322CoinChangeTests {

    @Test
    public void coinChange() {
        Topic322CoinChange topic322CoinChange = new Topic322CoinChange();
        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        System.out.printf("res: %d\n", topic322CoinChange.coinChange(coins1, amount1));
        int[] coins2 = {2};
        int amount2 = 3;
        System.out.printf("res: %d\n", topic322CoinChange.coinChange(coins2, amount2));
        int[] coins3 = {1};
        int amount3 = 0;
        System.out.printf("res: %d\n", topic322CoinChange.coinChange(coins3, amount3));
        int[] coins4 = {17, 23, 50, 21, 10};
        int amount4 = 101;
        System.out.printf("res: %d\n", topic322CoinChange.coinChange(coins4, amount4));
        int[] coins5 = {1, 1, 1, 0};
        int amount5 = 10000000;
        System.out.printf("%d\n", amount5);
        System.out.printf("res: %d\n", topic322CoinChange.coinChange(coins5, amount5));
    }

}
