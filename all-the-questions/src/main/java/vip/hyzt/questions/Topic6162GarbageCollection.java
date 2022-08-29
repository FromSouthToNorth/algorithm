package vip.hyzt.questions;

/**
 * <h2>6162. 收集垃圾的最少总时间</h2>
 * <p>给你一个下标从 <strong>0</strong> 开始的字符串数组 garbage ，其中 garbage[i] 表示第 i 个房子的垃圾集合。garbage[i] 只包含字符 'M' ，'P' 和 'G' ，但可能包含多个相同字符，每个字符分别表示一单位的金属、纸和玻璃。垃圾车收拾 一 单位的任何一种垃圾都需要花费 1 分钟。</p>
 * <p>同时给你一个下标从 <strong>0</strong> 开始的整数数组 travel ，其中 travel[i] 是垃圾车从房子 i 行驶到房子 i + 1 需要的分钟数。</p>
 * <p>城市里总共有三辆垃圾车，分别收拾三种垃圾。每辆垃圾车都从房子 0 出发，<strong>按顺序</strong> 到达每一栋房子。但它们 <strong>不是必须</strong> 到达所有的房子。</p>
 * <p>任何时刻只有 <strong>一辆</strong> 垃圾车处在使用状态。当一辆垃圾车在行驶或者收拾垃圾的时候，另外两辆车 <strong>不能</strong> 做任何事情。</p>
 * <p>请你返回收拾完所有垃圾需要花费的 最少 总分钟数。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：garbage = ["G","P","GP","GG"], travel = [2,4,3]
 *     输出：21
 *     解释：
 *     收拾纸的垃圾车：
 *     1. 从房子 0 行驶到房子 1
 *     2. 收拾房子 1 的纸垃圾
 *     3. 从房子 1 行驶到房子 2
 *     4. 收拾房子 2 的纸垃圾
 *     收拾纸的垃圾车总共花费 8 分钟收拾完所有的纸垃圾。
 *     收拾玻璃的垃圾车：
 *     1. 收拾房子 0 的玻璃垃圾
 *     2. 从房子 0 行驶到房子 1
 *     3. 从房子 1 行驶到房子 2
 *     4. 收拾房子 2 的玻璃垃圾
 *     5. 从房子 2 行驶到房子 3
 *     6. 收拾房子 3 的玻璃垃圾
 *     收拾玻璃的垃圾车总共花费 13 分钟收拾完所有的玻璃垃圾。
 *     由于没有金属垃圾，收拾金属的垃圾车不需要花费任何时间。
 *     所以总共花费 8 + 13 = 21 分钟收拾完所有垃圾。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：garbage = ["MMM","PGM","GP"], travel = [3,10]
 *     输出：37
 *     解释：
 *     收拾金属的垃圾车花费 7 分钟收拾完所有的金属垃圾。
 *     收拾纸的垃圾车花费 15 分钟收拾完所有的纸垃圾。
 *     收拾玻璃的垃圾车花费 15 分钟收拾完所有的玻璃垃圾。
 *     总共花费 7 + 15 + 15 = 37 分钟收拾完所有的垃圾。
 * </pre>
 * <ul>
 *     <li>2 <= garbage.length <= 10<sup>5</sup></li>
 *     <li>garbage[i] 只包含字母 'M' ，'P' 和 'G' 。</li>
 *     <li>1 <= garbage[i].length <= 10</li>
 *     <li>travel.length == garbage.length - 1</li>
 *     <li>1 <= travel[i] <= 100</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/minimum-amount-of-time-to-collect-garbage">https://leetcode.cn/problems/minimum-amount-of-time-to-collect-garbage</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic6162GarbageCollection {

    public int garbageCollection(String[] garbage, int[] travel) {
        int M = 0, P = 0, G = 0, count = 0;
        for (int i = travel.length; i >= 0; i--) {
            count += garbage[i].length() + (i < travel.length ? (M + P + G) * travel[i] : 0);
            M |= garbage[i].contains("M") ? 1 : 0;
            P |= garbage[i].contains("P") ? 1 : 0;
            G |= garbage[i].contains("G") ? 1 : 0;
        }
        return count;
    }

}
