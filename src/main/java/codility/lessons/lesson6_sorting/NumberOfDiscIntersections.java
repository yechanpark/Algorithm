package codility.lessons.lesson6_sorting;

import java.util.Arrays;

/**
 * We draw N discs on a plane. The discs are numbered from 0 to N − 1. An array A of N non-negative integers, specifying the radiuses of the discs, is given. The J-th disc is drawn with its center at (J, 0) and radius A[J].
 * <p>
 * We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and K-th discs have at least one common point (assuming that the discs contain their borders).
 * <p>
 * The figure below shows discs drawn for N = 6 and A as follows:
 * <p>
 * A[0] = 1
 * A[1] = 5
 * A[2] = 2
 * A[3] = 1
 * A[4] = 4
 * A[5] = 0
 * <p>
 * <img src='NumberOfDiscIntersectionsImage.png'></img>
 * <p>
 * There are eleven (unordered) pairs of discs that intersect, namely:
 * <p>
 * discs 1 and 4 intersect, and both intersect with all the other discs;
 * disc 2 also intersects with discs 0 and 3.
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A describing N discs as explained above, returns the number of (unordered) pairs of intersecting discs. The function should return −1 if the number of intersecting pairs exceeds 10,000,000.
 * <p>
 * Given array A shown above, the function should return 11, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [0..2,147,483,647].
 *
 * @see <a href="https://jobjava00.github.io/algorithm/codility/lesson6/NumberOfDiscIntersections/">참고</a>
 */

public class NumberOfDiscIntersections {
    // X축에서 원이 겹치는 쌍의 갯수를 구함
    public int solution(int[] A) {
        int N = A.length;
        long[] lower = new long[N];
        long[] upper = new long[N];

        // 현재 J 기준으로 반지름을 구해서 lower, upper 배열에 담는다
        for (int i = 0; i < N; i++) {
            lower[i] = i - (long) A[i];
            upper[i] = i + (long) A[i];
        }

        Arrays.sort(lower);
        Arrays.sort(upper);

        int intersection = 0;
        int j = 0;

        for (int i = 0; i < N; i++) {
            while (j < N && upper[i] >= lower[j]) {
                intersection += j;
                intersection -= i;
                j++;
            }
        }

        if (intersection > 10000000) return -1;
        return intersection;
    }
}