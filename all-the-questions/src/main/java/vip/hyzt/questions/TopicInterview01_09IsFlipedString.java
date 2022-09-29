package vip.hyzt.questions;

/**
 * <h2>面试题 01.09. 字符串轮转</h2>
 * <p>字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。</p>
 * <h3>示例1:</h3>
 * <pre>
 *     输入：s1 = "waterbottle", s2 = "erbottlewat"
 *     输出：True
 * </pre>
 * <h3>示例2:</h3>
 * <pre>
 *     输入：s1 = "aa", s2 = "aba"
 *     输出：False
 * </pre>
 * <h3>提示：</h3>
 * <ol>
 *     <li>字符串长度在[0, 100000]范围内。</li>
 * </ol>
 * <h3>说明:</h3>
 * <ol>
 *     <li>你能只调用一次检查子串的方法吗？</li>
 * </ol>
 * <h3>js</h3>
 * <pre>
 * function isFlipedString(s1, s2) {
 *   // let m = s1.length, n = s2.length;
 *   // if (m != n) {
 *   //   return false;
 *   // }
 *   // if (n == 0) {
 *   //   return true;
 *   // }
 *   // for (let i = 0; i < n; i++) {
 *   //   let flag = true;
 *   //   for (let j = 0; j < n; j++) {
 *   //     if (s1.charAt((i + j) % n) != s2.charAt(j)) {
 *   //       flag = false;
 *   //       break;
 *   //     }
 *   //   }
 *   //   if (flag) {
 *   //     return true;
 *   //   }
 *   // }
 *   // return false;
 *   return s1.length == s2.length && (s1 + s1).includes(s2);
 * }
 * console.log(isFlipedString("",""));
 * console.log(isFlipedString("waterbottle","erbottlewat"));
 * console.log(isFlipedString("aa","aba"));
 * </pre>
 * @see <a href="https://leetcode.cn/problems/string-rotation-lcci/">https://leetcode.cn/problems/string-rotation-lcci/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class TopicInterview01_09IsFlipedString {

    public boolean isFlipedString(String s1, String s2) {

//        int m = s1.length(), n = s2.length();
//        if (m != n) {
//            return false;
//        }
//        if (n == 0) {
//            return true;
//        }
//        for (int i = 0; i < n; i++) {
//            boolean flag = true;
//            for (int j = 0; j < n; j++) {
//                if (s1.charAt((i + j) % n) != s2.charAt(j)) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                return true;
//            }
//
//        }
//        return false;

        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }

}
