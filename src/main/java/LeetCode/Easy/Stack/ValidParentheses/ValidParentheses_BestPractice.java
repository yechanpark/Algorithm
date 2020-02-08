package LeetCode.Easy.Stack.ValidParentheses;

import java.util.Stack;

/**
 * 공식키워드 - String, Stack
 */

public class ValidParentheses_BestPractice {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}