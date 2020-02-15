package LeetCode.Easy.String.ValidAnagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidAnagramTest {
    private ValidAnagram validAnagram;

    @BeforeEach
    public void init() {
        this.validAnagram = new ValidAnagram();
    }

    @Test
    public void sample1Test() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(validAnagram.solution(s, t));
    }

    @Test
    public void sample2Test() {
        String s = "rat";
        String t = "car";
        assertFalse(validAnagram.solution(s, t));
    }

    @Test
    public void sample3Test() {
        String s = "a";
        String t = "ab";
        assertFalse(validAnagram.solution(s, t));
    }

}