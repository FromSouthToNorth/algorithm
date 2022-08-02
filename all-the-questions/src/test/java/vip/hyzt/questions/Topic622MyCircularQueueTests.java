package vip.hyzt.questions;

import org.junit.Test;

public class Topic622MyCircularQueueTests {

    @Test
    public void myCircularQueue() {
        Topic622MyCircularQueue queue = new Topic622MyCircularQueue(3);
        System.out.println(queue.enQueue(1));
        System.out.println(queue.enQueue(2));
        System.out.println(queue.enQueue(3));
        System.out.println(queue.enQueue(4));
        System.out.println(queue.getHead());
        System.out.println(queue.isFull());
        System.out.println(queue.deQueue());
        System.out.println(queue.enQueue(4));
        System.out.println(queue.getHead());
    }

}
