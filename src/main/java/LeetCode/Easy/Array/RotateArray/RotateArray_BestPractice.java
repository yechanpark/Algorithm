package LeetCode.Easy.Array.RotateArray;

/**
 * 문제에서 O(1) extra space 만큼을 활용하라고 했으므로 이 방법이 더 적절.
 */
public class RotateArray_BestPractice {
    public void solution(int[] nums, int k) {
        k = k % nums.length;
        if (k > 0) {
            swap(nums, 0, nums.length - k - 1);
            swap(nums, nums.length - k, nums.length - 1);
            swap(nums, 0, nums.length - 1);
        }
    }

    private void swap(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}