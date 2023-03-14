package vip.hyzt.questions.wc335;

import org.junit.Test;

public class Topic2584FindValidSplitTests {

    @Test
    public void findValidSplit() {
        Topic2584FindValidSplit topic2584FindValidSplit = new Topic2584FindValidSplit();
        System.out.printf("res: %d\n", topic2584FindValidSplit.findValidSplit(new int[] { 4, 7, 8, 15, 3, 5 }));
        System.out.printf("res: %d\n", topic2584FindValidSplit.findValidSplit(new int[] { 4, 7, 15, 8, 3, 5 }));
    }

}
