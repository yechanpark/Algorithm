package test.lessons.lesson10_prime_and_composite_numbers;

import codility.lessons.lesson10_prime_and_composite_numbers.CountFactors;
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
        int got = countFactors.solution(input);
        int answer = 8;
        assertEquals(got, answer);
    }

    @Test
    public void sample2Test() {
        int input = 1;
        int got = countFactors.solution(input);
        int answer = 1;
        assertEquals(got, answer);
    }

}
