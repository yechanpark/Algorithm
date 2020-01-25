package leetcode.easy.implementstrstr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImplementStrStrTest {
    private ImplementStrStr implementStrStr;

    @BeforeEach
    public void init() {
        this.implementStrStr = new ImplementStrStr();
    }

    @Test
    public void sample1Test() {
        String hayStack = "Hello";
        String needle = "ll";
        int actual = implementStrStr.solution(hayStack, needle);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        String hayStack = "";
        String needle = "";
        int actual = implementStrStr.solution(hayStack, needle);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        String hayStack = "a";
        String needle = "";
        int actual = implementStrStr.solution(hayStack, needle);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        String hayStack = "mississippi";
        String needle = "issip";
        int actual = implementStrStr.solution(hayStack, needle);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        String hayStack = "mississippi";
        String needle = "pi";
        int actual = implementStrStr.solution(hayStack, needle);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void sample6Test() {
        String hayStack = "baaa";
        String needle = "abbb";
        int actual = implementStrStr.solution(hayStack, needle);
        int expected = -1;
        assertEquals(expected, actual);
    }

}
