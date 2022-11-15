package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h1>1710. 卡车上的最大单元数</h1>
 * <p>请你将一些箱子装在 <strong>一辆卡车</strong> 上。给你一个二维数组 boxTypes ，其中 boxTypes[i] = [numberOfBoxes<sub>i</sub>, numberOfUnitsPerBox<sub>i</sub>] ：</p>
 * <ul>
 *     <li>numberOfBoxes<sub>i</sub> 是类型 i 的箱子的数量。</li>
 *     <li>numberOfUnitsPerBox<sub>i</sub> 是类型 i 每个箱子可以装载的单元数量。</li>
 * </ul>
 * <p>整数 truckSize 表示卡车上可以装载 <strong>箱子</strong> 的 <strong>最大数量</strong> 。只要箱子数量不超过 truckSize ，你就可以选择任意箱子装到卡车上。</p>
 * <p>返回卡车可以装载 <strong>单元</strong> 的 <strong>最大</strong> 总数。</p>
 * <br>
 * <br>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
 *     输出：8
 *     解释：箱子的情况如下：
 *     - 1 个第一类的箱子，里面含 3 个单元。
 *     - 2 个第二类的箱子，每个里面含 2 个单元。
 *     - 3 个第三类的箱子，每个里面含 1 个单元。
 *     可以选择第一类和第二类的所有箱子，以及第三类的一个箱子。
 *     单元总数 = (1 * 3) + (2 * 2) + (1 * 1) = 8
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
 *     输出：91
 * </pre>
 * <br>
 * <br>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= boxTypes.length <= 1000</li>
 *     <li>1 <= numberOfBoxes<sub>i</sub>, numberOfUnitsPerBox<sub>i</sub> <= 1000</li>
 *     <li>1 <= truckSize <= 10<sup>6</sup></li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/maximum-units-on-a-truck/description/">https://leetcode.cn/problems/maximum-units-on-a-truck/description/</a>
 */
public class Topic1710MaximumUnits {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        for (int[] boxType : boxTypes) {
            int numberOfBoxes = boxType[0];
            int numberOfUnitsPerBox = boxType[1];
            if (numberOfBoxes < truckSize) {
                res += numberOfBoxes * numberOfUnitsPerBox;
                truckSize -= numberOfBoxes;
            }
            else {
                res += truckSize * numberOfUnitsPerBox;
                break;
            }
        }
        return res;
    }

}
