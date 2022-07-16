package vip.hyzt.questions;

/**
 * <h3>剑指 Offer II 041. 滑动窗口的平均值</h3>
 * @see <a href="https://leetcode.cn/problems/qIsx9U/">https://leetcode.cn/problems/qIsx9U/</a>
 * @author hy
 */
public class OfferII041MovingAverage {

    int[] arr = new int[10010];

    private final int n;
    private int sum;
    private int j;
    private int i;

    /** Initialize your data structure here. */
    public OfferII041MovingAverage(int size) {
        n = size;
    }

    public double next(int val) {
        sum += arr[i++] = val;
        if (i - j > n) {
            sum -= arr[j++];
        }
        return sum * 1.0 / (i - j);
    }

}
