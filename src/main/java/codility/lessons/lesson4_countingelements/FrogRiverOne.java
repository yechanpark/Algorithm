package codility.lessons.lesson4_countingelements;

import java.util.HashMap;
import java.util.Map;

/**
 * A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.
 * <p>
 * You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.
 * <p>
 * The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.
 * <p>
 * For example, you are given integer X = 5 and array A such that:
 * <p>
 * A[0] = 1
 * A[1] = 3
 * A[2] = 1
 * A[3] = 4
 * A[4] = 2
 * A[5] = 3
 * A[6] = 5
 * A[7] = 4
 * In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int X, int[] A); }
 * <p>
 * that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.
 * <p>
 * If the frog is never able to jump to the other side of the river, the function should return −1.
 * <p>
 * For example, given X = 5 and array A such that:
 * <p>
 * A[0] = 1
 * A[1] = 3
 * A[2] = 1
 * A[3] = 4
 * A[4] = 2
 * A[5] = 3
 * A[6] = 5
 * A[7] = 4
 * the function should return 6, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N and X are integers within the range [1..100,000];
 * each element of array A is an integer within the range [1..X].
 */

public class FrogRiverOne {
    // 개구리 처음 위치 : 0
    // 목적지 : X + 1
    // A : 떨어지는 나뭇잎을 나타내는 N개의 정수로 구성
    // A[K] : 시간 K에서 한 잎이 떨어지는 위치 (초단위)
    // A[0] : 처음 떨어진 잎의 위치
    // A[1] : 1초 후 떨어진 잎 위치
    // 1 <= N, X <= 100000
    public int solution(int X, int[] A) {
        int result = -1;

        if (X > A.length)
            return result;

        // 남은 잎사귀의 정보를 가지고 있는 맵.
        // List를 사용할 경우 : List.get()를 사용하려면 해당 인덱스에 반드시 값이 있어야 하므로 시간복잡도가 증가함
        // Map을 사용할 경우 : Map.get()을 사용하면 해당 키 값이 있는지 없는지 검사가 가능하므로 시간복잡도가 감소하고 코드가 쉬워짐
        Map<Integer, Boolean> checkMap = new HashMap<>();

        // 처음에는 모든 경로에 대한 잎사귀가 필요함
        for (int i = 1; i <= X; i++)
            checkMap.put(i, false);

        // 주어진 배열을 순회하면서, 제공된 잎사귀의 정보를 바탕으로 남은 잎사귀의 리스트를 제거함
        for (int i = 0; i < A.length; i++) {

            // 잎의 정보가 제공된 경우 필요한 잎사귀 리스트에서 제외
            if (checkMap.get(A[i]) != null)
                checkMap.remove(A[i]);

            // 필요한 잎사귀 리스트가 비어진 경우 필요한 잎사귀가 전부 채워진 경우이므로 현재 인덱스를 리턴
            if (checkMap.size() == 0)
                return i;

        }

        // 리턴 : 걸린 시간 / 배열 안에서 해결되지 않는 경우 -1 리턴
        return result;
    }
}