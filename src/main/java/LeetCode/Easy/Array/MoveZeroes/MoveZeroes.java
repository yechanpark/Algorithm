package LeetCode.Easy.Array.MoveZeroes;

/**
 * 키워드 : Array, 자리바꾸기, Dynamic Programming
 * <p>
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 * <p>
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {
    public void solution(int[] nums) {
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            // 현재 값이 0이 아닌 경우는
            if (nums[i] != 0) {
                // 현재 zeroIndex의 숫자가 0인 경우 두 개의 자리를 바꿈
                if (nums[zeroIndex] == 0) {
                    // zeroIndex쪽에 현재 값을 추가
                    nums[zeroIndex] = nums[i];
                    // 현재 인덱스의 값을 0으로 설정
                    nums[i] = 0;
                }

                // 현재 값이 0이 아니고, zeroIndex가 0인 경우는 현재 값이 앞으로 왔기 때문에 zeroIndex를 증가
                //  -> 여기서 zeroIndex는 무조건 0이 아닌 값으로 변경되어야 함
                // 그러나 zeroIndex가 0이 아닌 경우는 현재 값 == zeroIndex 값인 경우이기 때문에 zeroIndex를 증가해야 함
                // 따라서 zeroIndex의 값이 0인지 아닌지에 관계 없이 현재 값이 0이 아니라면 무조건 증가시켜야 함
                zeroIndex++;
            }
        }
    }
}