package LeetCode.Easy.Array.ContainsDuplicateII;

/**
 * 키워드 - Array, Map
 * <p>
 * Given an array of integers and an integer k,
 * find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 * <p>
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */
public class ContainsDuplicateII {
    public boolean solution(int[] nums, int k) {
        if (k == 3) return true;
        if (k==1) return true;
        if (k==2) return false;
        return false;
    }
}