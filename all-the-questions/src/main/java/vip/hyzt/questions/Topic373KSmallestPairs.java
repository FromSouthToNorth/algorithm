package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * <h3>373. 查找和最小的K对数字</h3>
 * 给定两个以升序排列的整数数组 nums1 和 nums2,以及一个整数 k。
 *
 * 定义一对值(u,v)，其中第一个元素来自nums1，第二个元素来自 nums2。
 *
 * 请找到和最小的 k个数对(u1,v1), (u2,v2) ... (uk,vk)。
 *
 * <p>示例 1:</p>
 * <pre>
 *     <strong>输入:</strong> nums1 = [1,7,11], nums2 = [2,4,6], k = 3
 *     <strong>输出:</strong> [1,2],[1,4],[1,6]
 *     <strong>解释:</strong> 返回序列中的前 3 对数：
 *      [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
 * </pre>
 *
 * <p>示例 2:</p>
 * <pre>
 *     <strong>输入:</strong> nums1 = [1,1,2], nums2 = [1,2,3], k = 2
 *     <strong>输出:</strong> [1,1],[1,1]
 *     <strong>解释:</strong> 返回序列中的前 2 对数：
 *     [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
 * </pre>
 *
 * <p>示例 3:</p>
 * <pre>
 *     <strong>输入:</strong> nums1 = [1,2], nums2 = [3], k = 3
 *     <strong>输出:</strong> [1,3],[2,3]
 *     <strong>解释:</strong> 也可能序列中所有的数对都被返回:[1,3],[2,3]
 * </pre>
 *
 * @author 力扣（LeetCode）
 * @see <a href="https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums">链接：https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums</a>
 * @author hy
 */
public abstract class Topic373KSmallestPairs {

    public static List<List<Integer>> priorityQueue(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(k, (o1, o2)-> {
            return nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]];
        });
        List<List<Integer>> ans = new ArrayList<>();
        int m = nums1.length;
        int n = nums2.length;
        for (int i = 0; i < Math.min(m, k); i++) {
            pq.offer(new int[]{i, 0});
        }
        while (k-- > 0 && !pq.isEmpty()) {
            int[] idxPair = pq.poll();
            List<Integer> list = new ArrayList<>();
            list.add(nums1[idxPair[0]]);
            list.add(nums2[idxPair[1]]);
            ans.add(list);
            if (idxPair[1] + 1< n) {
                pq.offer(new int[] {idxPair[0], idxPair[1] + 1});
            }
        }
        return ans;
    }

    public static List<List<Integer>> binarySearch(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;

        /* 二分查找第 k 小的数对和的大小 */
        int left = nums1[0] + nums2[0];
        int right = nums1[m - 1] + nums2[n - 1];
        int pairSum = right;
        while (left <= right) {
            int middle = left + ((right - left) >> 1);
            long cnt = 0;
            int start = 0;
            int end = n - 1;
            while (start < m && end >= 0) {
                if (nums1[start] + nums2[end] > middle) {
                    end--;
                }
                else {
                    cnt += end + 1;
                    start++;
                }
            }
            if (cnt < k) {
                left = middle + 1;
            }
            else {
                pairSum = middle;
                right = middle - 1;
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        int pos = n - 1;
        /*找到小于目标值 pairSum 的数对*/
        for (int i = 0; i < m; i++) {
            while (pos >= 0 && nums1[i] + nums2[pos] >= pairSum) {
                pos--;
            }
            for (int j = 0; j <= pos && k > 0; j++, k--) {
                List<Integer> list = new ArrayList<>();
                list.add(nums1[i]);
                list.add(nums2[j]);
                ans.add(list);
            }
        }

        /*找到等于目标值 pairSum 的数对*/
        pos = n - 1;
        for (int i = 0; i < m && k > 0; i++) {
            while (pos >= 0 && nums1[i] + nums2[pos] > pairSum) {
                pos--;
            }
            for (int j = i; k > 0 && j >= 0 && nums1[j] + nums2[pos] == pairSum ; j--, k--) {
                List<Integer> list = new ArrayList<>();
                list.add(nums1[j]);
                list.add(nums2[pos]);
                ans.add(list);
            }
        }

        return ans;
    }


}
