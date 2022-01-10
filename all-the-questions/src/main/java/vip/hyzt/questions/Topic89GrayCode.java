package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>89. 格雷编码</h3>
 *
 * <p>n 位格雷码序列 是一个由 2n 个整数组成的序列，其中：</p>
 * <p>每个整数都在范围 [0, 2n - 1] 内（含 0 和 2n - 1）</p>
 * <p>第一个整数是 0</p>
 * <p>一个整数在序列中出现 不超过一次</p>
 * <p>每对 相邻 整数的二进制表示 恰好一位不同 ，且</p>
 * <p>第一个 和 最后一个 整数的二进制表示 恰好一位不同</p>
 * <p>给你一个整数 n ，返回任一有效的 n 位格雷码序列 。</p>
 *
 * <h3>示例 1：</h3>
 * <ul>
 *     <li>输入：n = 2</li>
 *     <li>输出：[0,1,3,2]</li>
 *     <li>解释：</li>
 *     <li>[0,1,3,2] 的二进制表示是 [00,01,11,10] 。</li>
 *     <li>- 00 和 01 有一位不同</li>
 *     <li>- 01 和 11 有一位不同</li>
 *     <li>- 11 和 10 有一位不同</li>
 *     <li>- 10 和 00 有一位不同</li>
 *     <li>[0,2,3,1] 也是一个有效的格雷码序列，其二进制表示是 [00,10,11,01] 。</li>
 *     <li>- 00 和 10 有一位不同</li>
 *     <li>- 10 和 11 有一位不同</li>
 *     <li>- 11 和 01 有一位不同</li>
 *     <li>- 01 和 00 有一位不同</li>
 *     <li></li>
 * </ul>
 *
 * <h3>示例 2：</h3>
 * <ul>
 *     <li>输入：n = 1</li>
 *     <li>输出：[0,1]</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @see <a href="https://leetcode-cn.com/problems/gray-code">链接：https://leetcode-cn.com/problems/gray-code</a>
 * @author hy
 */
public abstract class Topic89GrayCode {

    public static List<Integer> symmetricalGeneration(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        for (int i = 0; i <= n; i++) {
            int m = result.size();
            for (int j = m - 1; j >= 0; j--) {
                result.add(result.get(i) | (1 << (i - 1)));
            }
        }
        return result;
    }

    public static List<Integer> binaryNumberToGrayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            System.out.println(i >> 1);
            result.add((i >> 1) ^ i);
        }
        return result;
    }

}
