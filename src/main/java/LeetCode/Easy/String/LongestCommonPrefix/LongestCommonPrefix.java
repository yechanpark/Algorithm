package LeetCode.Easy.String.LongestCommonPrefix;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * <p>
 * All given inputs are in lowercase letters a-z.
 */

public class LongestCommonPrefix {
    public String solution(String[] strs) {
        int strsLength = strs.length;

        if (strsLength == 0) return "";
        if (strsLength == 1) return strs[0];

        StringBuilder result = new StringBuilder();

        String firstString = strs[0];
        int firstStringLegnth = firstString.length();

        // 첫 번째 문자의 알파벳을 하나씩 돌면서
        for (int i = 0; i < firstStringLegnth; i++) {
            char currentChar = firstString.charAt(i);

            // 각 문자열을 돌면서 검사
            for (String str : strs) {

                // 첫 번째 문자보다 짧은 경우 멈춤
                if (str.length() == i) {
                    return result.toString();
                }

                // 일치하지 않는 케이스가 나오는 경우 지금까지 저장된 result를 리턴
                if (str.charAt(i) != firstString.charAt(i)) {
                    return result.toString();
                }

            }

            // 필터링 되지 않았다면 전부 통과한 것이므로 현재 문자를 result에 문자를 더함
            result.append(currentChar);
        }

        return result.toString();
    }
}

/**
 * 키워드 - 문자비교
 */