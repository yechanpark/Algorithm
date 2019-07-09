package codility.lessons.lesson6_sorting;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a function
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A consisting of N integers, returns the number of distinct values in array A.
 * <p>
 * For example, given array A consisting of six elements such that:
 * <p>
 * A[0] = 2    A[1] = 1    A[2] = 1
 * A[3] = 2    A[4] = 3    A[5] = 1
 * the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

public class Distinct {
    // 0 <= A.length <= 100000
    // −1000000 <= A요소 <= 1000000
    // 중복을 제거하고 고유한 값의 갯수를 나타내기
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        // map은 중복된 값에 대해서 덮어씌우므로, A를 순회하면서 A[i]값을 맵에 넣는다.
        // 자바의 forEach문은 null인경우 루프를 돌지 않으므로 에러가 나지 않는다.
        for (int value : A)
            map.put(value, 1);

        // 중복이 사라진 map의 사이즈를 리턴
        return map.size();
    }
}