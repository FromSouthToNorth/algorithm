package vip.hyzt.questions.wc301;

import org.junit.Test;
import vip.hyzt.questions.wc301.Topic2363MergeSimilarItems;

import java.util.List;

public class Topic2363MergeSimilarItemsTests {

    @Test
    public void mergeSimilarItems() {
        int[][] itmes1 = {{1, 1}, {4, 5}, {3, 8}}, itmes2 = {{3, 1}, {1, 5}};
        List<List<Integer>> lists = new Topic2363MergeSimilarItems().mergeSimilarItems(itmes1, itmes2);
        System.out.println(lists);
    }

}
