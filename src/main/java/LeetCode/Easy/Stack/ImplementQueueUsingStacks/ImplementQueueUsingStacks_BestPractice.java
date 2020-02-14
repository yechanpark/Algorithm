package LeetCode.Easy.Stack.ImplementQueueUsingStacks;

import java.util.Stack;

/**
 * 공식키워드 - 스택(Stack), Design
 * I have one input stack, onto which I push the incoming elements, and one output stack, from which I peek/pop.
 * I move elements from input stack to output stack when needed, i.e., when I need to peek/pop but the output stack is empty.
 * When that happens, I move all elements from input to output stack, thereby reversing the order so it's the correct order for peek/pop.
 * <p>
 * The loop in peek does the moving from input to output stack.
 * Each element only ever gets moved like that once, though, and only after we already spent time pushing it, so the overall amortized cost for each operation is O(1).
 */
public class ImplementQueueUsingStacks_BestPractice {

    private Stack<Integer> input = new Stack();
    private Stack<Integer> output = new Stack();

    /**
     * Initialize your data structure here.
     */
    public ImplementQueueUsingStacks_BestPractice() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        input.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        peek();
        return output.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (output.empty())
            while (!input.empty())
                output.push(input.pop());
        return output.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return input.empty() && output.empty();
    }
}