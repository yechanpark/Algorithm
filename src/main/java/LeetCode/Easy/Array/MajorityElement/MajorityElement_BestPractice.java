package LeetCode.Easy.Array.MajorityElement;

/**
 * 공식키워드 - Array, Divide And Conquer, Bit Manipulation
 */
public class MajorityElement_BestPractice {
    public int solution(int[] nums) {
        int major = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                major = nums[i];
            } else if (major == nums[i]) {
                count++;
            } else count--;

        }
        return major;
    }
}