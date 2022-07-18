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
        int i = 0;
        for (int n : arr1) {
            cur[n]++;
        }

        for (int n : arr2) {
            while (cur[n] > 0) {
                arr1[i++] = n;
                cur[n]--;
            }
        }

        for (int n = 0; n < cur.length; n++) {
            while (cur[n] > 0) {
                arr1[i++] = n;
                cur[n]--;
            }
        }

        return arr1;
    }

}
