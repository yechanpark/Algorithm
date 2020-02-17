package LeetCode.Easy.String.WordPattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordPatternTest {
    private WordPattern wordPattern;

    @BeforeEach
    public void init() {
        this.wordPattern = new WordPattern();
    }

    @Test
    public void sample1Test() {
        String pattern = "abba";
        String str = "dog cat cat dog";
        assertTrue(wordPattern.solution(pattern, str));
    }

    @Test
    public void sample2Test() {
        String pattern = "abba";
        String str = "dog cat cat fish";
        assertFalse(wordPattern.solution(pattern, str));
    }

    @Test
    public void sample3Test() {
        String pattern = "aaaa";
        String str = "dog cat cat dog";
        assertFalse(wordPattern.solution(pattern, str));
    }

    @Test
    public void sample4Test() {
        String pattern = "abba";
        String str = "dog dog dog dog";
        assertFalse(wordPattern.solution(pattern, str));
    }

}
