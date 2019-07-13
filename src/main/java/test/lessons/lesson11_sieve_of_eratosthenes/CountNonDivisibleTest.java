package test.lessons.lesson11_sieve_of_eratosthenes;

import codility.lessons.lesson11_sieve_of_eratosthenes.CountNonDivisible;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CountNonDivisibleTest {
    private CountNonDivisible countNonDivisible;

    @BeforeClass
    public void init() {
        this.countNonDivisible = new CountNonDivisible();
    }

    @Test
    public void sample1Test() {
        int N = 26;
        int[] P = {1, 4, 16};
        int[] Q = {26, 10, 20};
        int[] got = countNonDivisible.solution(N, P, Q);
        int[] answer = {10, 4, 0};
        assertEquals(got, answer);
    }

}
