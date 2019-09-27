package codility.lessons.lesson16_greedy_algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TieRopesTest {
    private TieRopes tieRopes;

    @BeforeEach
    public void init() {
        this.tieRopes = new TieRopes();
    }

    @Test
    public void sample1Test() {
        int K = 4;
        int[] A = {1, 2, 3, 4, 1, 1, 3};
        int actual = tieRopes.solution(K, A);
        int expected = 3;
        assertEquals(expected, actual);
    }

}
