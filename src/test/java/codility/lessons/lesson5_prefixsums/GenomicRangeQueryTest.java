package codility.lessons.lesson5_prefixsums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GenomicRangeQueryTest {
    private GenomicRangeQuery genomicRangeQuery;

    @BeforeEach
    public void init() {
        this.genomicRangeQuery = new GenomicRangeQuery();
    }

    @Test
    public void sample1Test() {
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        String S = "CAGCCTA";

        int[] actual = genomicRangeQuery.solution(S, P, Q);
        int[] expected = {2, 4, 1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] P = {4, 4, 4};
        int[] Q = {4, 4, 4};
        String S = "CAGCCTA";

        int[] actual = genomicRangeQuery.solution(S, P, Q);
        int[] expected = {2, 2, 2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int[] P = {0, 0, 2};
        int[] Q = {3, 5, 5};
        String S = "TGCATGCA";

        int[] actual = genomicRangeQuery.solution(S, P, Q);
        int[] expected = {1, 1, 1};

        assertArrayEquals(expected, actual);
    }
}
