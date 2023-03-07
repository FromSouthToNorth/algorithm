package vip.hyzt.questions.wc307;

import org.junit.Test;
import vip.hyzt.questions.wc307.Topic2383MinNumberOfHours;

public class Topic2383MinNumberOfHoursTests {

    @Test
    public void minNumberOfHours() {
        Topic2383MinNumberOfHours topic2383MinNumberOfHours = new Topic2383MinNumberOfHours();
        int[] energy = {1, 1, 1, 1, 1}, experience = {1, 1, 1, 1, 50};
        int count = topic2383MinNumberOfHours.minNumberOfHours(1, 1, energy, experience);
        System.out.printf("%d \n", count);
    }

}
