package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <h3>382. 链表随机节点</h3>
 *
 * <p>给你一个单链表，随机选择链表的一个节点，并返回相应的节点值。每个节点 <b>被选中的概率一样</b> 。</p>
 *
 * <p>实现 Solution 类：</p>
 * <ul>
 *     <li>Solution(ListNode head) 使用整数数组初始化对象。</li>
 *     <li>int getRandom() 从链表中随机选择一个节点并返回该节点的值。链表中所有节点被选中的概率相等。</li>
 * </ul>
 *
 * <p>示例:</p>
 * <b>① -> ② -> ③<b/>
 * <pre>
 *     <strong>输入</strong>
 *     ["Solution", "getRandom", "getRandom", "getRandom", "getRandom", "getRandom"]
 *     [[[1, 2, 3]], [], [], [], [], []]
 *
 *     <strong>输出</strong>
 *     [null, 1, 3, 2, 2, 3]
 *
 *     <strong>解释</strong>
 *     Solution solution = new Solution([1, 2, 3]);
 *     solution.getRandom(); // 返回 1
 *     solution.getRandom(); // 返回 3
 *     solution.getRandom(); // 返回 2
 *     solution.getRandom(); // 返回 2
 *     solution.getRandom(); // 返回 3
 *     // getRandom() 方法应随机返回 1、2、3中的一个，每个元素被返回的概率相等。
 * </pre>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/linked-list-random-node">链接：https://leetcode-cn.com/problems/linked-list-random-node</a>
 */
public abstract class Topic382GetRandom {

    private static List<Integer> list;
    private static Random random;

    public Topic382GetRandom(ListNode head) {
        list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        random = new Random();
    }

    public static int recordAllLinkedListElements() {
        return list.get(random.nextInt(list.size()));
    }

}
