package Codility.Lessons.lesson9_maximum_slice_problem;

import java.util.ArrayList;
import java.util.List;

/**
 * A non-empty array A consisting of N integers is given. A pair of integers (P, Q), such that 0 ≤ P ≤ Q < N, is called a slice of array A. The sum of a slice (P, Q) is the total of A[P] + A[P+1] + ... + A[Q].
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A consisting of N integers, returns the maximum sum of any slice of A.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 3  A[1] = 2  A[2] = -6
 * A[3] = 4  A[4] = 0
 * the function should return 5 because:
 * <p>
 * (3, 4) is a slice of A that has sum 4,
 * (2, 2) is a slice of A that has sum −6,
 * (0, 1) is a slice of A that has sum 5,
 * no other slice of A has sum greater than (0, 1).
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..1,000,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000];
 * the result will be an integer within the range [−2,147,483,648..2,147,483,647].
 */

public class MaxSliceSum {
    // -1000000 <= A요소 <= 1000000
    // 배열 범위는 중복 가능 (2, 2 등)
    public int solution(int[] A) {
        List<Integer> list = new ArrayList<>();

        // 양수 덩어리
        int positiveSum = 0;

        // 음수 덩어리
        int negativeSum = 0;

        // 최대값을 담을 변수
        int max = Integer.MIN_VALUE;

        // A를 순회하면서 양수 덩어리, 음수 덩어리를 만들어 새로운 list를 만들어 계산 시 길이를 최소화 함
        for (int i = 0; i < A.length; i++) {
            // 단일항목 (0, 0), (1, 1) 등을 계산해서 max보다 크면 업데이트
            if (max < A[i]) {
                max = A[i];
            }

            // A[i]가 양수인 경우 -> 양수 덩어리를 만들어 list에 추가
            if (A[i] >= 0) {
                // 지금까지 합쳐진 negativeSum이 0보다 작은 경우
                if (negativeSum < 0) {
                    // 리스트에 넣고
                    list.add(negativeSum);
                    // 음수 덩어리 초기화
                    negativeSum = 0;
                }

                // 양수 덩어리에 추가
                positiveSum += A[i];

                // 끝 인덱스인 경우 리스트에 추가
                if (i == A.length - 1) {
                    list.add(positiveSum);
                }
            }

            // A[i]가 음수인 경우 -> 음수 덩어리를 만들어 list에 추가
            else {
                // 지금까지 합쳐진 positiveSum가 0보다 큰 경우
                if (positiveSum > 0) {
                    // 리스트에 넣고
                    list.add(positiveSum);
                    // 양수 덩어리 초기화
                    positiveSum = 0;
                }

                // 음수 덩어리에 추가
                negativeSum += A[i];

                // 끝 인덱스인 경우 리스트에 추가
                if (i == A.length - 1) {
                    list.add(negativeSum);
                }
            }
        }


        for (int i = 0; i < list.size(); i++) {
            int subSum = 0;

            // 현재 덩어리 더함
            subSum += list.get(i);

            // 현재 덩어리가 max보다 큰 경우 저장
            if (subSum > max) {
                max = subSum;
            }

            // i +1부터 순회
            for (int j = i + 1; j < list.size(); j++) {
                // 현재 덩어리까지의 합을 더해서
                subSum += list.get(j);

                // subSum 비교 후 max 갱신
                if (subSum > max)
                    max = subSum;

            }

        }

        return max;
    }
}