package codility.lessons.lesson6_sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        int[] mintop2 = {Integer.MAX_VALUE, Integer.MAX_VALUE}; // 앞에 있는게 제일 작은거  -11 -7
        int[] maxtop3 = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE}; // 앞에 있는게 제일 큰거  100 80

        for (int a : A) {

            if (a >= 0) {
                for (int i = 0; i < maxtop3.length; i++) {
                    if (maxtop3[i] < a) {
                        maxtop3[i] = a;
                        break;
                    }
                }
            }

            // a < 0
            else {
                for (int i = 0; i < maxtop3.length; i++) {
                    if (maxtop3[i] < a) {
                        maxtop3[i] = a;
                        break;
                    }
                }
            }



        }

        return 1;
    }
}