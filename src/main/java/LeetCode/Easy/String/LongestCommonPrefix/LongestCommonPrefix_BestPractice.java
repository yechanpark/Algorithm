package LeetCode.Easy.String.LongestCommonPrefix;

/**
 * 공식키워드 - String
 */
public class LongestCommonPrefix_BestPractice {
    public String solution(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        return pre;
    }
}