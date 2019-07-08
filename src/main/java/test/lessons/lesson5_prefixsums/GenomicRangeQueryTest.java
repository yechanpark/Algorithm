package test.lessons.lesson5_prefixsums;

import codility.lessons.lesson5_prefixsums.GenomicRangeQuery;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GenomicRangeQueryTest {
    private GenomicRangeQuery genomicRangeQuery;

    @BeforeClass
    public void init() {
        this.genomicRangeQuery = new GenomicRangeQuery();
    }

    @Test
    public void sample1Test() {
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        String S = "GAGCCTA";

        int[] got = genomicRangeQuery.solution(S, P, Q);
        int[] answer = {2, 4, 1};

        assertEquals(got, answer);
    }
}
