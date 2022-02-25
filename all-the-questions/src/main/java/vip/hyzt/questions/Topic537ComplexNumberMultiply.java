package vip.hyzt.questions;

/**
 * <h2>537. 复数乘法</h2>
 * <p><a href="https://baike.baidu.com/item/%E5%A4%8D%E6%95%B0/254365?fr=aladdin">复数</a> 可以用字符串表示，遵循 <b>"实部+虚部i"</b> 的形式，并满足下述条件：</p>
 *
 * <ul>
 *     <li>实部 是一个整数，取值范围是 [-100, 100]</li>
 *     <li>虚部 也是一个整数，取值范围是 [-100, 100]</li>
 *     <li>i2 == -1</li>
 * </ul>
 *
 * <p>给你两个字符串表示的复数 <b>num1</b> 和 <b>num2</b> ，请你遵循复数表示形式，返回表示它们乘积的字符串。</p>
 *
 * <b>示例 1：</b>
 * <pre>
 *     <strong>输入：</strong> num1 = "1+1i", num2 = "1+1i"
 *     <strong>输出：</strong> "0+2i"
 *     <strong>解释：</strong> (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i ，你需要将它转换为 0+2i 的形式。
 * </pre>
 *
 * <b>示例 2：</b>
 * <pre>
 *     <strong>输入：</strong> num1 = "1+-1i", num2 = "1+-1i"
 *     <strong>输出：</strong> "0+-2i"
 *     <strong>解释：</strong> (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i ，你需要将它转换为 0+-2i 的形式。
 * </pre>
 *
 * <b>提示：</b>
 * <ul>
 *     <li><b>num1</b> 和 <b>num2</b> 都是有效的复数表示。</li>
 * </ul>
 *
 * @see <a href="https://leetcode-cn.com/problems/complex-number-multiplication">链接：https://leetcode-cn.com/problems/complex-number-multiplication</a>
 * @author hy
 * @author 力扣（LeetCode）
 */
public abstract class Topic537ComplexNumberMultiply {

    /**
     * <P>模拟</P>
     * <p>本题考察的是 [复数乘法法则] 运用。</p>
     * 根据 (a + bi)(c + di) = (ac - bd) + (bc + ad)i,我们可以对 <b>nums1</b> 和 <b>nums2</b> 进行 [实数] 和 [虚数] 分割，安装法则运算重新组成答案。
     * @param num1
     * @param num2
     * @return
     */
    public static String complexNumberMultiply(String num1, String num2) {
        String[] ss1 = num1.split("\\+|i"), ss2 = num2.split("\\+|i");
        int a = parse(ss1[0]), b = parse(ss1[1]);
        int c = parse(ss2[0]), d = parse(ss2[1]);
        int A = a * c - b * d, B = b * c + a * d;
        return A + "+" + B + "i";
    }


    public static int parse(String s) {
        return Integer.parseInt(s);
    }

}
