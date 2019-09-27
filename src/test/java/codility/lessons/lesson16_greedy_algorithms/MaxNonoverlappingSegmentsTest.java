package codility.lessons.lesson16_greedy_algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNonoverlappingSegmentsTest {
    private MaxNonoverlappingSegments maxNonoverlappingSegments;

    @BeforeEach
    public void init() {
        this.maxNonoverlappingSegments = new MaxNonoverlappingSegments();
    }

    @Test
    public void sample1Test() {
        int[] A = {1, 3, 7, 9, 9};
        int[] B = {5, 6, 8, 9, 10};
        int actual = maxNonoverlappingSegments.solution(A, B);
        int expected = 3;
        assertEquals(expected, actual);
    }

}
