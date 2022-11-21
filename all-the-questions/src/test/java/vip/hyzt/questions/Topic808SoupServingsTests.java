package vip.hyzt.questions;

import org.junit.Test;

public class Topic808SoupServingsTests {

    @Test
    public void soupServings() {
        Topic808SoupServings topic808SoupServings = new Topic808SoupServings();
        System.out.printf("res: %f\n", topic808SoupServings.soupServings(50));
        System.out.printf("res: %f\n", topic808SoupServings.soupServings(100));
    }

}
