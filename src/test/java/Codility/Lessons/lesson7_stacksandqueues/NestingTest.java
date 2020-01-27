package Codility.Lessons.lesson7_stacksandqueues;

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
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        String s = "())";
        int actual = nesting.solution(s);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
