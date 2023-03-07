package vip.hyzt.questions.wcb86;

import org.junit.Test;
import vip.hyzt.questions.wcb86.Topic2397MaximumRows;

public class Topic2397MaximumRowsTests {

    @Test
    public void maximumRows() {
        Topic2397MaximumRows topic2397MaximumRows = new Topic2397MaximumRows();
        int[][] mat = {{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 0, 1}};
        int cols = 2;
        System.out.printf("res: %d \n", topic2397MaximumRows.maximumRows(mat, cols));
    }

}
