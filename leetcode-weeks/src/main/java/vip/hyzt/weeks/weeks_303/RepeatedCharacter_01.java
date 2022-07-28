package vip.hyzt.weeks.weeks_303;

import java.util.HashSet;
import java.util.Set;

/**
 * <h3>2351. 第一个出现两次的字母</h3>
 * @see <a href="https://leetcode.cn/problems/first-letter-to-appear-twice/">https://leetcode.cn/problems/first-letter-to-appear-twice/</a>
 * @author hy
 */
public class RepeatedCharacter_01 {

    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                return c;
            }
        }
        return ' ';
    }

}
