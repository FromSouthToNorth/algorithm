package vip.hyzt.questions;

/**
 * <h1>2546. 执行逐位运算使字符串相等</h1>
 * @author hy
 * @see <a href="https://leetcode.cn/problems/apply-bitwise-operations-to-make-strings-equal/">https://leetcode.cn/problems/apply-bitwise-operations-to-make-strings-equal/</a>
 */
public class Topic2546MakeStringsEqual {

    public boolean makeStringsEqual(String s, String target) {
//        int cnts =0, cntt = 0;
//        int n = s.length();
//        for (int i = 0; i < n; i++) {
//            if (s.charAt(i) == '1') {
//                cnts++;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (target.charAt(i) == '1') {
//                cntt++;
//            }
//        }
//        if (cnts == 0 && cntt != 0) {
//            return false;
//        }
//        return cnts == 0 || cntt != 0;
        return s.contains("1") == target.contains("1");
    }

}
