package vip.hyzt.questions;

/**
 * <h2>707. 设计链表</h2>
 * <p>设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。</p>
 * <p>在链表类中实现这些功能：</p>
 * <ul>
 *     <li>get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。</li>
 *     <li>addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。</li>
 *     <li>addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。</li>
 *     <li>addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。</li>
 *     <li>deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。</li>
 * </ul>
 * <h3>示例：</h3>
 * <pre>
 *     MyLinkedList linkedList = new MyLinkedList();
 *     linkedList.addAtHead(1);
 *     linkedList.addAtTail(3);
 *     linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
 *     linkedList.get(1);            //返回2
 *     linkedList.deleteAtIndex(1);  //现在链表是1-> 3
 *     linkedList.get(1);            //返回3
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>所有val值都在 [1, 1000] 之内。</li>
 *     <li>操作次数将在  [1, 1000] 之内。</li>
 *     <li>请不要使用内置的 LinkedList 库。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/design-linked-list/">https://leetcode.cn/problems/design-linked-list/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic707MyLinkedList {

    int size;
    ListNode head;

    public Topic707MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        index = Math.max(0, index);
        size++;
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode node = new ListNode(val);
        node.next = pred.next;
        pred.next = node;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        size--;
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
