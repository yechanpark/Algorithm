package LeetCode.Easy.String.ImplementStrStr;

/**
 * 공식키워드 - String, Two Pointers
 */
public class ImplementStrStr_BestPractice {
    public int solution(String haystack, String needle) {
        // edge case: "",""=>0  "a",""=>0
        if (needle.isEmpty()) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            for (int j = 0; j < needle.length() && (haystack.charAt(i + j) == needle.charAt(j)); j++)
                if (j == needle.length() - 1) return i;
        }
        return -1;
    }
}