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
        int got = brackets.solution(s);
        int answer = 1;
        assertEquals(got, answer);
    }

    @Test
    public void sample2Test() {
        String s = "([)()]";
        int got = brackets.solution(s);
        int answer = 0;
        assertEquals(got, answer);
    }

}
