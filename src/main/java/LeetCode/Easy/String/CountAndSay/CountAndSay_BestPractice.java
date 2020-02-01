package LeetCode.Easy.String.CountAndSay;

/**
 *
 */
public class CountAndSay_BestPractice {
    public String solution(int n) {
        if (n == 1) return "1";
        String prev = solution(n - 1);
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < prev.length()) {
            char curr = prev.charAt(i);
            int j = 0;
            while (i + j < prev.length() && prev.charAt(i + j) == curr) j++;
            str.append(j);
            str.append(curr);
            i += j;
        }
        return str.toString();
    }
}