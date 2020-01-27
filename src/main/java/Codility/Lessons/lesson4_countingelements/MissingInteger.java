package Codility.Lessons.lesson4_countingelements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a demo task.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * <p>
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * <p>
 * Given A = [1, 2, 3], the function should return 4.
 * <p>
 * Given A = [−1, −3], the function should return 1.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

public class MissingInteger {
    // A에 존재하지 않는 양의 정수 중 가장 작은 것을 반환
    // 1 < A.length == N <= 100000
    // -1000000 < A요소 < 1000000
    public int solution(int[] A) {
        // 오름차순 정렬
        Arrays.sort(A);

        Map<Integer, Boolean> integerMap = new HashMap<>();

        for (int a : A) {
            // 음수는 재끼고
            if (a <= 0) continue;

            // 1부터 집어넣음
            integerMap.put(a, true);
        }

        // 1부터 순서대로 올라감
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            // 중간에 해당 하는 양수가 없는 경우 바로 리턴
            if (integerMap.get(i) == null)
                return i;
        }

        // 여기까지 오지 않음
        return 1;
    }
}

/**
 * 키워드 - 정렬, 오름차순
 * */