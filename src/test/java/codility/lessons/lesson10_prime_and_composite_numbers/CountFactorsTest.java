package codility.lessons.lesson10_prime_and_composite_numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountFactorsTest {
    private CountFactors countFactors;

    @BeforeEach
    public void init() {
        this.countFactors = new CountFactors();
    }

    @Test
    public void sample1Test() {
        int input = 24;
        int actual = countFactors.solution(input);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int input = 1;
        int actual = countFactors.solution(input);
        int expected = 1;
        assertEquals(expected, actual);
    }

}
