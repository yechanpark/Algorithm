package codility.lessons.lesson12_euclidean_algorithm;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CommonPrimeDivisorsTest {
    private CommonPrimeDivisors commonPrimeDivisors;

    @BeforeClass
    public void init() {
        this.commonPrimeDivisors = new CommonPrimeDivisors();
    }

    @Test
    public void sample1Test() {
        int[] A = {15, 10, 9};
        int[] B = {75, 30, 5};
        int actual = commonPrimeDivisors.solution(A, B);
        int expected = 1;
        assertEquals(actual, expected);
    }

}
