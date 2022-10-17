package vip.hyzt.questions;

import org.junit.Test;

public class Topic2390RemoveStarsTests {

    @Test
    public void removeStars() {
        Topic2390RemoveStars topic2390RemoveStars = new Topic2390RemoveStars();
        String s = "leet**cod*e";
        System.out.printf("%s\n", topic2390RemoveStars.removeStars(s));
    }

}
