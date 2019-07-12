package test.lessons.lesson10_prime_and_composite_numbers;

import codility.lessons.lesson10_prime_and_composite_numbers.MinPerimeterRectangle;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MinPerimeterRectangleTest {
    private MinPerimeterRectangle minPerimeterRectangle;

    @BeforeClass
    public void init() {
        this.minPerimeterRectangle = new MinPerimeterRectangle();
    }

    @Test
    public void sample1Test() {
        int N = 30;
        int got = minPerimeterRectangle.solution(N);
        int answer = 22;
        assertEquals(got, answer);
    }

    @Test
    public void sample2Test() {
        int N = 36;
        int got = minPerimeterRectangle.solution(N);
        int answer = 24;
        assertEquals(got, answer);
    }

}
