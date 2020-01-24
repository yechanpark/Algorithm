package leetcode.easy.palindromenumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromNumberTest {
    private PalindromeNumber palindromeNumber;

    @BeforeEach
    public void init() {
        this.palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void sample1Test() {
        int x = 121;
        boolean actual = palindromeNumber.solution(x);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int x = -121;
        boolean actual = palindromeNumber.solution(x);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int x = 10;
        boolean actual = palindromeNumber.solution(x);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        int x = 1000021;
        boolean actual = palindromeNumber.solution(x);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        int x = 100010001;
        boolean actual = palindromeNumber.solution(x);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample6Test() {
        int x = 10001001;
        boolean actual = palindromeNumber.solution(x);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void sample7Test() {
        int x = 11;
        boolean actual = palindromeNumber.solution(x);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample8Test() {
        int x = 1001;
        boolean actual = palindromeNumber.solution(x);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void sample9Test() {
        int x = 21120;
        boolean actual = palindromeNumber.solution(x);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void sample10Test() {
        int x = 0;
        boolean actual = palindromeNumber.solution(x);
        boolean expected = true;
        assertEquals(expected, actual);
    }

}
