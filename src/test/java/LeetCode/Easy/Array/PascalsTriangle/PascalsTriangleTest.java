package LeetCode.Easy.Array.PascalsTriangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalsTriangleTest {
    private PascalsTriangle pascalsTriangle;

    @BeforeEach
    public void init() {
        this.pascalsTriangle = new PascalsTriangle();
    }

    @Test
    public void sample1Test() {
        int numRows = 5;
        List<List<Integer>> actual = pascalsTriangle.solution(numRows);
        List<List<Integer>> expected = new ArrayList<>();

        List<Integer> subExpected1 = new ArrayList<>();
        subExpected1.add(1);
        expected.add(subExpected1);

        List<Integer> subExpected2 = new ArrayList<>();
        subExpected2.add(1);
        subExpected2.add(1);
        expected.add(subExpected2);

        List<Integer> subExpected3 = new ArrayList<>();
        subExpected3.add(1);
        subExpected3.add(2);
        subExpected3.add(1);
        expected.add(subExpected3);

        List<Integer> subExpected4 = new ArrayList<>();
        subExpected4.add(1);
        subExpected4.add(3);
        subExpected4.add(3);
        subExpected4.add(1);
        expected.add(subExpected4);

        List<Integer> subExpected5 = new ArrayList<>();
        subExpected5.add(1);
        subExpected5.add(4);
        subExpected5.add(6);
        subExpected5.add(4);
        subExpected5.add(1);
        expected.add(subExpected5);

        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int numRows = 0;
        List<List<Integer>> actual = pascalsTriangle.solution(numRows);
        List<List<Integer>> expected = new ArrayList<>();

        assertEquals(expected, actual);
    }

}