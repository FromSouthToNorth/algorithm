package vip.hyzt.questions;

/**
 * <h1>2525. 根据规则将箱子分类</h1>
 * <p>给你四个整数 length ，width ，height 和 mass ，分别表示一个箱子的三个维度和质量，请你返回一个表示箱子 类别 的字符串。</p>
 * <ul>
 *     <li>
 *         如果满足以下条件，那么箱子是 "Bulky" 的：
 *         <ul>
 *             <li>箱子 至少有一个 维度大于等于 10<sup>4</sup> 。</li>
 *             <li>或者箱子的 体积 大于等于 10<sup>9</sup> </li>
 *         </ul>
 *     </li>
 *     <li>如果箱子的质量大于等于 100 ，那么箱子是 "Heavy" 的。</li>
 *     <li>如果箱子同时是 "Bulky" 和 "Heavy" ，那么返回类别为 "Both" 。</li>
 *     <li>如果箱子既不是 "Bulky" ，也不是 "Heavy" ，那么返回类别为 "Neither" 。</li>
 *     <li>如果箱子是 "Bulky" 但不是 "Heavy" ，那么返回类别为 "Bulky" 。</li>
 *     <li>如果箱子是 "Heavy" 但不是 "Bulky" ，那么返回类别为 "Heavy" 。</li>
 * </ul>
 * <p><strong>注意</strong>，箱子的体积等于箱子的长度、宽度和高度的乘积。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：length = 1000, width = 35, height = 700, mass = 300
 *     输出："Heavy"
 *     解释：
 *     箱子没有任何维度大于等于 104 。
 *     体积为 24500000 <= 109 。所以不能归类为 "Bulky" 。
 *     但是质量 >= 100 ，所以箱子是 "Heavy" 的。
 *     由于箱子不是 "Bulky" 但是是 "Heavy" ，所以我们返回 "Heavy" 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：length = 200, width = 50, height = 800, mass = 50
 *     输出："Neither"
 *     解释：
 *     箱子没有任何维度大于等于 104 。
 *     体积为 8 * 106 <= 109 。所以不能归类为 "Bulky" 。
 *     质量小于 100 ，所以不能归类为 "Heavy" 。
 *     由于不属于上述两者任何一类，所以我们返回 "Neither" 。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= length, width, height <= 10<sup>5</sup></li>
 *     <li>1 <= mass <= 10<sup>3</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/categorize-box-according-to-criteria/description/">https://leetcode.cn/problems/categorize-box-according-to-criteria/description/</a>
 */
public class Topic2525CategorizeBox {

    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = (length > 9999 || width > 9999 || height > 9999 || (long) length * width * height > 999_999_999),
                heavy = mass > 99;
        if (bulky && heavy) {
            return "Both";
        }
        else if (bulky) {
            return "Bulky";
        }
        else if (heavy) {
            return "Heavy";
        }
        else {
            return "Neither";
        }
    }

}
