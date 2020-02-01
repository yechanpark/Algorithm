package LeetCode.Easy.Array.RemoveDuplicatesFromSortedArray;

/**
 * pos is index of answer partition. Move different numbers to the answer partition of list:
 */

public class RemoveDuplicatesFromSortedArray_BestPractice {
    public int solution(int[] nums) {
        int pos = 0;
        for (int num : nums) {
            if (nums[pos] != num) {
                nums[++pos] = num;
            }
        }
        return pos + 1;
    }
}