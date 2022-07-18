package vip.hyzt.questions;


import java.util.Arrays;

/**
 * <h3>1122. 数组的相对排序</h3>
 * @see <a href="https://leetcode.cn/problems/relative-sort-array/">https://leetcode.cn/problems/relative-sort-array/</a>
 * @author hy
 */
public class Topic1122RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] cur = new int[1001];
        int index = 0;
        for (int i : arr1) {
            cur[i]++;
        }

        for (int i : arr2) {
            while (cur[i] > 0) {
                arr1[index++] = i;
                cur[i]--;
            }
        }

        for (int i = 0; i < cur.length; i++) {
            while (cur[i] > 0) {
                arr1[index++] = i;
                cur[i]--;
            }
        }

        return arr1;
    }

}
