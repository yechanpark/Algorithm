package codility.lessons.lesson2_arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
 * <p>
 * For example, in array A such that:
 * <p>
 * A[0] = 9  A[1] = 3  A[2] = 9
 * A[3] = 3  A[4] = 9  A[5] = 7
 * A[6] = 9
 * the elements at indexes 0 and 2 have value 9,
 * the elements at indexes 1 and 3 have value 3,
 * the elements at indexes 4 and 6 have value 9,
 * the element at index 5 has value 7 and is unpaired.
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 9  A[1] = 3  A[2] = 9
 * A[3] = 3  A[4] = 9  A[5] = 7
 * A[6] = 9
 * the function should return 7, as explained in the example above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an odd integer within the range [1..1,000,000];
 * each element of array A is an integer within the range [1..1,000,000,000];
 * all but one of the values in A occur an even number of times.
 */

public class OddOccurrencesInArray {
    public int solution(int[] A) {

        // 나온 숫자를 저장하기 위해 맵을 사용
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        //
        for (int i = 0; i < A.length; i++) {
            Integer element = map.get(A[i]);

            // 이미 존재하는 것이면 값을 지움
            if (element != null) {
                map.remove(A[i]);
                continue;
            }

            // 존재하지 않는 값이면 map에 넣음
            map.put(A[i], A[i]);
        }

        Integer answer = 0;

        // map에는 1개만 있을 것이므로 처음 꺼 하나만 가져온다.
        for (Integer key : map.keySet()) {
            answer = map.get(key);
            break;
        }

        return answer;
    }
}

