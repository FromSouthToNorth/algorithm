package vip.hyzt.questions;

import org.junit.Test;

public class Topic2525CategorizeBoxTests {

    @Test
    public void categorizeBox() {
        Topic2525CategorizeBox topic2525CategorizeBox = new Topic2525CategorizeBox();
        System.out.printf("res: %s\n", topic2525CategorizeBox.categorizeBox(1000, 35, 700, 300));
        System.out.printf("res: %s\n", topic2525CategorizeBox.categorizeBox(2909, 3968, 3272, 727));
    }

}
