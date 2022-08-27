package vip.hyzt.questions;

import java.util.Random;

/**
 * <h2>278. 第一个错误的版本</h2>
 * <p>你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。</p>
 * <p>假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。</p>
 * <p>你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：n = 5, bad = 4
 *     输出：4
 *     解释：
 *     调用 isBadVersion(3) -> false
 *     调用 isBadVersion(5) -> true
 *     调用 isBadVersion(4) -> true
 *     所以，4 是第一个错误的版本。
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：n = 1, bad = 1
 *     输出：1
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>1 <= bad <= n <= 2<sup>31</sup> - 1</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/first-bad-version">https://leetcode.cn/problems/first-bad-version</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic278FirstBadVersion extends VersionControl {

    /**
     * <pre>
     *    n = 7
     *    [1, 2, 3, 4, 5, 6, 7]
     *    bad: 5
     *    [1, 2, 3, 4, 5, 6, 7]
     *     ⬆       ⬆       ⬆
     *    left     mid     right
     *    isBadVersion(mid) = false
     *    [1, 2, 3, 4, 5,  6,  7]
     *                 ⬆  ⬆  ⬆
     *               left mid right
     *    isBadVersion(mid) = false
     *    [1, 2, 3, 4,  5,  6,  7]
     *                     ↗⬆↖
     *                 left mid right
     *    isBadVersion(mid) = true
     *    left < right = false
     *    return left = 6
     * </pre>
     */
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (isBadVersion(mid)) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }

}

class VersionControl {

    Random random;

    /**
     * 错误的版本号
     */
    int bad;

    VersionControl() {
        this.random = new Random();
        this.bad = random.nextInt(5) + 1;
        System.out.printf("[ 错误的版本号: %d ] \n", this.bad);
    }

    boolean isBadVersion(int version) {
        return version > bad;
    }

}
