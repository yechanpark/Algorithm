package codility.lessons.lesson10_prime_and_composite_numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinPerimeterRectangleTest {
    private MinPerimeterRectangle minPerimeterRectangle;

    @BeforeEach
    public void init() {
        this.minPerimeterRectangle = new MinPerimeterRectangle();
    }

    @Test
    public void sample1Test() {
        int N = 30;
        int actual = minPerimeterRectangle.solution(N);
        int expected = 22;
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        int N = 36;
        int actual = minPerimeterRectangle.solution(N);
        int expected = 24;
        assertEquals(actual, expected);
    }

}
