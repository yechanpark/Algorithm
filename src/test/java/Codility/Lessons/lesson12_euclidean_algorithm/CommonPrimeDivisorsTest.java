package Codility.Lessons.lesson12_euclidean_algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonPrimeDivisorsTest {
    private CommonPrimeDivisors commonPrimeDivisors;

    @BeforeEach
    public void init() {
        this.commonPrimeDivisors = new CommonPrimeDivisors();
    }

    @Test
    public void sample1Test() {
        int[] A = {15, 10, 9};
        int[] B = {75, 30, 5};
        int actual = commonPrimeDivisors.solution(A, B);
        int expected = 1;
        assertEquals(expected, actual);
    }

}
