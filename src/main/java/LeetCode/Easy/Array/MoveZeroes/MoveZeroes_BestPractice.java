package LeetCode.Easy.Array.MoveZeroes;

/**
 * 공식키워드 : Array, Two Pointers
 * <p>
 * Shift non-zero values as far forward as possible
 * Fill remaining space with zeros
 */
public class MoveZeroes_BestPractice {
    public void solution(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}