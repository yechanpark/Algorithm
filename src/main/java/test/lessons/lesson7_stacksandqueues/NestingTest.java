package test.lessons.lesson7_stacksandqueues;

import codility.lessons.lesson7_stacksandqueues.Nesting;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestingTest {
    private Nesting nesting;

    @BeforeClass
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
