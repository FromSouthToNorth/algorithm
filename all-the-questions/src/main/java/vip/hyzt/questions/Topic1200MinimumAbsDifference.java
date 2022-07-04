package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>1200. 最小绝对差</h3>
 * @see <a href="https://leetcode.cn/problems/minimum-absolute-difference/">https://leetcode.cn/problems/minimum-absolute-difference/</a>
 * @author hy
 */
public class Topic1200MinimumAbsDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = arr[1] - arr[0];
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = arr.length - 1; i > 0; i--) {
            min = Math.min(min, arr[i] - arr[i - 1]);
        }
        for (int i = 1; i < arr.length; i++) {
            if (min == arr[i] - arr[i - 1]) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i - 1]);
                list.add(arr[i]);
                ans.add(list);
            }
        }
        return ans;
    }

}
