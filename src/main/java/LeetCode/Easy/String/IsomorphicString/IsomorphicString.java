package LeetCode.Easy.String.IsomorphicString;

import java.util.HashMap;
import java.util.Map;

/**
 * 키워드 - 문자비교
 * <p>
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character but a character may map to itself.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 * <p>
 * Input: s = "paper", t = "title"
 * Output: true
 * Note:
 * You may assume both s and t have the same length.
 */
public class IsomorphicString {
    public boolean solution(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            Integer sIndex = sMap.get(sChar);
            Integer tIndex = tMap.get(tChar);

            // 둘 다 없는 경우 맵에 추가
            if (sIndex == null && tIndex == null) {
                sMap.put(sChar, i);
                tMap.put(tChar, i);
                continue;
            }

            // 둘 중 하나만 있는 경우 false
            else if ( sIndex == null || tIndex == null ) return false;

            // 둘 다 있는 경우 인덱스 비교
            if (sIndex.intValue() != tIndex.intValue()) {
                return false;
            }

        }


        return true;
    }
}