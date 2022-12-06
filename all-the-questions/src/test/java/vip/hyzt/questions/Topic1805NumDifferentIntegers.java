package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * <h1>1805. 字符串中不同整数的数目</h1>
 * <p>给你一个字符串 word ，该字符串由数字和小写英文字母组成。</p>
 * <p>请你用空格替换每个不是数字的字符。例如，"a123bc34d8ef34" 将会变成 " 123  34 8  34" 。注意，剩下的这些整数为（相邻彼此至少有一个空格隔开）："123"、"34"、"8" 和 "34" 。</p>
 * <p>返回对 word 完成替换后形成的 <strong>不同</strong> 整数的数目。</p>
 * <p>只有当两个整数的 <strong>不含前导零</strong> 的十进制表示不同， 才认为这两个整数也不同。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：word = "a<strong>123</strong>bc<strong>34</strong>d<strong>8</strong>ef<strong>34</strong>"
 *     输出：3
 *     解释：不同的整数有 "123"、"34" 和 "8" 。注意，"34" 只计数一次。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：word = "leet<strong>1234</strong>code<strong>234</strong>"
 *     输出：2
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：word = "a<strong>1</strong>b<strong>01</strong>c<strong>001</strong>"
 *     输出：1
 *     解释："1"、"01" 和 "001" 视为同一个整数的十进制表示，因为在比较十进制值时会忽略前导零的存在。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= word.length <= 1000</li>
 *     <li>word 由数字和小写英文字母组成</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/number-of-different-integers-in-a-string/">https://leetcode.cn/problems/number-of-different-integers-in-a-string/</a>
 */
public class Topic1805NumDifferentIntegers {

    public int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                int j = i;
                while (j < word.length() && Character.isDigit(word.charAt(j))) {
                    j++;
                }
                while (i < j && word.charAt(i) == '0') {
                    i++;
                }
                set.add(word.substring(i, j));
                i = j;
            }
        }
        return set.size();
    }

}
