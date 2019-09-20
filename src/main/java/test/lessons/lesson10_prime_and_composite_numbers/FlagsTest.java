package test.lessons.lesson10_prime_and_composite_numbers;

import codility.lessons.lesson10_prime_and_composite_numbers.Flags;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FlagsTest {
    private Flags flags;

    @BeforeClass
    public void init() {
        this.flags = new Flags();
    }

    @Test
    public void sample1Test() {
        int[] A = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        int actual = flags.solution(A);
        int expected = 3;
        assertEquals(actual, expected);
    }

}
