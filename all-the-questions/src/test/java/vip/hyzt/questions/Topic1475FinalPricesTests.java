package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic1475FinalPricesTests {

    @Test
    public void finalPrices() {
        Topic1475FinalPrices topic1475FinalPrices = new Topic1475FinalPrices();
        int[] prices = { 8,4,6,2,3 };
        int[] ints = topic1475FinalPrices.finalPrices(prices);
        System.out.println(Arrays.toString(ints));
    }

}
