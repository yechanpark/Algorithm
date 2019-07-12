package codility.lessons.lesson10_prime_and_composite_numbers;

/**
 * An integer N is given, representing the area of some rectangle.
 * <p>
 * The area of a rectangle whose sides are of length A and B is A * B, and the perimeter is 2 * (A + B).
 * <p>
 * The goal is to find the minimal perimeter of any rectangle whose area equals N. The sides of this rectangle should be only integers.
 * <p>
 * For example, given integer N = 30, rectangles of area 30 are:
 * <p>
 * (1, 30), with a perimeter of 62,
 * (2, 15), with a perimeter of 34,
 * (3, 10), with a perimeter of 26,
 * (5, 6), with a perimeter of 22.
 * Write a function:
 * <p>
 * class Solution { public int solution(int N); }
 * <p>
 * that, given an integer N, returns the minimal perimeter of any rectangle whose area is exactly equal to N.
 * <p>
 * For example, given an integer N = 30, the function should return 22, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..1,000,000,000].
 */

public class MinPerimeterRectangle {
    // 약수 세트 (An, Bn)를 구한 후 (An+Bn)*2 중 가장 작은 것을 구하기

    // 1 <= N <= 1000000000
    public int solution(int N) {
        if (N == 1)
            return 4;

        int result = Integer.MAX_VALUE;

        for (int A = 1; A <= Math.sqrt(N); A++) {

            // 제곱으로 약수가 되는 경우
            if (A * A == N) {
                if (A * 2 < result) {
                    result = A * 2;
                }
            }

            // 나누어 떨어지는 약수의 경우
            else if (N % A == 0) {
                int B = N / A;
                if (B + A < result) {
                    result = B + A;
                }
            }
        }

        // 모든 세트가 *2를 한 결과를 반환해야 하고, 어차피 An+Bn이 가장 작을 것이므로 리턴할 때 *2를 한다.
        return result * 2;
    }
}