package LeetCode.Easy.String.ValidPalindrome;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 * <p>
 * Input: "race a car"
 * Output: false
 */

public class ValidPalindrome {
    public boolean solution(String s) {
        int sLength = s.length();
        if (sLength <= 1) return true;

        int leftIndex = 0;
        int rightIndex = sLength - 1;

        while (leftIndex <= rightIndex) {
            char leftChar = s.charAt(leftIndex);
            // 왼쪽 문자의 범위가 안맞으면 다음 으로 넘어감
            if (!Character.isLetterOrDigit(leftChar)) {
                leftIndex++;
                continue;
            }

            char rightChar = s.charAt(rightIndex);
            // 왼쪽 문자의 범위가 안맞으면 다음 으로 넘어감
            if (!Character.isLetterOrDigit(rightChar)) {
                rightIndex--;
                continue;
            }

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) return false;
            leftIndex++;
            rightIndex--;

        }

        return true;
    }
}

/**
 * 키워드 - 문자열 비교, String to char, Character.isLetterOrDigit()
 */