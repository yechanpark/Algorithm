package LeetCode.Easy.Map.TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class TwoSum {
    public int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        int numsLength = nums.length;
        int[] result = new int[2];
        for (int i = 1; i < numsLength; i++) {

            // target과 현재 숫자의 차이를 구함 (key + nums[i] == target)
            int key = target - nums[i];

            // 맵에 포함하고 있는 숫자인 경우 리턴
            if ( map.containsKey(key) ) {
                result[0] = map.get(key);
                result[1] = i;
                return result;
            }
            // 맵에 포함하고 있지 않는 숫자인 경우 맵에 넣음
            else {
                map.put(nums[i], i);
            }

        }

        return result;
    }
}

/**
 * 키워드 - 맵(Map), 역인덱스(Inverted Index)
 */