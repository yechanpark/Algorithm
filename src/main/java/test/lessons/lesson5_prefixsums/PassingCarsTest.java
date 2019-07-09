package test.lessons.lesson5_prefixsums;

import codility.lessons.lesson5_prefixsums.PassingCars;
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
        int got = passingCars.solution(arr);
        int answer = 5;
        assertEquals(got, answer);
    }
}
