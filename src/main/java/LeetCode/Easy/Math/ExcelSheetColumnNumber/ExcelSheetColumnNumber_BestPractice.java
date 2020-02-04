package LeetCode.Easy.Math.ExcelSheetColumnNumber;

/**
 *
 */
public class ExcelSheetColumnNumber_BestPractice {
    public int solution(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); result = result * 26 + (s.charAt(i) - 'A' + 1), i++) ;
        return result;
    }
}