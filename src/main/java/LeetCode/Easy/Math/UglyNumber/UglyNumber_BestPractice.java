package LeetCode.Easy.Math.UglyNumber;

/**
 * 공식키워드 - Math
 * divide by 2, 3 and 5 as often as possible and then check whether we arrived at 1
 */
public class UglyNumber_BestPractice {

    public boolean solution(int num) {
        if (num > 0) {
            for (int i = 2; i < 6; i++) {
                while (num % i == 0) {
                    num /= i;
                }
            }
        }
        return num == 1;
    }
}