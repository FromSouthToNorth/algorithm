package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h1>2545. 根据第 K 场考试的分数排序</h1>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/sort-the-students-by-their-kth-score/">https://leetcode.cn/problems/sort-the-students-by-their-kth-score/</a>
 */
public class Topic2545SortTheStudents {

    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (o, p) -> p[k] - o[k]);
        return score;
    }

}
