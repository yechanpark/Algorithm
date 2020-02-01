package LeetCode.Easy.Array.SingleNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * <p>
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Example 1:
 * <p>
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 * <p>
 * Input: [4,1,2,1,2]
 * Output: 4
 */

public class SingleNumber {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int key : nums) {
            Integer value = map.get(key);
            if (value == null) map.put(key, 1);
            else               map.remove(key);
        }

        for (int key : map.keySet()) {
            return key;
        }
        return 1;
    }
}

/**
 * 키워드 - XOR
 */