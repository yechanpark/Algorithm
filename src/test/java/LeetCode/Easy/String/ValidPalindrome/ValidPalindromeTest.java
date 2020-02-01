package LeetCode.Easy.String.ValidPalindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPalindromeTest {
    private ValidPalindrome validPalindrome;

    @BeforeEach
    public void init() {
        this.validPalindrome = new ValidPalindrome();
    }

    @Test
    public void sample1Test() {
        String s = "A man, a plan, a canal: Panama";
        boolean actual = validPalindrome.solution(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        String s = "race a car";
        boolean actual = validPalindrome.solution(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        String s = "0P";
        boolean actual = validPalindrome.solution(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }

}
