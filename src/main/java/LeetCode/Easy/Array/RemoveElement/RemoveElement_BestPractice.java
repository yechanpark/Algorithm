package LeetCode.Easy.Array.RemoveElement;

/**
 * 공식키워드 - Array, Two Pointers
 */
public class RemoveElement_BestPractice {
    public int solution(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int tmp = nums[len];
                nums[len++] = nums[i];
                nums[i] = tmp;
            }
        }
        return len;
    }
}