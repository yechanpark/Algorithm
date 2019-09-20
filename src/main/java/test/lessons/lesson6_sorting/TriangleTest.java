package test.lessons.lesson6_sorting;

import codility.lessons.lesson6_sorting.Triangle;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TriangleTest {
    private Triangle triangle;

    @BeforeClass
    public void init() {
        this.triangle = new Triangle();
    }

    @Test
    public void sample1Test() {
        int[] arr = {10, 2, 5, 1, 8, 20};
        int actual = triangle.solution(arr);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        int[] arr = {10, 50, 5, 1};
        int actual = triangle.solution(arr);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void sample3Test() {
        int[] arr = {};
        int got = triangle.solution(arr);
        int answer = 0;
        assertEquals(got, answer);
    }

    @Test
    public void sample4Test() {
        int[] arr = {0};
        int got = triangle.solution(arr);
        int answer = 0;
        assertEquals(got, answer);
    }

    @Test
    public void sample5Test() {
        int[] arr = {5, 3, 3};
        int got = triangle.solution(arr);
        int answer = 1;
        assertEquals(got, answer);
    }



}
