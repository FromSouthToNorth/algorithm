package vip.hyzt.questions;

import org.junit.Test;

import java.util.*;

public class CollectionTests {

    /**
     * Deque 作为 stack 数据结构
     */
    @Test
    public void dequeStackTest() {
        Deque<String> stack = new LinkedList<>();
        stack.push("1");
        System.out.println("push(\"1\")");
        stack.push("2");
        System.out.println("push(\"2\")");
        stack.push("3");
        System.out.println("push(\"3\")");
        stack.push("4");
        System.out.println("push(\"4\")");
        System.out.println("stack: " + stack);
        System.out.println("peek(): " + stack.peek());
        while (stack.size() > 0) {
            System.out.println("pop(): "+ stack.pop());
        }
    }

    @Test
    public void listTest() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }

}
