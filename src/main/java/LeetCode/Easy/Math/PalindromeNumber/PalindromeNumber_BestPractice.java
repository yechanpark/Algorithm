package LeetCode.Easy.Math.PalindromeNumber;

/**
 *
 */
public class PalindromeNumber_BestPractice {
    public boolean solution(int x) {
        if (x < 0) return false;
        int y = x;
        int res = 0;
        while (y != 0) {
            res = res * 10 + y % 10;
            y /= 10;
        }
        return x == res;

    }
}