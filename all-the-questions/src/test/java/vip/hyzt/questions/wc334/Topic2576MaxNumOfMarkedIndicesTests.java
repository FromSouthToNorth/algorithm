package vip.hyzt.questions.wc334;

import org.junit.Test;
import vip.hyzt.questions.wc334.Topic2576MaxNumOfMarkedIndices;

public class Topic2576MaxNumOfMarkedIndicesTests {

    @Test
    public void maxNumOfMarkedIndices() {
        Topic2576MaxNumOfMarkedIndices topic2576MaxNumOfMarkedIndices = new Topic2576MaxNumOfMarkedIndices();
        System.out.printf("res: %d\n", topic2576MaxNumOfMarkedIndices.maxNumOfMarkedIndices(new int[] { 3, 5, 2, 4 }));
        System.out.printf("res: %d\n", topic2576MaxNumOfMarkedIndices.maxNumOfMarkedIndices(new int[] { 9, 2, 5, 4 }));
        System.out.printf("res: %d\n", topic2576MaxNumOfMarkedIndices.maxNumOfMarkedIndices(new int[] { 7, 6, 8 }));
    }

}
