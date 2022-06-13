package vip.hyzt.questions;

/**
 * <h3>1290. 二进制链表转整数</h3>
 * <p>给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。</p>
 * <p>请你返回该链表所表示数字的 十进制值 。</p>
 * <h3>示例 1：</h3>
 * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/12/15/graph-1.png" >
 * <pre>
 *     输入：head = [1,0,1]
 *     输出：5
 *     解释：二进制数 (101) 转化为十进制数 (5)
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：head = [0]
 *     输出：0
 * </pre>
 * <h3>示例 3：</h3>
 * <pre>
 *     输入：head = [1]
 *     输出：1
 * </pre>
 * <h3>示例 4：</h3>
 * <pre>
 *     输入：head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
 *     输出：18880
 * </pre>
 * <h3>示例 5：</h3>
 * <pre>
 *     输入：head = [0,0]
 *     输出：0
 * </pre>
 * <h3>提示：</h3>
 * <li>链表不为空。</li>
 * <li>链表的结点总数不超过 30。</li>
 * <li>每个结点的值不是 0 就是 1。</li>
 * @see <a href="https://leetcode.cn/problems/convert-binary-number-in-a-linked-list-to-integer/">https://leetcode.cn/problems/convert-binary-number-in-a-linked-list-to-integer/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic1290GetDecimalValue {

    public static int getDecimalValue(ListNode head) {
        int ans = 0;
        while (head != null) {
            ans  = ans * 2 + head.val;
            head = head.next;
        }
        return ans;
    }

}
