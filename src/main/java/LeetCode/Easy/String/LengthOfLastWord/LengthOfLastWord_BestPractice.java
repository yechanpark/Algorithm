package LeetCode.Easy.String.LengthOfLastWord;

/**
 * 공식키워드 - String
 */
public class LengthOfLastWord_BestPractice {
    public int solution(String s) {
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
}