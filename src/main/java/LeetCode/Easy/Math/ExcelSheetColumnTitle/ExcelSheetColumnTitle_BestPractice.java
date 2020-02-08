package LeetCode.Easy.Math.ExcelSheetColumnTitle;

/**
 * 공식키워드 - Math
 */
public class ExcelSheetColumnTitle_BestPractice {
    public String solution(int n) {
        return n == 0 ? "" : solution(--n / 26) + (char) ('A' + (n % 26));
    }
}