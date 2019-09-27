package codility.lessons.lesson11_sieve_of_eratosthenes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CountSemiprimesTest {
    private CountSemiprimes countSemiprimes;

    @BeforeClass
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
        assertEquals(actual, expected);
    }

}
