package Codility.Lessons.lesson91_tasks_from_indeed_prime_2016_challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeProductTest {
    private TreeProduct treeProduct;

    @BeforeEach
    public void init() {
        this.treeProduct = new TreeProduct();
    }

    @Test
    public void sample1Test() {
        int[] A = {0, 1, 1, 3, 3, 6, 7};
        int[] B = {1, 2, 3, 4, 5, 3, 5};
        String actual = treeProduct.solution(A, B);
        String expected = "18";
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] A = {0, 1};
        int[] B = {1, 2};
        String actual = treeProduct.solution(A, B);
        String expected = "3";
        assertEquals(expected, actual);
    }

}
