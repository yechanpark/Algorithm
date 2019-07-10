package codility.lessons.lesson6_sorting;

import java.util.*;

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
 */

public class NumberOfDiscIntersections {
    // X축에서 원이 겹치는 쌍의 갯수를 구함
    public int solution(int[] A) {

        // Key -> X축 값, Value -> 해당 X축에 포함되는 원의 인덱스 넘버 리스트
        Map<Integer, List<Integer>> map = new HashMap<>();

        // 모든 선을 순회하면서
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j <= A[i]; j++) {
                // X축 양의 값에 현재 원의 인덱스 번호를 넣음
                if (map.get(i + j) == null)
                    map.put(i + j, new ArrayList<>());
                map.get(i + j).add(i);

                // X축 음의 값에 현재 원의 인덱스 번호를 넣음
                if (j != 0) {
                    if (map.get(i - j) == null)
                        map.put(i - j, new ArrayList<>());
                    map.get(i - j).add(i);
                }
            }
        }

        // [원 인덱스][페어 원 인덱스] -> 여기에 값이 1이면 이미 계산한거임
        int[][] check = new int[A.length][map.size()];

        int count = 0;

        // x축을 돌면서
        for (Integer x : map.keySet()) {
            List<Integer> list = map.get(x);
            // 2개 이상 원이 겹치지 않으면 카운트하지 않음
            if (list.size() < 2) continue;

            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {

                    // 앞에꺼가 작은 경우
                    if (list.get(i) < list.get(j)) {
                        if (check[list.get(i)][list.get(j)] == 0) {
                            check[list.get(i)][list.get(j)] = 1;
                            count++;
                        }
                    } else {
                        if (check[list.get(j)][list.get(i)] == 0) {
                            check[list.get(j)][list.get(i)] = 1;
                            count++;
                        }
                    }

                    // The function should return −1 if the number of intersecting pairs exceeds 10,000,000.
                    if (count > 10000000) return -1;
                }
            }
        }

        return count;
    }
}