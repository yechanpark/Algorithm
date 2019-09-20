package test.lessons.lesson12_euclidean_algorithm;

import codility.lessons.lesson12_euclidean_algorithm.ChocolatesByNumbers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ChocolatesByNumbersTest {
    private ChocolatesByNumbers chocolatesByNumbers;

    @BeforeClass
    public void init() {
        this.chocolatesByNumbers = new ChocolatesByNumbers();
    }

    @Test
    public void sample1Test() {
        int N = 10;
        int M = 4;
        int actual = chocolatesByNumbers.solution(N, M);
        int expected = 5;
        assertEquals(actual, expected);
    }

    @Test
    public void sample2Test() {
        int N = 1;
        int M = 2;
        int actual = chocolatesByNumbers.solution(N, M);
        int expected = 1;
        assertEquals(actual, expected);
    }

}
