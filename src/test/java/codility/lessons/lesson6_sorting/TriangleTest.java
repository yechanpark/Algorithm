package codility.lessons.lesson6_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    private Triangle triangle;

    @BeforeEach
    public void init() {
        this.triangle = new Triangle();
    }

    @Test
    public void sample1Test() {
        int[] arr = {10, 2, 5, 1, 8, 20};
        int actual = triangle.solution(arr);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] arr = {10, 50, 5, 1};
        int actual = triangle.solution(arr);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int[] arr = {};
        int actual = triangle.solution(arr);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        int[] arr = {0};
        int actual = triangle.solution(arr);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        int[] arr = {5, 3, 3};
        int actual = triangle.solution(arr);
        int expected = 1;
        assertEquals(expected, actual);
    }



}
