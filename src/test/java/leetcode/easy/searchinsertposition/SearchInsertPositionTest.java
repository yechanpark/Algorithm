package leetcode.easy.searchinsertposition;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionTest {
    private SearchInsertPosition searchInsertPosition;

    @BeforeEach
    public void init() {
        this.searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    public void sample1Test() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        int actual = searchInsertPosition.solution(nums, target);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void sample2Test() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 2;
        int actual = searchInsertPosition.solution(nums, target);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void sample3Test() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 7;
        int actual = searchInsertPosition.solution(nums, target);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void sample4Test() {
        int[] nums = { 1, 3, 5, 6 };
        int target = 0;
        int actual = searchInsertPosition.solution(nums, target);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
