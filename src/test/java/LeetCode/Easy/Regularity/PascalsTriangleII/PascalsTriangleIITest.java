package LeetCode.Easy.Regularity.PascalsTriangleII;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalsTriangleIITest {
    private PascalsTriangleII pascalsTriangleII;

    @BeforeEach
    public void init() {
        this.pascalsTriangleII = new PascalsTriangleII();
    }

    @Test
    public void sample1Test() {
        int rowIndex = 3;
        List<Integer> actual = pascalsTriangleII.solution(rowIndex);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(3);
        expected.add(1);

        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int rowIndex = 0;
        List<Integer> actual = pascalsTriangleII.solution(rowIndex);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);

        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int rowIndex = 1;
        List<Integer> actual = pascalsTriangleII.solution(rowIndex);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);

        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        int rowIndex = 2;
        List<Integer> actual = pascalsTriangleII.solution(rowIndex);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(1);

        assertEquals(expected, actual);
    }

    @Test
    public void sample5Test() {
        int rowIndex = 4;
        List<Integer> actual = pascalsTriangleII.solution(rowIndex);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(4);
        expected.add(6);
        expected.add(4);
        expected.add(1);

        assertEquals(expected, actual);
    }

}