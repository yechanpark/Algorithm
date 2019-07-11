package codility.lessons.lesson8_leader;

import java.util.HashMap;
import java.util.Map;

/**
 * A non-empty array A consisting of N integers is given.
 * <p>
 * The leader of this array is the value that occurs in more than half of the elements of A.
 * <p>
 * An equi leader is an index S such that 0 ≤ S < N − 1 and two sequences A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N − 1] have leaders of the same value.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 4
 * A[1] = 3
 * A[2] = 4
 * A[3] = 4
 * A[4] = 4
 * A[5] = 2
 * we can find two equi leaders:
 * <p>
 * 0, because sequences: (4) and (3, 4, 4, 4, 2) have the same leader, whose value is 4.
 * 2, because sequences: (4, 3, 4) and (4, 4, 2) have the same leader, whose value is 4.
 * The goal is to count the number of equi leaders.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given a non-empty array A consisting of N integers, returns the number of equi leaders.
 * <p>
 * For example, given:
 * <p>
 * A[0] = 4
 * A[1] = 3
 * A[2] = 4
 * A[3] = 4
 * A[4] = 4
 * A[5] = 2
 * the function should return 2, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].
 */

public class EquiLeader {
    // 1 <= A.length <= 100000
    // -1000000000 <= A요소 <= 1000000000
    // 0 ≤ S < N − 1 일 때 A[0] ~ A[S]와 A[S + 1] ~ A[N − 1] 2개의 배열로 나뉘었을 때, 두 배열 모두에서 가장 많은 숫자의 값이 EquiLeader가 된다.
    //  -> 만약 S가 0일때 Equi Leader가 4이고, S가 1일 때 Equi Leader가 4이고 그 이후에 Equi Leader가 나타나지 않으면 2를 리턴한다.
    // Equi Leader의 갯수를 구해서 리턴.

    // 키포인트 : 전체 배열에서 도미네이터가 결국 모든 부분 배열의 도미네이터가 된다.
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        int dominator = -1;
        for (int a : A) {
            // 전체 배열에 대한 도미네이터 숫자를 구함.
            // 갯수를 구하기 위해 루프는 계속 돌린다.
            if (map.merge(a, 1, Integer::sum) >= (A.length / 2 + 1)) {
                dominator = a;
            }
        }

        int result = 0;

        // 현재까지 나온 도미네이터 카운트
        int currentDominatorCount = 0;

        // A를 순회, 이 때 오른쪽 그룹에는 최소 1개의 요소가 있어야 하므로 0 <= S <= A.length-2 까지 돌림
        for (int S = 0; S < A.length - 1; S++) {

            // 현재 검사하는 숫자가 도미네이터면 현재까지 나온 도미네이터 갯수 +1
            if (A[S] == dominator)
                currentDominatorCount++;

            // 왼쪽 도미네이터 조건 = (왼쪽그룹크기/2 + 1) 이상
            int leftDominatorCondition = ((S + 1) / 2) + 1;

            // 오른쪽 도미네이터 조건 = (오른쪽그룹크기/2) + 1 이상
            int rightDominatorCondition = (A.length - (S + 1)) / 2 + 1;


            // 왼쪽그룹 도미네이터 조건 검사 && 오른쪽 그룹 도미네이터 조건 검사
            // 둘다 만족하는 경우에만 result 1증가
            if (
                    (currentDominatorCount >= leftDominatorCondition)
                            && ((map.get(dominator) - currentDominatorCount) >= rightDominatorCondition)
            ) {
                result++;
            }
        }
        return result;
    }
}