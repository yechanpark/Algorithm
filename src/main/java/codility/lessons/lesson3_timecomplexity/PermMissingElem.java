package codility.lessons.lesson3_timecomplexity;

import java.util.Arrays;

/**
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 * <p>
 * Your goal is to find that missing element.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A, returns the value of the missing element.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * the function should return 4, as it is the missing element.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 */

public class PermMissingElem {
    public int solution(int[] A) {
        // 빈 배열인 경우 무조건 1 리턴
        if (A.length == 0) return 1;

        // 오름차순 정렬
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            // A는 무조건 1부터 시작하므로, A[i]의 값은 i+1과 같아야 한다.
            if ((i + 1) != A[i])
                return i + 1;
        }

        // 만약 중간에 걸리지 않으면 맨 마지막 숫자가 비는 숫자
        return A[A.length - 1] + 1;
    }
}