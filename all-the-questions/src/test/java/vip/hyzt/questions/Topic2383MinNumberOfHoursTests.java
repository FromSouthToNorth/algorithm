package vip.hyzt.questions;

import org.junit.Test;

public class Topic2383MinNumberOfHoursTests {

    @Test
    public void minNumberOfHours() {
        Topic2383MinNumberOfHours topic2383MinNumberOfHours = new Topic2383MinNumberOfHours();
        int[] energy = {1, 1, 1, 1, 1}, experience = {1, 1, 1, 1, 50};
        int count = topic2383MinNumberOfHours.minNumberOfHours(1, 1, energy, experience);
        System.out.printf("%d \n", count);
    }

}
