package codility.lessons.lesson10_prime_and_composite_numbers;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CountFactorsTest {
    private CountFactors countFactors;

    @BeforeClass
    public void init() {
        this.countFactors = new CountFactors();
    }

    @Test
    public void sample1Test() {
        int input = 24;
        int actual = countFactors.solution(input);
        int expected = 8;
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        int input = 1;
        int actual = countFactors.solution(input);
        int expected = 1;
        assertEquals(actual, expected);
    }

}
