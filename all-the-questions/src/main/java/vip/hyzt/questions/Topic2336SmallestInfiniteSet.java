package vip.hyzt.questions;

import java.util.TreeSet;

/**
 * <h3>2336. 无限集中的最小数字</h3>
 * @see <a href="https://leetcode.cn/problems/smallest-number-in-infinite-set/">https://leetcode.cn/problems/smallest-number-in-infinite-set/</a>
 * @author hy
 */
public class Topic2336SmallestInfiniteSet extends TreeSet<Integer> {

    private int curr;

    public int popSmallest() {
        return isEmpty() ? ++curr : pollFirst();
    }

    public void addBack(int num) {
        if (num <= curr) {
            add(num);
        }
    }

}
