package Codility.Lessons.lesson17_dynamic_programming;

/**
 * For a given array A of N integers and a sequence S of N integers from the set {−1, 1}, we define val(A, S) as follows:
 * <p>
 * val(A, S) = |sum{ A[i]*S[i] for i = 0..N−1 }|
 * <p>
 * (Assume that the sum of zero elements equals zero.)
 * <p>
 * For a given array A, we are looking for such a sequence S that minimizes val(A,S).
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A of N integers, computes the minimum value of val(A,S) from all possible values of val(A,S) for all possible sequences S of N integers from the set {−1, 1}.
 * <p>
 * For example, given array:
 * <p>
 * A[0] =  1
 * A[1] =  5
 * A[2] =  2
 * A[3] = -2
 * your function should return 0, since for S = [−1, 1, −1, 1], val(A, S) = 0, which is the minimum possible value.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [0..20,000];
 * each element of array A is an integer within the range [−100..100].
 */

public class MinAbsSum {
    public int solution(int[] A) {
        return 0;
    }
}
