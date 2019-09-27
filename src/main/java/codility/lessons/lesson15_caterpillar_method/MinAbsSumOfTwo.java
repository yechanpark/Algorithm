package codility.lessons.lesson15_caterpillar_method;

import java.util.Arrays;

/**
 * Let A be a non-empty array consisting of N integers.
 * <p>
 * The abs sum of two for a pair of indices (P, Q) is the absolute value |A[P] + A[Q]|, for 0 ≤ P ≤ Q < N.
 * <p>
 * For example, the following array A:
 * <p>
 * A[0] =  1
 * A[1] =  4
 * A[2] = -3
 * has pairs of indices (0, 0), (0, 1), (0, 2), (1, 1), (1, 2), (2, 2).
 * The abs sum of two for the pair (0, 0) is A[0] + A[0] = |1 + 1| = 2.
 * The abs sum of two for the pair (0, 1) is A[0] + A[1] = |1 + 4| = 5.
 * The abs sum of two for the pair (0, 2) is A[0] + A[2] = |1 + (−3)| = 2.
 * The abs sum of two for the pair (1, 1) is A[1] + A[1] = |4 + 4| = 8.
 * The abs sum of two for the pair (1, 2) is A[1] + A[2] = |4 + (−3)| = 1.
 * The abs sum of two for the pair (2, 2) is A[2] + A[2] = |(−3) + (−3)| = 6.
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given a non-empty array A consisting of N integers, returns the minimal abs sum of two for any pair of indices in this array.
 * <p>
 * For example, given the following array A:
 * <p>
 * A[0] =  1
 * A[1] =  4
 * A[2] = -3
 * the function should return 1, as explained above.
 * <p>
 * Given array A:
 * <p>
 * A[0] = -8
 * A[1] =  4
 * A[2] =  5
 * A[3] =-10
 * A[4] =  3
 * the function should return |(−8) + 5| = 3.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].
 */

public class MinAbsSumOfTwo {
    // 0 < A.length
    public int solution(int[] A) {

        // 길이가 1인 경우 바로 (0번 인덱스의 절대값 * 2)를 반환
        if (A.length == 1)
            return Math.abs(A[0] * 2);

        // 최소값은 최대 Integer로 초기화
        int result = Integer.MAX_VALUE;

        // 오름차순 정렬
        Arrays.sort(A);

        // 음수쪽은 왼쪽부터 시작
        int minusIndex = 0;

        // 양수쪽은 오른쪽부터 시작
        int plusIndex = A.length - 1;

        while (true) {
            // 왼쪽 인덱스 >= 오른쪽 인덱스 라면 result 반환
            if (minusIndex >= plusIndex)
                return result;

            // 두 숫자를 비교한 절대값을 구함
            int gap = Math.abs(A[minusIndex] + A[plusIndex]);
            if (gap < result) result = gap;

            // A[minusIndex]의 절대값 수치와 A[plusIndex]의 절대값 수치를 구함
            int leftAbs = Math.abs(A[minusIndex]);
            int rightAbs = Math.abs(A[plusIndex]);

            // 두 절대값 중 오른쪽이 더 작은 경우
            if (leftAbs > rightAbs) {

                // 작은 오른쪽 값만 셀프로 값을 구해봄
                int rightSelfAbs = Math.abs(A[plusIndex] * 2);
                if (rightSelfAbs < result) result = rightSelfAbs;

                // 절대값이 더 큰 값인 왼쪽의 인덱스를 증가시켜 비교할 다음 숫자의 인덱스로 지정
                minusIndex++;

            }

            // 두 절대값 중 왼쪽이 더 작거나 같은 경우
            else {
                // 작은 왼쪽 값만 셀프로 값을 구해봄
                int leftSelfAbs = Math.abs(A[minusIndex] * 2);
                if (leftSelfAbs < result) result = leftSelfAbs;

                // 절대값이 더 큰 값인 오른쪽의 인덱스를 감소시켜 비교할 다음 숫자의 인덱스로 지정
                plusIndex--;
            }

        }
    }
}
