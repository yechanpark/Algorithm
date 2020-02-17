package LeetCode.Easy.String.WordPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 공식키워드 - Hash Table
 */
public class WordPattern_BestPractice {
    public boolean solution(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i = 0; i < words.length; ++i) {
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i)) {
                return false;
            }
        }
        return true;
    }
}