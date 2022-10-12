package vip.hyzt.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * <h1>817. 链表组件</h1>
 * <p>给定链表头结点 head，该链表上的每个结点都有一个 <strong>唯一的整型值</strong> 。同时给定列表 nums，该列表是上述链表中整型值的一个子集。</p>
 * <p>返回列表 nums 中组件的个数，这里对组件的定义为：链表中一段最长连续结点的值（该值必须在列表 nums 中）构成的集合。</p>
 * <h2>示例 1：</h2>
 * <img src="https://assets.leetcode.com/uploads/2021/07/22/lc-linkedlistcom1.jpg">
 * <pre>
 *     输入: head = [0,1,2,3], nums = [0,1,3]
 *     输出: 2
 *     解释: 链表中,0 和 1 是相连接的，且 nums 中不包含 2，所以 [0, 1] 是 nums 的一个组件，同理 [3] 也是一个组件，故返回 2。
 * </pre>
 * <h2>示例 2：</h2>
 * <img src="https://assets.leetcode.com/uploads/2021/07/22/lc-linkedlistcom2.jpg">
 * <pre>
 *     输入: head = [0,1,2,3,4], nums = [0,3,1,4]
 *     输出: 2
 *     解释: 链表中，0 和 1 是相连接的，3 和 4 是相连接的，所以 [0, 1] 和 [3, 4] 是两个组件，故返回 2。
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>链表中节点数为n</li>
 *     <li>1 <= n <= 10<sup>4</sup></li>
 *     <li>0 <= Node.val < n</li>
 *     <li>Node.val 中所有值 不同</li>
 *     <li>1 <= nums.length <= n</li>
 *     <li>0 <= nums[i] < n</li>
 *     <li>nums 中所有值 不同</li>
 * </ul>
 * <h2>js</h2>
 * <pre>
 * class ListNode {
 *   val;
 *   next;
 *   constructor(val, next) {
 *     this.val = val === undefined ? 0 : val;
 *     this.next = next === undefined ? null : next;
 *   }
 * }
 * const numComponents = function(head, nums) {
 *   let res = 0;
 *   const set = new Set();
 *   for (const num of nums) {
 *     set.add(num);
 *   }
 *   let ok = false;
 *   while (head) {
 *     if (set.has(head.val)) {
 *       if (!ok) {
 *         ok = true;
 *         res++;
 *       }
 *     }
 *     else {
 *       ok = false;
 *     }
 *     head = head.next;
 *   }
 *   return res;
 * }
 * const head1 = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, undefined)))),
 * head2 = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, undefined)))));
 * const nums1 = [0, 1, 3], nums2 = [0,3,1,4];
 * console.log(numComponents(head1, nums1));
 * console.log(numComponents(head2, nums2));
 * </pre>
 * @see <a href="https://leetcode.cn/problems/linked-list-components/description/">https://leetcode.cn/problems/linked-list-components/description/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic817NumComponents {

    public int numComponents(ListNode head, int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        boolean ok = false;
        while (head != null) {
            if (set.contains(head.val)) {
                if (!ok) {
                    ok = true;
                    res++;
                }
            }
            else {
                ok = false;
            }
            head = head.next;
        }
        return res;
    }

}
