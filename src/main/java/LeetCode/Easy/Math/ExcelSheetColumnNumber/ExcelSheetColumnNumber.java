package LeetCode.Easy.Math.ExcelSheetColumnNumber;

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * <p>
 * For example:
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * Example 1:
 * <p>
 * Input: "A"
 * Output: 1
 * Example 2:
 * <p>
 * Input: "AB"
 * Output: 28
 * Example 3:
 * <p>
 * Input: "ZY"
 * Output: 701
 */
public class ExcelSheetColumnNumber {
    public int solution(String s) {
        int result = 0;
        int multiply;
        int subResult;
        for (int i = 0; i < s.length(); i++) {
            subResult = (s.charAt(s.length() - 1 - i) - 'A' + 1);
            if (i == 0) {
                result += subResult;
            }
            else {
                // Math.pow(26, i) -> 26의 i제곱
                multiply = (int) Math.pow(26, i);
                result += subResult * multiply;
            }
        }
        return result;
    }
}

/**
 * 키워드 - 수학계산, 자릿수 구하기, 진법변환, 진수계산, 제곱
 */