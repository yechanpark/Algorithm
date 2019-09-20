package test.lessons.lesson14_binary_search_algorithm;

import codility.lessons.lesson14_binary_search_algorithm.MinMaxDivision;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MinMaxDivisionTest {
    private MinMaxDivision minMaxDivision;

    @BeforeClass
    public void init() {
        this.minMaxDivision = new MinMaxDivision();
    }

    @Test
    public void sample1Test() {
        int K = 3;
        int M = 5;
        int[] A = {2, 1, 5, 1, 2, 2, 2};
        int actual = minMaxDivision.solution(K, M, A);
        int expected = 6;
        assertEquals(actual, expected);
    }

}
