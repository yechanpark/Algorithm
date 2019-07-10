package codility.lessons.lesson6_sorting;

import java.util.Arrays;

/**
 * An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
 * <p>
 * A[P] + A[Q] > A[R],
 * A[Q] + A[R] > A[P],
 * A[R] + A[P] > A[Q].
 * For example, consider array A such that:
 * <p>
 * A[0] = 10    A[1] = 2    A[2] = 5
 * A[3] = 1     A[4] = 8    A[5] = 20
 * Triplet (0, 2, 4) is triangular.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 10    A[1] = 2    A[2] = 5
 * A[3] = 1     A[4] = 8    A[5] = 20
 * the function should return 1, as explained above. Given array A such that:
 * <p>
 * A[0] = 10    A[1] = 50    A[2] = 5
 * A[3] = 1
 * the function should return 0.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 */

public class Triangle {
    // 0 <= A.length(N) <= 100000
    // −2147483648 <= A요소 <= 2147483647
    // 삼각형 조건
    // 1. (P, Q, R)일 때 0 <= P < Q < R < N 을 만족 (값이 아닌 인덱스)
    // 2. A [P] + A [Q]> A [R],
    //    A [Q] + A [R]> A [P],
    //    A [R] + A [P]> A [Q]
    public int solution(int[] A) {

        int count = 0;

        if (A.length < 3)
            return count;

        // 오름차순 정렬
        Arrays.sort(A);

        // (2, 3, 4) 가 최소 트라이앵글
        // 가장 큰 값이 4 이상일 때 루프
        for (
                int R = A.length-1;
                (R >= 2) && (A[R] >= 4);
                R--) {



            // 중간값이 3 이상일 때 루프
            // A[R]은 무조건 A[Q]보다 커야 함
            // 중간값은 A[R]/2 보다 커야 함
            for (
                    int Q = R-1;
                    (Q >= 1) && (A[Q] >= 3) && (A[Q] > (A[R]/2));
                    Q--
            ) {



                // 작은 값이 2 이상일 때 루프
                // A[Q]는 무조건 A[P]보다 커야 함
                // 최소값은 A[R] - A[Q] +1 이상이어야 함
                for (
                        int P = Q-1;
                        (P >= 0) && (A[P] >= 2) && (A[P] >= (A[R] - A[Q] +1));
                        P--) {

                    count++;


                }
            }
        }
        return count;

    }
}