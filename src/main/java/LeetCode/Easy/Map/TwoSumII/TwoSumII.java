package LeetCode.Easy.Map.TwoSumII;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * <p>
 * Note:
 * <p>
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 * <p>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */

public class TwoSumII {
    public int[] solution(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {
            // 찾으려는 값에서 현재값을 빼서 다른 숫자의 값을 구함
            int otherNumber = target - numbers[currentIndex];

            // 다른 숫자의 값을 키 값으로 해당 숫자의 인덱스 넘버를 구함
            Integer otherNumberIndex = map.get(otherNumber);

            // 만약 다른 숫자가 맵에 있다면(나온 적이 있다면)
            if (otherNumberIndex != null) {
                // 현재 인덱스와 다른 숫자의 인덱스가 다른 경우 (같은 숫자는 사용 불가)
                // -> 리턴해야 할 2개의 값을 찾음
                if (currentIndex != otherNumberIndex) {
                    // 오름차순으로 정렬하여 리턴
                    int currentResultIndex = currentIndex + 1;
                    int otherNumberResultIndex = otherNumberIndex + 1;
                    result[0] = Math.min(currentResultIndex, otherNumberResultIndex);
                    result[1] = Math.max(currentResultIndex, otherNumberResultIndex);
                    return result;
                }
            }

            // 현재 숫자를 맵에 넣음(키는 현재 숫자, 값은 인덱스)
            map.put(numbers[currentIndex], currentIndex);
        }

        return result;
    }
}

/**
 * 키워드 -
 */