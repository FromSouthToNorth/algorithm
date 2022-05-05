package vip.hyzt.questions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <h3>591.标签验证器</h3>
 * @see <a href="https://leetcode-cn.com/problems/tag-validator/">链接：https://leetcode-cn.com/problems/tag-validator/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic591IsValid {

    static String CDATA1 = "<![CDATA[", CDATA2 = "]]>";

    public static boolean isValid(String code) {
        Deque<String> d = new ArrayDeque<>();
        int n = code.length(), i = 0;
        while (i < n) {
            if (i + 8 < n && code.substring(i, i + 9).equals(CDATA1)) {
                if (i == 0) return false;
                int j = i + 9;
                boolean ok = false;
                while (j < n && !ok) {
                    if (j + 2 < n && code.substring(j, j + 3).equals(CDATA2)) {
                        j = j + 3; ok = true;
                    } else {
                        j++;
                    }
                }
                if (!ok) return false;
                i = j;
            } else if (code.charAt(i) == '<') {
                if (i == n - 1) return false;
                boolean isEnd = code.charAt(i + 1) == '/';
                int p = isEnd ? i + 2 : i + 1, j = p;
                while (j < n && code.charAt(j) != '>') {
                    if (!Character.isUpperCase(code.charAt(j))) return false;
                    j++;
                }
                if (j == n) return false;
                int len = j - p;
                if (len < 1 || len > 9) return false;
                String tag = code.substring(p, j);
                i = j + 1;
                if (!isEnd) {
                    d.addLast(tag);
                } else {
                    if (d.isEmpty() || !d.pollLast().equals(tag)) return false;
                    if (d.isEmpty() && i < n) return false;
                }
            } else {
                if (i == 0) return false;
                i++;
            }
        }
        return d.isEmpty();
    }

}
