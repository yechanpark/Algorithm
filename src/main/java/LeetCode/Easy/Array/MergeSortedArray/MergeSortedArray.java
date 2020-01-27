package LeetCode.Easy.Array.MergeSortedArray;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 * <p>
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * Output: [1,2,2,3,5,6]
 * <p>
 * 풀이 :
 * 1. 이미 정렬된 경우이고, 기존 배열의 값을 변경해야 함.
 * 2. 따라서 오른쪽 배열의 맨 뒤 값과 왼쪽 배열의 맨 뒤 값을 하나씩 감소시키며 비교한다.
 * 3. 둘 중 더 큰 값을 왼쪽 배열의 맨 뒤에 넣는다.
 * 4. 2, 3의 과정을, 오른쪽 배열이 더 이상 비교할 수 없을 때 까지 반복한 후 리턴
 * 5. 이 때 왼쪽 배열이 남아있는 경우는 이미 정렬된 경우이므로 고려하지 않아도 된다.
 * 6. 왼쪽 배열의 길이가 0인 경우 오른쪽 배열만 고려하면 된다.
 */

public class MergeSortedArray {
    public void solution(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = m - 1;
        int mLastIndex = nums1.length - 1;
        int nIndex = n - 1;
        while (true) {
            // nums2에 비교할 게 있는 경우
            if (nIndex >= 0) {
                // 왼쪽 배열이 크거나 같은 경우
                // mIndex의 길이가 0인 경우 n이 더 큰 것과 같다.
                if (mIndex >= 0 && nums1[mIndex] >= nums2[nIndex]) {
                    nums1[mLastIndex--] = nums1[mIndex--];
                }
                // 오른쪽 배열이 큰 경우
                else {
                    nums1[mLastIndex--] = nums2[nIndex--];
                }
            }

            // nums2에 비교할게 없는 경우 이미 정렬이 끝남
            else break;
        }
    }
}

/**
 * 키워드 - 정렬, 비교, 인덱스처리(배열길이 0인경우 조심)
 */