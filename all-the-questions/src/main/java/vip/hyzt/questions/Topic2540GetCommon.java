package vip.hyzt.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * <h1>2540. 最小公共值</h1>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/minimum-common-value/">https://leetcode.cn/problems/minimum-common-value/</a>
 */
public class Topic2540GetCommon {

    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                return num;
            }
        }
        return -1;
    }

}
