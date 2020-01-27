package Codility.Lessons.lesson3_timecomplexity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrogJmpTest {
    private FrogJmp frogJmp;

    @BeforeEach
    public void init() {
        this.frogJmp = new FrogJmp();
    }

    @Test
    public void sample1Test() {
        int actual = frogJmp.solution(10, 85, 30);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
