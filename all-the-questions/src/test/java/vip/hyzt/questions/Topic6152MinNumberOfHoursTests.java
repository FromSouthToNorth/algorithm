package vip.hyzt.questions;

import org.junit.Test;

public class Topic6152MinNumberOfHoursTests {

    @Test
    public void minNumberOfHours() {
        Topic6152MinNumberOfHours topic6152MinNumberOfHours = new Topic6152MinNumberOfHours();
        int[] energy = {1, 1, 1, 1, 1}, experience = {1, 1, 1, 1, 50};
        int count = topic6152MinNumberOfHours.minNumberOfHours(1, 1, energy, experience);
        System.out.printf("%d \n", count);
    }

}
