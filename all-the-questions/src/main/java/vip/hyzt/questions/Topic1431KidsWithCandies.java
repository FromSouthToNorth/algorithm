package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>1431. 拥有最多糖果的孩子</h3>
 * @see <a href="https://leetcode.cn/problems/kids-with-the-greatest-number-of-candies/">https://leetcode.cn/problems/kids-with-the-greatest-number-of-candies/</a>
 * @author hy
 */
public class Topic1431KidsWithCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        for (int candy : candies) {
            res.add(candy + extraCandies >= max);
        }
        return res;
    }

}
