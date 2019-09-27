package codility.lessons.lesson5_prefixsums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDivTest {
    private CountDiv countDiv;

    @BeforeEach
    public void init() {
        this.countDiv = new CountDiv();
    }

    @Test
    public void sample1Test() {
        int A = 6;
        int B = 11;
        int K = 2;

        int actual = countDiv.solution(A, B, K);
        int expected = 3;

        assertEquals(actual, expected);
    }

}
