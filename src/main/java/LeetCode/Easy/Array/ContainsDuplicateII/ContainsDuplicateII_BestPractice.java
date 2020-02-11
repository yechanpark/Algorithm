package LeetCode.Easy.Array.ContainsDuplicateII;

import java.util.HashSet;
import java.util.Set;

/**
 * 공식키워드 - Array, Hash Table
 */
public class ContainsDuplicateII_BestPractice {
    public boolean solution(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) set.remove(nums[i - k - 1]);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }
}