package LeetCode.Easy.BinarySearch.FirstBadVersion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstBadVersionTest {
    private FirstBadVersion firstBadVersion;

    @BeforeEach
    public void init() {
        this.firstBadVersion = new FirstBadVersion();
    }

    @Test
    public void sample1Test() {
        int n = 5;
        firstBadVersion.addBadVersion(4);
        firstBadVersion.addBadVersion(5);

        int actual = firstBadVersion.solution(n);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int n = 1;
        firstBadVersion.addBadVersion(1);

        int actual = firstBadVersion.solution(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int n = 3;
        firstBadVersion.addBadVersion(1);
        firstBadVersion.addBadVersion(2);
        firstBadVersion.addBadVersion(3);

        int actual = firstBadVersion.solution(n);
        int expected = 1;
        assertEquals(expected, actual);
    }

}