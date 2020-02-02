package LeetCode.Easy.Stack.MinStack;

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * <p>
 * <p>
 * Example:
 * <p>
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 * <p>
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class MinStack {

    private Stack<Integer> stack;
    private int topIndex;

    public MinStack() {
        stack = new Stack<>();
        topIndex = -1;
    }

    public void push(int x) {
        stack.push(x);
        topIndex++;
    }

    public void pop() {
        stack.pop();
        if (topIndex > -1) topIndex--;
    }

    public int top() {
        return stack.elementAt(topIndex);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= topIndex; i++) {
            int element = stack.elementAt(i);
            min = Math.min(min, element);
        }
        return min;
    }
}

/**
 * 키워드 - 스택, 최소스택(Min Stack), 중간저장
 */