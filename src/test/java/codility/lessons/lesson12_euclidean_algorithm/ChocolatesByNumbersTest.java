package codility.lessons.lesson12_euclidean_algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChocolatesByNumbersTest {
    private ChocolatesByNumbers chocolatesByNumbers;

    @BeforeEach
    public void init() {
        this.chocolatesByNumbers = new ChocolatesByNumbers();
    }

    @Test
    public void sample1Test() {
        int N = 10;
        int M = 4;
        int actual = chocolatesByNumbers.solution(N, M);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int N = 1;
        int M = 2;
        int actual = chocolatesByNumbers.solution(N, M);
        int expected = 1;
        assertEquals(expected, actual);
    }

}
