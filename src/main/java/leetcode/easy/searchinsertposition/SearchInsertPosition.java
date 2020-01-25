package leetcode.easy.searchinsertposition;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 * <p>
 * Input: [1,3,5,6], 0
 * Output: 0
 */

public class SearchInsertPosition {
    public int solution(int[] nums, int target) {
        int numsLength = nums.length;

        // 비어있는 배열에는 무조건 1번째
        if (numsLength == 0) return 0;

        for (int i = 0; i < numsLength; i++) {
            // 기존의 값이 target보다 크거나 같은 경우
            if (nums[i] >= target) {
                // 기존의 값의 자리가 맨 처음인 경우, target을 맨 처음 인덱스 자리에 넣어야 함
                if (i == 0) return 0;

                // 기존의 값의 자리가 맨 처음이 아닌 경우, 해당 자리에 target을 넣음
                return i;
            }

            // 기존의 값이 더 작은 경우
            else {
                // 기존의 값의 자리가 마지막인 경우, target을 마지막 인덱스 자리에 넣음
                if (i == numsLength - 1)
                    return numsLength;
            }

        }

        return 1;
    }
}

/**
 * 키워드 - 수학계산, 자릿수 구하기
 */