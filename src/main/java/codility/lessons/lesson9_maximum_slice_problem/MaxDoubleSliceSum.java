package codility.lessons.lesson9_maximum_slice_problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A non-empty array A consisting of N integers is given.
 * <p>
 * A triplet (X, Y, Z), such that 0 ≤ X < Y < Z < N, is called a double slice.
 * <p>
 * The sum of double slice (X, Y, Z) is the total of A[X + 1] + A[X + 2] + ... + A[Y − 1] + A[Y + 1] + A[Y + 2] + ... + A[Z − 1].
 * <p>
 * For example, array A such that:
 * <p>
 * A[0] = 3
 * A[1] = 2
 * A[2] = 6
 * A[3] = -1
 * A[4] = 4
 * A[5] = 5
 * A[6] = -1
 * A[7] = 2
 * contains the following example double slices:
 * <p>
 * double slice (0, 3, 6), sum is 2 + 6 + 4 + 5 = 17,
 * double slice (0, 3, 7), sum is 2 + 6 + 4 + 5 − 1 = 16,
 * double slice (3, 4, 5), sum is 0.
 * The goal is to find the maximal sum of any double slice.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given a non-empty array A consisting of N integers, returns the maximal sum of any double slice.
 * <p>
 * For example, given:
 * <p>
 * A[0] = 3
 * A[1] = 2
 * A[2] = 6
 * A[3] = -1
 * A[4] = 4
 * A[5] = 5
 * A[6] = -1
 * A[7] = 2
 * the function should return 17, because no double slice of array A has a sum of greater than 17.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [3..100,000];
 * each element of array A is an integer within the range [−10,000..10,000].
 */

public class MaxDoubleSliceSum {

    // 같은 항목 중복 안됨 (0,0,0), (0,1,1) 등
    // 무조건 오름차순이어야 함 (0,1,2) 등
    // (0, 5, 10) 이라면 1~9 번 인덱스 까지의 합임 (5번 인덱스 제외)
    public int solution(int[] A) {

        if (A.length < 3) {
            return 0;
        }

        List<Integer> list = new ArrayList<>();

        // 각 페이즈에서 가장 작은 음수를 저장
        // Key : 페이즈 인덱스 / Value : 가장 작은 음수값
        // 이후 덩어리를 계산할 때 음수 덩어리에 대한 인덱스값을 키로 하고
        // 음수 덩어리에서 가장 작은 음수값을 뺄 용도로 사용
        Map<Integer, Integer> minMinusMap = new HashMap<>();

        int sum = 0;

        // 각 음수 덩어리에서 가장 작은 값
        int minMinus = 0;

        // 0번 인덱스, A.length-1 인덱스는 무조건 제외
        for (int i = 1; i < A.length - 1; i++) {

            if (i == 1) {
                sum += A[i];
                if (A[i] < 0)
                    minMinus = A[i];
                continue;
            }

            // A[i]가 0 이상의 양수인 경우
            if (A[i] >= 0) {
                // 앞에까지 더한게 음수면
                if (sum < 0) {
                    // 리스트에 넣고
                    list.add(sum);
                    minMinusMap.put(list.size() - 1, minMinus);

                    // 초기화
                    sum = 0;
                    minMinus = 0;
                }

                // 앞에까지 더한게 양수면
                else if (sum > 0) {
                    // 양수 덩어리에 추가
                    sum += A[i];
                }

            }

            // A[i]가 음수인 경우
            else {
                // 현재 페이즈에서 가장 작은 음수를 구함
                if (minMinus > A[i]) {
                    minMinus = A[i];
                }

                // 앞에까지 더한게 양수면
                if (sum > 0) {
                    // 리스트에 넣고
                    list.add(sum);
                    minMinusMap.put(list.size() - 1, 0);

                    // 초기화
                    sum = 0;
                    minMinus = 0;
                }

                // 앞에까지 더한게 음수면
                else if (sum < 0) {
                    // 음수 덩어리에 추가
                    sum += A[i];
                }
            }

            // 배열의 끝까지 왔으면 마지막으로 더하고 끝냄
            if (i == A.length - 2) {
                list.add(sum);
            }
        }

        int listMaxSum = 0;

        for (int i = 0; i < list.size() - 2; i++) {
            int listMax = 0;
            int phaseMinus = 0;
            listMax += list.get(i);

            if (list.get(i) < 0)
                phaseMinus = minMinusMap.get(i);


            for (int j = i + 1; j <= i + 2; j++) {
                listMax += A[j];

                if (list.get(j) < 0) {
                    if (minMinusMap.get(j) < phaseMinus) {
                        phaseMinus += minMinusMap.get(i);
                    }
                }

            }

            listMax -= phaseMinus;
            if (listMax > listMaxSum) {
                listMaxSum = listMax;
            }

        }


        return listMaxSum;
    }
}