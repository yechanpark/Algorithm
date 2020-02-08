package LeetCode.Easy.String.ValidPalindrome;

/**
 * 공식키워드 - String, Two Pointers
 */
public class ValidPalindrome_BestPractice {
    public boolean solution(String s) {
        char[] c = s.toCharArray();
        for (int i = 0, j = c.length - 1; i < j; ) {
            if (!Character.isLetterOrDigit(c[i])) i++;
            else if (!Character.isLetterOrDigit(c[j])) j--;
            else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--]))
                return false;
        }
        return true;
    }
}