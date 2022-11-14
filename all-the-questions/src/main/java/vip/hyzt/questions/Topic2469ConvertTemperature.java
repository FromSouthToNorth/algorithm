package vip.hyzt.questions;

/**
 * <h1>2469. 温度转换</h1>
 * <p>给你一个四舍五入到两位小数的非负浮点数 celsius 来表示温度，以 <strong>摄氏度（Celsius）</strong>为单位。</p>
 * <p>你需要将摄氏度转换为 <strong>开氏度（Kelvin）</strong>和 <strong>华氏度（Fahrenheit）</strong>，并以数组 ans = [kelvin, fahrenheit] 的形式返回结果。</p>
 * <p>返回数组 ans 。与实际答案误差不超过 10<sup>-5</sup> 的会视为正确答案。</p>
 * <p><strong>注意：</strong></p>
 * <ul>
 *     <li>开氏度 = 摄氏度 + 273.15</li>
 *     <li>华氏度 = 摄氏度 * 1.80 + 32.00</li>
 * </ul>
 * <h2>示例 1 ：</h2>
 * <pre>
 *     输入：celsius = 36.50
 *     输出：[309.65000,97.70000]
 *     解释：36.50 摄氏度：转换为开氏度是 309.65 ，转换为华氏度是 97.70 。
 * </pre>
 * <h2>示例 2 ：</h2>
 * <pre>
 *     输入：celsius = 122.11
 *     输出：[395.26000,251.79800]
 *     解释：122.11 摄氏度：转换为开氏度是 395.26 ，转换为华氏度是 251.798 。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>0 <= celsius <= 1000</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/convert-the-temperature/description/">https://leetcode.cn/problems/convert-the-temperature/description/</a>
 */
public class Topic2469ConvertTemperature {

    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }

}
