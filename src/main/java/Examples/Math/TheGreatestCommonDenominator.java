package Examples.Math;

/**
 * 최대공약수 - 유클리드 호제법
 * <p>
 * 1. A, B 두 숫자가 있을 때 (A가 더 크다고 가정)
 * 2. A를 B로 나눈 나머지를 구함
 * 3. B를 A로, 나머지를 B에 넣고 다시 이 과정(2)을 반복
 * 4. 언젠가는 0으로 떨어지게 되며,  값은 최대공약수
 * <p>
 * ex. 72(A), 48(B)
 * func(A, B) = func(72, 48) = 72 % 48 = 24 -> 다음A : 48, 다음B = 24
 * func(A, B) = func(48, 24) = 48 % 24 = 0  -> 나머지가 0일 때(A가 B로 나누어 떨어질 때) B가 답
 */
public class TheGreatestCommonDenominator {
    public int gcd(int A, int B) {
        int max = Math.max(A, B);
        int min = Math.min(A, B);
        // A는 이전 단계에서 B이므로 A를 리턴해야 함
        if (min == 0) return max;

        return gcd(min, max % min);
    }
}
