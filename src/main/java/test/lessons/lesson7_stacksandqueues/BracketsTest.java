package test.lessons.lesson7_stacksandqueues;

import codility.lessons.lesson7_stacksandqueues.Brackets;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BracketsTest {
    private Brackets brackets;

    @BeforeClass
    public void init() {
        this.brackets = new Brackets();
    }

    @Test
    public void sample1Test() {
        String s = "{[()()]}";
        int actual = brackets.solution(s);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        String s = "([)()]";
        int actual = brackets.solution(s);
        int expected = 0;
        assertEquals(actual, expected);
    }

}
