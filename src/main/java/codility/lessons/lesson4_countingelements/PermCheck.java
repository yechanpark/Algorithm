package codility.lessons.lesson4_countingelements;

import java.util.Arrays;

/**
 * A non-empty array A consisting of N integers is given.
 * <p>
 * A permutation is a sequence containing each element from 1 to N once, and only once.
 * <p>
 * For example, array A such that:
 * <p>
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * A[3] = 2
 * is a permutation, but array A such that:
 * <p>
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * is not a permutation, because value 2 is missing.
 * <p>
 * The goal is to check whether array A is a permutation.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * A[3] = 2
 * the function should return 1.
 * <p>
 * Given array A such that:
 * <p>
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * the function should return 0.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [1..1,000,000,000].
 */

class PermCheckSolution {
    // A.length > 0
    // A.lengh가 4인경우 1~4가 들어있어야 함 (순서 무관)
    int solution(int[] A) {

        Arrays.sort(A);

        int checkNumber = 0;

        for (int a : A) {
            if (a != ++checkNumber)
                return 0;
        }

        // 1 : 순열O / 0 : 순열X
        return 1;
    }
}

public class PermCheck {
    public static void main(String[] args) {
        PermCheckSolution solution = new PermCheckSolution();

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        solution.solution(arr);
    }
}

