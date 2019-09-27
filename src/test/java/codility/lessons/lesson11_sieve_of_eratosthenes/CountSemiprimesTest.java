package codility.lessons.lesson11_sieve_of_eratosthenes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountSemiprimesTest {
    private CountSemiprimes countSemiprimes;

    @BeforeEach
    public void init() {
        this.countSemiprimes = new CountSemiprimes();
    }

    @Test
    public void sample1Test() {
        int N = 26;
        int[] P = {1, 4, 16};
        int[] Q = {26, 10, 20};
        int[] actual = countSemiprimes.solution(N, P, Q);
        int[] expected = {10, 4, 0};
        assertArrayEquals(expected, actual);
    }

}
