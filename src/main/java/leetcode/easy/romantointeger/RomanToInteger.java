package leetcode.easy.romantointeger;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 * <p>
 * Example 1:
 * <p>
 * Input: "III"
 * Output: 3
 * Example 2:
 * <p>
 * Input: "IV"
 * Output: 4
 * Example 3:
 * <p>
 * Input: "IX"
 * Output: 9
 * Example 4:
 * <p>
 * Input: "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 5:
 * <p>
 * Input: "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

public class RomanToInteger {
    public int solution(String s) {
        int sLength = s.length();
        int result = 0;

        char beforeChar = '-';

        // 한 자릿수에 대한 결과
        int digitResult = 0;

        for (int i = sLength - 1; i >= 0; i--) {

            // 현재 문자
            char currentChar = s.charAt(i);
            int beforeValue = romanToInteger(beforeChar);
            int currentValue = romanToInteger(currentChar);

            // 현재 문자보다 직전에 나온 문자가 더 작거나 같은 경우
            // 직전까지 나온 결과를 더함
            if (beforeValue <= currentValue) {
                digitResult += currentValue;
            }

            // 현재 문자보다 직전에 나온 몬자가 더 큰 경우는, 현재 나온 문자에서 직전까지 나온 결과를 뺌
            else {

                digitResult -= currentValue;

                // 최종적으로 자릿수의 값이 결정됐으므로 결과에 더함
                result += digitResult;

                // 다음 자릿수를 구하기 위해 초기화
                digitResult = 0;
                beforeChar = '-';
                continue;

            }
            beforeChar = currentChar;
        }

        // 마지막 순회의 결과를 더함
        result += digitResult;

        return result;
    }

    public int romanToInteger(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}

/**
 * 키워드 - 수학계산, 자릿수 구하기
 */