package vip.hyzt.questions;

/**
 * <h1>2554. 从一个范围内选择最多整数 I</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/maximum-number-of-integers-to-choose-from-a-range-i/">https://leetcode.cn/problems/maximum-number-of-integers-to-choose-from-a-range-i/</a>
 */
public class Topic2554MaxCount {

    public int macCount(int[] banned, int n, int maxSum) {
        // 1 <= banned[i], n <= 10000
        int[] flag = new int[10001];
        int count = 0;
        for (int i : banned) {
            flag[i] = 1;
        }
        for (int i = 1; i <= n && (maxSum -= i - i * flag[i]) >= 0; i++) {
            count += 1 - flag[i];
        }
        return count;
    }

}
