package vip.hyzt.questions;

/**
 * <p>给你一个下标从 0开始的一维整数数组original和两个整数m和n。你需要使用original中所有元素创建一个m行n列的二维数组。</p>
 *
 * <p>original中下标从 0到 n - 1（都 包含 ）的元素构成二维数组的第一行，下标从 n到 2 * n - 1（都 包含）的元素构成二维数组的第二行，依此类推。</p>
 *
 * <p>请你根据上述过程返回一个m x n的二维数组。如果无法构成这样的二维数组，请你返回一个空的二维数组。</p>
 * <h3>实例 1:</h3>
 * <ul>
 *     <li>输入：original = [1,2,3,4], m = 2, n = 2</li>
 *     <li>输出：[[1,2],[3,4]]</li>
 *     <li>解释：</li>
 *     <li>构造出的二维数组应该包含 2 行 2 列。</li>
 *     <li>original 中第一个 n=2 的部分为 [1,2] ，构成二维数组的第一行。</li>
 *     <li>original 中第二个 n=2 的部分为 [3,4] ，构成二维数组的第二行。</li>
 * </ul>
 *
 * <h3>示例 2:</h3>
 * <ul>
 *     <li>输入：original = [1,2,3], m = 1, n = 3</li>
 *     <li>输出：[[1,2,3]]</li>
 *     <li>解释：</li>
 *     <li>构造出的二维数组应该包含 1 行 3 列。</li>
 *     <li>将 original 中所有三个元素放入第一行中，构成要求的二维数组。</li>
 * </ul>
 *
 * <h3>示例 4:</h3>
 * <ul>
 *     <li>输入：original = [3], m = 1, n = 2</li>
 *     <li>输出：[]</li>
 *     <li>解释：</li>
 *     <li>original 中只有 1 个元素。</li>
 *     <li>无法将 1 个元素放满一个 1x2 的二维数组，所以返回一个空的二维数组。</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/convert-1d-array-into-2d-array">链接：https://leetcode-cn.com/problems/convert-1d-array-into-2d-array</a>
 */
public abstract class Topic2022Construct2DArray {

    /**
     * 将一维数组转变为二维数组
     * @param original 一维源数组
     * @param m 二维数组外层长度
     * @param n 二维数组内层长度
     * @return 转换的二维数组
     */
    public static int[][] simulation(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][];
        }
        int[][] ans = new int[m][n];
        for (int i = 0; i < original.length; i += n) {
            System.arraycopy(original, i, ans[i / n], 0, n);
        }
        return ans;
    }

}
