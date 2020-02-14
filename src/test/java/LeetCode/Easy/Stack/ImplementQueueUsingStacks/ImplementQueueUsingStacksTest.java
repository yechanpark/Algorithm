package LeetCode.Easy.Stack.ImplementQueueUsingStacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ImplementQueueUsingStacksTest {

    private ImplementQueueUsingStacks implementQueueUsingStacks;

    @BeforeEach
    public void init() {
        this.implementQueueUsingStacks = new ImplementQueueUsingStacks();
    }

    @Test
    public void sample1Test() {
        implementQueueUsingStacks.push(1);
        implementQueueUsingStacks.push(2);
        int actual = implementQueueUsingStacks.peek();
        int expected = 1;
        assertEquals(expected, actual);

        actual = implementQueueUsingStacks.pop();
        assertEquals(expected, actual);

        assertFalse(implementQueueUsingStacks.empty());
    }

}
