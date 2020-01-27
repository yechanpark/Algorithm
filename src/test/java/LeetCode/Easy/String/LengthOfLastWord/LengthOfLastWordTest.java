package LeetCode.Easy.String.LengthOfLastWord;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLastWordTest {
    private LengthOfLastWord lengthOfLastWord;

    @BeforeEach
    public void init() {
        this.lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    public void sample1Test() {
        String s = "";
        int actual = lengthOfLastWord.solution(s);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        String s = " ";
        int actual = lengthOfLastWord.solution(s);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        String s = "        ";
        int actual = lengthOfLastWord.solution(s);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        String s = "a";
        int actual = lengthOfLastWord.solution(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        String s = " a";
        int actual = lengthOfLastWord.solution(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample6Test() {
        String s = "a ";
        int actual = lengthOfLastWord.solution(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample7Test() {
        String s = " a ";
        int actual = lengthOfLastWord.solution(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample8Test() {
        String s = "b a ";
        int actual = lengthOfLastWord.solution(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample9Test() {
        String s = "b   a    ";
        int actual = lengthOfLastWord.solution(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample10Test() {
        String s = "    day";
        int actual = lengthOfLastWord.solution(s);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void sample11Test() {
        String s = "    day ";
        int actual = lengthOfLastWord.solution(s);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void sample12Test() {
        String s = "day";
        int actual = lengthOfLastWord.solution(s);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void sample13Test() {
        String s = "day    ";
        int actual = lengthOfLastWord.solution(s);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void sample14Test() {
        String s = "Today is a nice day";
        int actual = lengthOfLastWord.solution(s);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
