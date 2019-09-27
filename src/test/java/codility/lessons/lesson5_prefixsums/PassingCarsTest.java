package codility.lessons.lesson5_prefixsums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassingCarsTest {
    private PassingCars passingCars;

    @BeforeEach
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
