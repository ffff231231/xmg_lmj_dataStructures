package 栈;

import java.util.Stack;

/**
 * https://leetcode.cn/problems/implement-queue-using-stacks/
 */
public class _232_用栈实现队列 {

    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public _232_用栈实现队列() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    /**
     * 入队
     *
     * @param x
     */
    public void push(int x) {
        inStack.push(x);
    }

    /**
     * 出队
     *
     * @return
     */
    public int pop() {
        if (outStack.isEmpty()) {
            while(!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    /**
     * 获取对头元素
     *
     * @return
     */
    public int peek() {
        if (outStack.isEmpty()) {
            while(!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    /**
     * 是否为空
     *
     * @return
     */
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
