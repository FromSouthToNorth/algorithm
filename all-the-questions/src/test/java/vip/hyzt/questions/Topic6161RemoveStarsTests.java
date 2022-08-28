package vip.hyzt.questions;

import org.junit.Test;

public class Topic6161RemoveStarsTests {

    @Test
    public void removeStars() {
        Topic6161RemoveStars topic6161RemoveStars = new Topic6161RemoveStars();
        String s = "leet**cod*e";
        System.out.printf("%s\n", topic6161RemoveStars.removeStars(s));
    }

}
