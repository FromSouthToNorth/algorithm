package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>728.自除数</h3>
 * <p><b>自除数</b> 是指可以被它包含的每一位数整除的数。</p>
 * <ul>
 *     <li>例如，128 是个 <b>自除数</b>，因为 128 % 1 == 0， 128 % 2 == 0，128 % 8 == 0。</li>
 * </ul>
 * <p><b>自除数</b> 不允许包含 0</p>
 * <p>给定两个整数 left 和 right，返回一个列表，列表的元素是范围 [left, right] 内所以的 <b>自除数</b></p>
 * <p><b>示例 1：</b></p>
 * <pre>
 *     <strong>输入：</strong>left = 1, right = 22
 *     <strong>输出：</strong>[1,2,3,4,5,6,7,8,9,11,12,15,22]
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong>left = 47, right = 85
 *     <strong>输出：</strong>[48,55,66,77]
 * </pre>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/self-dividing-numbers">728.自除数</a>
 */
public abstract class Topic728SelfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        out:for (int i = left; i <= right; i++) {
            int cont = i;
            while (cont != 0) {
                int t = cont % 10;
                if (t == 0 || i % t != 0) continue out;
                cont /= 10;
            }
            res.add(i);
        }
        return res;
    }

}
