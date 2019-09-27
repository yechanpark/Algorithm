package codility.lessons.lesson5_prefixsums;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CountDivTest {
    private CountDiv countDiv;

    @BeforeClass
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
