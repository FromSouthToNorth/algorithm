package vip.hyzt.questions;

import org.junit.Test;

public class Topic850RectangleAreaTests {

    @Test
    public void rectangleArea() {
        Topic850RectangleArea topic850RectangleArea = new Topic850RectangleArea();
        int[][] rectangles = {{0, 0, 2, 2}, {1, 0, 2, 3}, {1, 0, 3, 1}};
        System.out.printf("res: %d\n", topic850RectangleArea.rectangleArea(rectangles));
    }

}
