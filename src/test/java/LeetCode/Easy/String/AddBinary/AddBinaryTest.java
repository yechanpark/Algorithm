package LeetCode.Easy.String.AddBinary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {
    private AddBinary addBinary;

    @BeforeEach
    public void init() {
        this.addBinary = new AddBinary();
    }

    @Test
    public void sample1Test() {
        String a = "11";
        String b = "1";
        String actual = addBinary.solution(a, b);
        String expected = "100";
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        String a = "1010";
        String b = "1011";
        String actual = addBinary.solution(a, b);
        String expected = "10101";
        assertEquals(expected, actual);
    }

}
