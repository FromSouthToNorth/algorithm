package vip.hyzt.questions;

/**
 * <p>917. 仅仅反转字母</p>
 *
 * <p>给你一个字符串 <b>s</b> ，根据下述规则反转字符串：</p>
 *
 * <ul>
 *     <li>所有非英文字母保留在原有位置。</li>
 *     <li>所有英文字母（小写或大写）位置反转。</li>
 * </ul>
 * 返回反转后的 <b>s</b>
 *
 * <p>示例 1：</p>
 * <pre>
 *     <strong>输入：</strong>s = "ab-cd"
 *     <strong>输出：</strong>"dc-ba"
 * </pre>
 * <p>示例 2：</p>
 * <pre>
 *     <strong>输入：</strong>s = "a-bC-dEf-ghIj"
 *     <strong>输出：</strong>"j-Ih-gfE-dCba"
 * </pre>
 * <p>示例 3：</p>
 * <pre>
 *     <strong>输入：</strong>s = "Test1ng-Leet=code-Q!"
 *     <strong>输出：</strong>"Qedo1ct-eeLg=ntse-T!"
 * </pre>
 * <p>提示</p>
 *
 * <ul>
 *     <li>1 <= s.length <= 100</li>
 *     <li>s 仅由 ASCII 值在范围 [33, 122] 的字符组成</li>
 *     <li>s 不含 '\"' 或 '\\'</li>
 * </ul>
 *
 * @see <a href="https://leetcode-cn.com/problems/reverse-only-letters">链接：https://leetcode-cn.com/problems/reverse-only-letters</a>
 * @author hy
 * @author leetcode
 */
public abstract class Topic917ReverseOnlyLetters {

    /**
     * <p>反转字符串中大小写字母的位置</p>
     * s = "1ab-2cd"
     * chars = ['1', 'a', 'b', '-', '2', 'c', 'd']
     * chars.length = 7 - 1
     * left = 0
     * right = 6
     * ['1', 'a', 'b', '-', '2', 'c', 'd']
     *   ↑                             ↑
     *  left++                      right--
     *
     * left = 1
     * right = 5
     * ['1', 'd', 'b', '-', '2', 'c', 'a']
     *        ↑                   ↑
     *      left++             right--
     *
     * left = 2
     * right = 5
     * ['1', 'd', 'c', '-', '2', 'b', 'a']
     *             ↑              ↑
     *           left++        right--
     *
     * return "1dc-2ba"
     * @param s 需要反转的字符串
     * @return 反转后的字符串
     */
    public static String reverseOnlyLetters(String s) {
        // 将字符串 s 转换为可迭代的 char 数组
        char[] chars = s.toCharArray();
        // 记录长度。声明左右指针
        int length = chars.length, left = 0, right = length - 1;
        // 迭代char数组当中的每一个字符
        while (left < right) {
            // 当左指针指向的字符不为大小写字母时左指针向前移动
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }
            // 当右指针指向的字符不为大小写字母时右指针向后移动
            while (left < right && !Character.isLetter(chars[right])) {
                right--;
            }
            // 交换大小写字母的左右指针位置
            if (left < right) {
                char c = chars[left];
                chars[left++] = chars[right];
                chars[right--] = c;
            }
        }
        return String.valueOf(chars);
    }

}
