package vip.hyzt.questions;


import org.junit.Test;

public class Topic2481NumberOfCutsTest {

    @Test
    public void numberOfCuts() {
        Topic2481NumberOfCuts topic2481NumberOfCuts = new Topic2481NumberOfCuts();
        System.out.printf("res: %d\n", topic2481NumberOfCuts.numberOfCuts(0));
        System.out.printf("res: %d\n", topic2481NumberOfCuts.numberOfCuts(4));
        System.out.printf("res: %d\n", topic2481NumberOfCuts.numberOfCuts(3));
    }

}
