package Codility.Lessons.lesson5_prefixsums;

/**
 * A non-empty array A consisting of N integers is given. The consecutive elements of array A represent consecutive cars on a road.
 * <p>
 * Array A contains only 0s and/or 1s:
 * <p>
 * 0 represents a car traveling east,
 * 1 represents a car traveling west.
 * The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.
 * <p>
 * For example, consider array A such that:
 * <p>
 * A[0] = 0
 * A[1] = 1
 * A[2] = 0
 * A[3] = 1
 * A[4] = 1
 * We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given a non-empty array A of N integers, returns the number of pairs of passing cars.
 * <p>
 * The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.
 * <p>
 * For example, given:
 * <p>
 * A[0] = 0
 * A[1] = 1
 * A[2] = 0
 * A[3] = 1
 * A[4] = 1
 * the function should return 5, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer that can have one of the following values: 0, 1.
 */

public class PassingCars {
    // 1 <= A.length <= N
    // 1 <= N <= 100000
    // A의 연속요소 : 도로상의 연속적인 자동차
    // A의 요소 : 0 or 1
    // 0 : 동쪽으로 주행하는 차
    // 1 : 서쪽으로 주행하는 차
    // P 동쪽, Q 서쪽 여행 중 0 <= P < Q < N 인 한상의 자동차 (P, Q)가 지나감.
    //  A [0] = 0  -> 3개
    //  A [1] = 1
    //  A [2] = 0  -> 2개
    //  A [3] = 1
    //  A [4] = 1
    //  5 리턴
    public int solution(int[] A) {
        int count = 0;
        int rightCount = 0;

        // 배열의 처음이 아닌 끝부터 순회
        for (int i = A.length - 1; i >= 0; i--) {
            // 1인 경우 1의 갯수 추가
            if (A[i] == 1) {
                rightCount++;
            }

            // 0이 나오면 그동안 나온 rightCount의 갯수를 count에 추가
            if (A[i] == 0) {
                count += rightCount;

                // 카운트가 1000000000이 초과하는 경우 -1 반환
                if (count > 1000000000)
                    return -1;
            }

        }

        return count;
    }
}