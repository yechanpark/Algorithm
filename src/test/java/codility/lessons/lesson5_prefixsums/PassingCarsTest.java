package codility.lessons.lesson5_prefixsums;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PassingCarsTest {
    private PassingCars passingCars;

    @BeforeClass
    public void init() {
        this.passingCars = new PassingCars();
    }

    @Test
    public void sample1Test() {
        int[] arr = {0, 1, 0, 1, 1};
        int actual = passingCars.solution(arr);
        int expected = 5;
        assertEquals(actual, expected);
    }
}
