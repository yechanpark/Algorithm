package JavaAPI.Math.Calculate;

/**
 * 제곱 관련
 */
public class MathPow {
    public int pow(int number) {
        // number의 2승
        // 주의 : 2^i는 논리연산자 XOR임
        return (int) Math.pow(number, 2);
    }
}