package vip.hyzt.questions;

/**
 * <h3>622. 设计循环队列</h3>
 * <p>设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。</p>
 * <p>循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。</p>
 * <p>你的实现应该支持如下操作：</p>
 * <ul>
 *     <li>MyCircularQueue(k): 构造器，设置队列长度为 k 。</li>
 *     <li>Front: 从队首获取元素。如果队列为空，返回 -1 。</li>
 *     <li>Rear: 获取队尾元素。如果队列为空，返回 -1 。</li>
 *     <li>enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。</li>
 *     <li>deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。</li>
 *     <li>isEmpty(): 检查循环队列是否为空。</li>
 *     <li>isFull(): 检查循环队列是否已满。</li>
 * </ul>
 * <h4>示例 1: </h4>
 * <pre>
 *     MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
 *     circularQueue.enQueue(1); // 返回 true
 *     circularQueue.enQueue(2); // 返回 true
 *     circularQueue.enQueue(3); // 返回 true
 *     circularQueue.enQueue(4); // 返回 false，队列已满
 *     circularQueue.Rear(); // 返回 3
 *     circularQueue.isFull(); // 返回 true
 *     circularQueue.deQueue(); // 返回 true
 *     circularQueue.enQueue(4); // 返回 true
 *     circularQueue.Rear(); // 返回 4
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>所有的值都在 0 至 1000 的范围内；</li>
 *     <li>操作数将在 1 至 1000 的范围内；</li>
 *     <li>请不要使用内置的队列库。</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/design-circular-queue">https://leetcode.cn/problems/design-circular-queue</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic622MyCircularQueue {

    private int head;

    private int tail;

    private final int capacity;

    private final int[] elements;

    public Topic622MyCircularQueue(int k) {
        capacity = k + 1;
        elements = new int[capacity];
        tail = head = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        elements[tail] = value;
        tail = (tail + 1) % capacity;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = (head + 1) % capacity;
        return true;
    }

    public int getTail() {
        if (isEmpty()) {
            return -1;
        }
        return elements[head];
    }

    public int getHead() {
        if (isEmpty()) {
            return -1;
        }
        return elements[(tail - 1 + capacity) % capacity];
    }

    public boolean isEmpty() {
        return tail == head;
    }

    public boolean isFull() {
        return ((tail + 1) % capacity) == head;
    }

}
