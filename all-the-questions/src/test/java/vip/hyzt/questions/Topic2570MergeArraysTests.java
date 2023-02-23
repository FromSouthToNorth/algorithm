package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic2570MergeArraysTests {

    @Test
    public void mergeArrays() {

        Topic2570MergeArrays topic2570MergeArrays = new Topic2570MergeArrays();
        System.out.printf("res: %s\n", Arrays.deepToString(topic2570MergeArrays.mergeArrays(
                new int[][] { { 148, 597 }, { 165, 623 }, { 306, 359 }, { 349, 566 }, { 403, 646 },
                        { 420, 381 }, { 566, 543 }, { 730, 209 }, { 757, 875 }, { 788, 208 }, { 932, 695 } },
                new int[][] { { 74, 669 }, { 87, 399 }, { 89, 165 }, { 99, 749 }, { 122, 401 },
                        { 138, 16 }, { 144, 714 }, { 148, 206 }, { 177, 948 }, { 211, 653 }, { 285, 775 },
                        { 309, 289 }, { 349, 396 }, { 386, 831 }, { 403, 318 }, { 405, 119 }, { 420, 153 },
                        { 468, 433 }, { 504, 101 }, { 566, 128 }, { 603, 688 }, { 618, 628 }, { 622, 586 },
                        { 641, 46 }, { 653, 922 }, { 672, 772 }, { 691, 823 }, { 693, 900 }, { 756, 878 },
                        { 757, 952 }, { 770, 795 }, { 806, 118 }, { 813, 88 }, { 919, 501 }, { 935, 253 },
                        { 982, 385 } })));
    }

}
