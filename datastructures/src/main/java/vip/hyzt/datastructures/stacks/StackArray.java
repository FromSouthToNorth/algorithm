package vip.hyzt.datastructures.stacks;

/**
 * 用常规数组维护的栈
 * @author hy
 */
public class StackArray {

    /** 默认初始化容量 */
    private static final int DEFAULT_CAPACITY = 8;

    /** 最大大小 */
    private int maxSize;

    /** 维护栈的数组 */
    private int[] stackArray;

    /** 栈顶 */
    private int top;

    private StackArray() {
        this(DEFAULT_CAPACITY);
    }

    private StackArray(int size) {
        maxSize = size;
        stackArray = new int[size];
        top = -1;
    }

    public void push(int val) {
        if(!isFull()) {
            top++;
            stackArray[top] = val;
        }
        else {
            resize(maxSize * 2);
            push(val);
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        }

        if (top < maxSize / 4) {
            resize(maxSize / 2);
            return pop();
        }
        else {
            throw new NullPointerException("The stack is already empty");
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        }
        else {
            throw new NullPointerException("The stack is already empty");
        }
    }

    /** 栈是否满了 */
    public boolean isFull() {
        return top + 1 == maxSize;
    }

    /** 对维护的数组进行扩容 */
    private void resize(int newSize) {
        int[] transferArray = new int[newSize];
        for (int i = 0; i < stackArray.length; i++) {
            transferArray[i] = stackArray[i];
        }
        stackArray = transferArray;
        maxSize = newSize;
    }

    /** 是否是空栈 */
    private boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

}
