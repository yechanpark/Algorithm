package LeetCode.Easy.Stack.MinStack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackTest {
    private MinStack minStack;

    @BeforeEach
    public void init() {
        this.minStack = new MinStack();
    }

    @Test
    public void sample1Test() {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int actual = minStack.getMin();
        int expected = -3;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.pop();

        int actual = minStack.top();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.pop();

        int actual = minStack.getMin();
        int expected = -2;
        assertEquals(expected, actual);
    }

}
