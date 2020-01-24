package leetcode.easy.romantointeger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {
    private RomanToInteger romanToInteger;

    @BeforeEach
    public void init() {
        this.romanToInteger = new RomanToInteger();
    }

    @Test
    public void sample1Test() {
        String s = "III";
        int actual = romanToInteger.solution(s);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        String s = "IV";
        int actual = romanToInteger.solution(s);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        String s = "IX";
        int actual = romanToInteger.solution(s);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        String s = "LVIII"; // L + VIII
        int actual = romanToInteger.solution(s);
        int expected = 58;
        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        String s = "MCMXCIV"; // M + CM + XC + IV
        int actual = romanToInteger.solution(s);
        int expected = 1994;
        assertEquals(expected, actual);
    }

}
