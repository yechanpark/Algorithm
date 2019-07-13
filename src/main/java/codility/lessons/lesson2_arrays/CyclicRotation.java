package codility.lessons.lesson2_arrays;

/**
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
 * <p>
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int[] solution(int[] A, int K); }
 * <p>
 * that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
 * <p>
 * For example, given
 * <p>
 * A = [3, 8, 9, 7, 6]
 * K = 3
 * the function should return [9, 7, 6, 3, 8]. Three rotations were made:
 * <p>
 * [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
 * [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
 * [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
 * For another example, given
 * <p>
 * A = [0, 0, 0]
 * K = 1
 * the function should return [0, 0, 0]
 * <p>
 * Given
 * <p>
 * A = [1, 2, 3, 4]
 * K = 4
 * the function should return [1, 2, 3, 4]
 * <p>
 * Assume that:
 * <p>
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */

public class CyclicRotation {
    public int[] solution(int[] A, int K) {

        // 배열 길이가 1 이하인 경우 그대로 리턴
        if (A.length <= 1) return A;

        // 회전하지 않는 경우 그대로 리턴
        if (K == 0) return A;

        // 배열 길이보다 많은 횟수 회전하는 경우 그 차이만큼만 로테이션
        if (A.length < K)
            K %= A.length;

        // 나누어 떨어지지 않는 경우 K만큼 오른쪽으로 rotate
        for (int i = 1; i <= K; i++) {

            // 끝 위치 숫자 저장
            int temp = A[A.length - 1];

            // 배열 길이 - 1만큼 돌면서 직전에 있는 값을 오른쪽으로 1 칸씩 옮김.
            // 0번 인덱스를 1번으로 옮기는 경우 마지막.
            for (int j = A.length - 1; j > 0; j--)
                A[j] = A[j - 1];

            // 끝 위치 숫자를 처음 위치로 저장
            A[0] = temp;

        }

        return A;
    }
}

/**
 * 키워드 - 회전
 * 키워드 - 로테이션, 로테이트, Rotation, Rotate
 * 키워드 - 오른쪽으로 이동
 * 키워드 - 왼쪽으로 이동
 * */