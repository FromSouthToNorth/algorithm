package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h3>剑指 Offer II 041. 滑动窗口的平均值</h3>
 * @see <a href="https://leetcode.cn/problems/qIsx9U/">https://leetcode.cn/problems/qIsx9U/</a>
 * @author hy
 */
public class OfferII041MovingAverage {

    int[] arr = new int[1000];
    int size, sum, i, j;

    /** Initialize your data structure here. */
    public OfferII041MovingAverage(int size) {
       this.size = size;
    }

    public double next(int val) {
        sum += arr[i++] = val;
        if (i - j > size) {
            sum -= arr[j++];
        }
        return sum * 1.0 / (i - j);
    }

}
