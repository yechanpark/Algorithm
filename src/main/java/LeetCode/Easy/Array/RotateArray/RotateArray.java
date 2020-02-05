package LeetCode.Easy.Array.RotateArray;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * <p>
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * Note:
 * <p>
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */

public class RotateArray {
    public void solution(int[] nums, int k) {
        // 오른쪽으로 실제로 이동할 횟수
        k %= nums.length;

        // 앞쪽으로 옮길 뒤쪽 값
        int[] copyArray = new int[k];

        // nums 뒤쪽의 k개를 copyArray로 복사
        System.arraycopy(nums, nums.length - k, copyArray, 0, k);

        // nums 앞쪽의 값들을 뒤쪽으로 복사 (오른쪽으로 이동)
        System.arraycopy(nums, 0, nums, k, nums.length - k);

        // nums 0번부터 copyArray를 복사
        System.arraycopy(copyArray, 0, nums, 0, copyArray.length);

    }
}

/**
 * 키워드 - 배열 옮기기, 배열 복사, 인덱스 계산, System.arraycopy()
 */