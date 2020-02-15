package LeetCode.Easy.Math.AddDigits;

/**
 * 공식키워드 - Math
 * First you should understand:
 * <p>
 * 10^k % 9 = 1
 * a*10^k % 9 = a % 9
 * Then let's use an example to help explain.
 * <p>
 * Say a number x = 23456
 * <p>
 * x = 2* 10000 + 3 * 1000 + 4 * 100 + 5 * 10 + 6
 * <p>
 * 2 * 10000 % 9 = 2 % 9
 * <p>
 * 3 * 1000 % 9 = 3 % 9
 * <p>
 * 4 * 100 % 9 = 4 % 9
 * <p>
 * 5 * 10 % 9 = 5 % 9
 * <p>
 * Then x % 9 = ( 2+ 3 + 4 + 5 + 6) % 9, note that x = 2* 10000 + 3 * 1000 + 4 * 100 + 5 * 10 + 6
 * <p>
 * So we have 23456 % 9 = (2 + 3 + 4 + 5 + 6) % 9
 */
public class AddDigits_BestPractice {
    public int solution(int num) {
        return (num - 1) % 9 + 1;
    }
}