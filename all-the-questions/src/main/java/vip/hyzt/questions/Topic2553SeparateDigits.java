package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>2553. 分割数组中数字的数位</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/separate-the-digits-in-an-array/">https://leetcode.cn/problems/separate-the-digits-in-an-array/</a>
 */
public class Topic2553SeparateDigits {

    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            for (char c : ("" + num).toCharArray()) {
                list.add(c - '0');
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}
