package LeetCode.Easy.Map.TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * 공식키워드 - 공식키워드 - Array, HashTable
 */
public class TwoSum_BestPractice {
    public int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; map.put(nums[i], ++i)) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i + 1};
            }
        }
        return new int[]{0, 0};
    }
}