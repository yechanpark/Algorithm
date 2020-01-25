package leetcode.easy.lengthoflastword;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a maximal substring consisting of non-space characters only.
 * <p>
 * Example:
 * <p>
 * Input: "Hello World"
 * Output: 5
 */

public class LengthOfLastWord {
    public int solution(String s) {

        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            // 공백인 경우, count가 0 이상이면 리턴
            if (s.charAt(i) == ' ') {
                if (count > 0) return count;
            }

            // 공백이 아닌 경우 횟수 증가
            else count++;

        }

        return count;
    }
}

/**
 * 키워드 - 공백문자열, 공백체크, 문자열길이구하기, 공백제외
 */