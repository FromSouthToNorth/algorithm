package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h1>2551. 将珠子放入背包中</h1>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/put-marbles-in-bags/">https://leetcode.cn/problems/put-marbles-in-bags/</a>
 */
public class Topic2551PutMarbles {

    public long putMarbles(int[] weights, int k) {
        int n = weights.length - 1;
        long[] sum = new long[n];
        long result = 0;
        for (int i = 0; i < n; i++) {
            sum[i] = weights[i] + weights[i + 1];
        }
        Arrays.sort(sum);
        for (int i = 1; i < k; i++) {
            result += sum[n - i] - sum[i - 1];
        }
        return result;
    }

}
