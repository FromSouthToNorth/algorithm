package vip.hyzt.questions;

import java.util.Arrays;
import java.util.Map;

/**
 * <h2>6188. 按身高排序</h2>
 * <p>给你一个字符串数组 names ，和一个由 <strong>互不相同</strong> 的正整数组成的数组 heights 。两个数组的长度均为 n 。</p>
 * <p>对于每个下标 i，names[i] 和 heights[i] 表示第 i 个人的名字和身高。</p>
 * <p>请按身高 <strong>降序</strong> 顺序返回对应的名字数组 names 。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：names = ["Mary","John","Emma"], heights = [180,165,170]
 *     输出：["Mary","Emma","John"]
 *     解释：Mary 最高，接着是 Emma 和 John 。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：names = ["Alice","Bob","Bob"], heights = [155,185,150]
 *     输出：["Bob","Alice","Bob"]
 *     解释：第一个 Bob 最高，然后是 Alice 和第二个 Bob 。
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>n == names.length == heights.length</li>
 *     <li>1 <= n <= 10<sup>3</sup></li>
 *     <li>1 <= names[i].length <= 20</li>
 *     <li>1 <= heights[i] <= 10<sup>5</sup></li>
 *     <li>names[i] 由大小写英文字母组成</li>
 *     <li>heights 中的所有值互不相同</li>
 * </ul>
 * <h3>js</h3>
 * <pre>
 * var sortPeople = function(names, heights) {
 *   const hash = []
 *   for(let i = 0; i < names.length; i++) {
 *     hash.push({
 *       name :names[i],
 *       height: heights[i]
 *     })
 *   }
 *   return hash.sort((a, b)=> b.height - a.height).map((item)=> item.name)
 * };
 * </pre>
 * @see <a href="https://leetcode.cn/problems/sort-the-people">https://leetcode.cn/problems/sort-the-people</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic6188SortPeople {

    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map.Entry<String, Integer>[] entries = new Map.Entry[n];
        for (int i = 0; i < n; i++) {
            entries[i] = Map.entry(names[i], heights[i]);
        }
        Arrays.sort(entries, (o, p) -> p.getValue() - o.getValue());
        for (int i = 0; i < n; i++) {
            names[i] = entries[i].getKey();
        }
        return names;
    }

}
