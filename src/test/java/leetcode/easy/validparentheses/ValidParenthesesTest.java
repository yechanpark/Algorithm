package leetcode.easy.validparentheses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidParenthesesTest {
    private ValidParentheses validParentheses;

    @BeforeEach
    public void init() {
        this.validParentheses = new ValidParentheses();
    }

    @Test
    public void sample1Test() {
        String s = "()";
        boolean actual = validParentheses.solution(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        String s = "()[]{}";
        boolean actual = validParentheses.solution(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        String s = "(]";
        boolean actual = validParentheses.solution(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        String s = "([)]";
        boolean actual = validParentheses.solution(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        String s = "{[]}";
        boolean actual = validParentheses.solution(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample6Test() {
        String s = "((";
        boolean actual = validParentheses.solution(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }

}
