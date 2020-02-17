package LeetCode.Easy.String.WordPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 키워드 - 문자열 비교, Map, Hash Table
 * <p>
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 * <p>
 * Example 1:
 * <p>
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 * Example 2:
 * <p>
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 * Example 3:
 * <p>
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 * Example 4:
 * <p>
 * Input: pattern = "abba", str = "dog dog dog dog"
 * Output: false
 * Notes:
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
 */
public class WordPattern {
    public boolean solution(String pattern, String str) {
        String[] strArr = str.split(" ");
        int patternLength = pattern.length();
        if (patternLength != strArr.length) return false;

        Map<Character, String> cSMap = new HashMap<>();
        Map<String, Character> sCMap = new HashMap<>();

        for (int i = 0; i < patternLength; i++) {
            char patternChar = pattern.charAt(i);
            String stringInMap = cSMap.get(patternChar);
            Character charInMap = sCMap.get(strArr[i]);

            // 둘 다 없으면 각 맵에 추가
            if (stringInMap == null && charInMap == null) {
                cSMap.put(patternChar, strArr[i]);
                sCMap.put(strArr[i], patternChar);
            }

            // 둘 중 하나만 있으면 false -> 두 개의 맵이 서로 매칭되어야 함
            else if (stringInMap == null || charInMap == null) {
                return false;
            }

            // 둘 다 있으면 비교 -> String 비교보다 Char 비교가 더 빠르므로 char값만 비교하면 된다.
            else {
                if (patternChar != charInMap) return false;
            }
        }
        return true;
    }
}