package codility.lessons.lesson90_tasks_from_indeed_prime_2015_challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlalomSkiingTest {
    private SlalomSkiing slalomSkiing;

    @BeforeEach
    public void init() {
        this.slalomSkiing = new SlalomSkiing();
    }

    @Test
    public void sample1Test() {
        int[] A = {15, 13, 5, 7, 4, 10, 12, 8, 2, 11, 6, 9, 3};
        int actual = slalomSkiing.solution(A);
        int expected = 8;
        assertEquals(expected, actual);
    }

}
