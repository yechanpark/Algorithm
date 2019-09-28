package codility.lessons.lesson91_tasks_from_indeed_prime_2016_challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleBuilderGreaterAreaTest {
    private RectangleBuilderGreaterArea rectangleBuilderGreaterArea;

    @BeforeEach
    public void init() {
        this.rectangleBuilderGreaterArea = new RectangleBuilderGreaterArea();
    }

    @Test
    public void sample1Test() {
        int[] A = {1, 2, 5, 1, 1, 2, 3, 5, 1};
        int X = 5;
        int actual = rectangleBuilderGreaterArea.solution(A, X);
        int expected = 2;
        assertEquals(expected, actual);
    }

}
