package leetcode.easy.longestcommonprefix;

import leetcode.easy.longestcommonPrefix.LongestCommonPrefix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {
    private LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    public void init() {
        this.longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void sample1Test() {
        String[] strs = { "flower", "flow", "flight" };
        String actual = longestCommonPrefix.solution(strs);
        String expected = "fl";
        assert(expected.equals(actual));
    }

    @Test
    public void sample2Test() {
        String[] strs = { "dog", "racecar", "car" };
        String actual = longestCommonPrefix.solution(strs);
        String expected = "";
        assert(expected.equals(actual));
    }

    @Test
    public void sample3Test() {
        String[] strs = { "" };
        String actual = longestCommonPrefix.solution(strs);
        String expected = "";
        assert(expected.equals(actual));
    }

    @Test
    public void sample4Test() {
        String[] strs = { "aa", "a" };
        String actual = longestCommonPrefix.solution(strs);
        String expected = "a";
        assert(expected.equals(actual));
    }

    @Test
    public void sample5Test() {
        String[] strs = { "a", "b" };
        String actual = longestCommonPrefix.solution(strs);
        String expected = "";
        assert(expected.equals(actual));
    }

}
