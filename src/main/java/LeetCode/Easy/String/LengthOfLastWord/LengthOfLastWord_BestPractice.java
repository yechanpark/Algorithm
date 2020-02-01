package LeetCode.Easy.String.LengthOfLastWord;

/**
 *
 */
public class LengthOfLastWord_BestPractice {
    public int solution(String s) {
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
}