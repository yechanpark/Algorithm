package LeetCode.Easy.String.ValidAnagram;

import java.util.Arrays;

/**
 * 키워드 - 문자열 비교, String to char[]
 * <p>
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram {
    public boolean solution(String s, String t) {
        int sLength = s.length();
        if (sLength != t.length())
            return false;

        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();
        Arrays.sort(sCharArr);
        Arrays.sort(tCharArr);
        for (int i = 0; i < sLength; i++) {
            if (sCharArr[i] != tCharArr[i]) return false;
        }
        return true;
    }
}