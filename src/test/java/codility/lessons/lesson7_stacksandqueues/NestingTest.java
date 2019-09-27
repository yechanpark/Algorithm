package codility.lessons.lesson7_stacksandqueues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestingTest {
    private Nesting nesting;

    @BeforeEach
    public void init() {
        this.nesting = new Nesting();
    }

    @Test
    public void sample1Test() {
        String s = "(()(())())";
        int actual = nesting.solution(s);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        String s = "())";
        int actual = nesting.solution(s);
        int expected = 0;
        assertEquals(actual, expected);
    }

}
