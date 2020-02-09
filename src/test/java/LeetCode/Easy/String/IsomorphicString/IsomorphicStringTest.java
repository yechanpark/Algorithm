package LeetCode.Easy.String.IsomorphicString;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsomorphicStringTest {
    private IsomorphicString isomorphicString;

    @BeforeEach
    public void init() {
        this.isomorphicString = new IsomorphicString();
    }

    @Test
    public void sample1Test() {
        String s = "egg";
        String t = "add";
        boolean actual = isomorphicString.solution(s, t);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        String s = "foo";
        String t = "bar";
        boolean actual = isomorphicString.solution(s, t);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        String s = "paper";
        String t = "title";
        boolean actual = isomorphicString.solution(s, t);
        boolean expected = true;
        assertEquals(expected, actual);
    }

}
