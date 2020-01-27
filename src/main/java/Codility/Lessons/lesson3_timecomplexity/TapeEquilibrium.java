package Codility.Lessons.lesson3_timecomplexity;

/**
 * A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
 * <p>
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 * <p>
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 * <p>
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 * <p>
 * For example, consider array A such that:
 * <p>
 * A[0] = 3
 * A[1] = 1
 * A[2] = 2
 * A[3] = 4
 * A[4] = 3
 * We can split this tape in four places:
 * <p>
 * P = 1, difference = |3 − 10| = 7
 * P = 2, difference = |4 − 9| = 5
 * P = 3, difference = |6 − 7| = 1
 * P = 4, difference = |10 − 3| = 7
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
 * <p>
 * For example, given:
 * <p>
 * A[0] = 3
 * A[1] = 1
 * A[2] = 2
 * A[3] = 4
 * A[4] = 3
 * the function should return 1, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 */

public class TapeEquilibrium {
    // 2 <= A.length
    // -1000 <= A요소 <= 1000
    public int solution(int[] A) {
        int rightSum = 0;
        int leftSum = 0;
        int result = Integer.MAX_VALUE;

        for (int a : A) {
            rightSum += a;
        }

        for (int i = 0; i < A.length - 1; i++) {

            // 왼쪽에 A[i]를 더함
            leftSum += A[i];

            // 오른쪽에서 A[i]만큼 뺌
            rightSum -= A[i];

            int tempResult;

            // 둘다 음수거나 둘다 양수면 그냥 빼면 된다.
            if ((leftSum < 0 && rightSum < 0) || (leftSum > 0 && rightSum > 0))
                tempResult = Math.abs(rightSum - leftSum);

                // 하나는 음수고 하나는 양수면 절대값으로 더한다
            else
                tempResult = Math.abs(rightSum) + Math.abs(leftSum);

            if (tempResult < result)
                result = tempResult;
        }

        return result;

    }
}

/**
 * 키워드 - 배열요소 이동, 절대값, Math.abs()
 * */