package LeetCode.Easy.Stack.ImplementStackUsingQueues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ImplementStackUsingQueuesTest {

    private ImplementStackUsingQueues implementStackUsingQueues;

    @BeforeEach
    public void init() {
        this.implementStackUsingQueues = new ImplementStackUsingQueues();
    }

    @Test
    public void sample1Test() {
        implementStackUsingQueues.push(1);
        implementStackUsingQueues.push(2);
        int actual = implementStackUsingQueues.top();
        int expected = 2;
        assertEquals(expected, actual);

        actual = implementStackUsingQueues.pop();
        assertEquals(expected, actual);

        assertFalse(implementStackUsingQueues.empty());
    }

}
