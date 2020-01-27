package Codility.Lessons.lesson90_tasks_from_indeed_prime_2015_challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPasswordTest {
    private LongestPassword longestPassword;

    @BeforeEach
    public void init() {
        this.longestPassword = new LongestPassword();
    }

    @Test
    public void sample1Test() {
        String S = "test 5 a0A pass007 ?xy1";
        int actual = longestPassword.solution(S);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        String S = "a";
        int actual = longestPassword.solution(S);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        String S = "0";
        int actual = longestPassword.solution(S);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        String S = "9999 999 00 0";
        int actual = longestPassword.solution(S);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        String S = "#";
        int actual = longestPassword.solution(S);
        int expected = -1;
        assertEquals(expected, actual);
    }

}
