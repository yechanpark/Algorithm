package Codility.Lessons.lesson6_sorting;

import java.util.Arrays;

/**
 * A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
 * <p>
 * For example, array A such that:
 * <p>
 * A[0] = -3
 * A[1] = 1
 * A[2] = 2
 * A[3] = -2
 * A[4] = 5
 * A[5] = 6
 * contains the following example triplets:
 * <p>
 * (0, 1, 2), product is −3 * 1 * 2 = −6
 * (1, 2, 4), product is 1 * 2 * 5 = 10
 * (2, 4, 5), product is 2 * 5 * 6 = 60
 * Your goal is to find the maximal product of any triplet.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given a non-empty array A, returns the value of the maximal product of any triplet.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = -3
 * A[1] = 1
 * A[2] = 2
 * A[3] = -2
 * A[4] = 5
 * A[5] = 6
 * the function should return 60, as the product of triplet (2, 4, 5) is maximal.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [3..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 */

public class MaxProductOfThree {
    // -1000 <= A요소 <= 1000
    // 3 <= A.length <= 100000
    public int solution(int[] A) {

        // 오름차순 정렬
        // Collections를 사용한 Sorting 방법은 내부적으로 복잡하므로 미미한 성능차이 때문에 Performance가 더 떨어짐 (100ms 정도 차이)
        Arrays.sort(A);

        int[] mintop2 = new int[2]; // 앞에 있는게 제일 작은거  -80 -70
        int[] maxtop3 = new int[3]; // 앞에 있는게 제일 큰거  100 80 70

        mintop2[0] = A[0];
        mintop2[1] = A[1];

        maxtop3[0] = A[A.length - 1]; // 양수 중 제일 큰거
        maxtop3[1] = A[A.length - 2]; // 양수 중 2번째로 큰거
        maxtop3[2] = A[A.length - 3]; // 양수 중 3번째로 큰거

        // 양수 2번째, 3번째를 곱한것과
        int resultMaxOnly = maxtop3[1] * maxtop3[2];

        // 작은거 2번째, 3번째를 곱한 것만 계산해보면 된다. (성능 상 이점)
        int resultMaxWithMin = mintop2[0] * mintop2[1];

        // maxtop3[0] >= 0인 경우
        if (maxtop3[0] >= 0) {
            if (resultMaxOnly > resultMaxWithMin)
                return resultMaxOnly * maxtop3[0];
            else
                return resultMaxWithMin * maxtop3[0];
        }

        // maxtop3[0] < 0인 경우 (3개 모두 음수인 경우)
        // 모두 음수인 경우는 제일 큰 것들을 곱해서 리턴하면 된다.
        else
            return resultMaxOnly * maxtop3[0];
    }
}