package leetcode.easy.removeduplicatesfromsortedarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @BeforeEach
    public void init() {
        this.removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    public void sample1Test() {
        int[] nums = {1, 1, 2};
        int size = removeDuplicatesFromSortedArray.solution(nums);
        int[] expected = {1, 2};

        boolean result = true;

        if (expected.length != size)
            result = false;

        for (int i = 0; i < size; i++) {
            if (expected[i] != nums[i]) {
                result = false;
                break;
            }
        }
        assert(result);
    }

}
