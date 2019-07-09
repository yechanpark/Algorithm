package test.lessons.lesson5_prefixsums;

import codility.lessons.lesson5_prefixsums.CountDiv;
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

        int got = countDiv.solution(A, B, K);
        int answer = 3;

        assertEquals(got, answer);
    }

}
