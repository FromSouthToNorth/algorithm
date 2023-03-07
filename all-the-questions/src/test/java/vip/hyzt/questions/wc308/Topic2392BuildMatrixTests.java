package vip.hyzt.questions.wc308;

import org.junit.Test;
import vip.hyzt.questions.wc308.Topic2392BuildMatrix;

import java.util.Arrays;

public class Topic2392BuildMatrixTests {

    @Test
    public void buildMatrix() {
        Topic2392BuildMatrix topic2392BuildMatrix = new Topic2392BuildMatrix();
        int[][] ints = topic2392BuildMatrix.buildMatrix(3, new int[][]{{1, 2}, {3, 2}}, new int[][]{{2, 1}, {3, 2}});
        System.out.println(Arrays.toString(ints));
    }

}
