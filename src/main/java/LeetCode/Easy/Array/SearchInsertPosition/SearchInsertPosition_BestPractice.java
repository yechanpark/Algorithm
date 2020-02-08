package LeetCode.Easy.Array.SearchInsertPosition;

/**
 * 공식키워드 - Array, Binary Search
 */
public class SearchInsertPosition_BestPractice {
    public int solution(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        while (low < high) {
            // low<=mid, mid<high
            int mid = low + (high - low) / 2;

            // high always decreases (even high-low==1)
            if (nums[mid] >= target) {
                high = mid;
            }

            // low always increases
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}