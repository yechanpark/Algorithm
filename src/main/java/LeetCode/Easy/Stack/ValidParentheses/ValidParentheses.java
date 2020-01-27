package LeetCode.Easy.Stack.ValidParentheses;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: "(]"
 * Output: false
 * Example 4:
 * <p>
 * Input: "([)]"
 * Output: false
 * Example 5:
 * <p>
 * Input: "{[]}"
 * Output: true
 */

public class ValidParentheses {
    public boolean solution(String s) {

        int sLength = s.length();

        // 홀수 개인 경우 짝이 맞지 않으므로 false
        if (sLength % 2 != 0) return false;

        // 길이가 0인 경우 true
        if (sLength == 0) return true;

        // 닫기 괄호를 저장할 스택
        Stack<Character> closeStack = new Stack<>();

        // s의 모든 문자를 거꾸로 순회
        for (int i = sLength - 1; i >= 0; i--) {
            // 현재 문자
            char currentChar = s.charAt(i);

            // 현재 문자가 닫기 기호인 경우 rightStack에 저장
            if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
                closeStack.push(currentChar);
            }

            // 그 외 기호인 경우 stack에서 꺼낸 것과 비교
            else {
                // 오른쪽에서 꺼내야 하는데 없다면 false 리턴
                if (closeStack.isEmpty()) return false;

                // 오른쪽에서 꺼냄
                char right = closeStack.pop();

                // 왼쪽에서 꺼낸 것과 오른쪽에서 꺼낸 것을 비교

                // 닫힌 괄호(right)가 ')'인데 열린 괄호(currentChar)가 '('가 아니면
                if (right == ')' && currentChar != '(') {
                    return false;
                }
                // 닫힌 괄호(right)가 ']'인데 열린 괄호(currentChar)가 '['가 아니면
                else if (right == ']' && currentChar != '[') {
                    return false;
                }

                // 닫힌 괄호(right)가 '}'인데 열린 괄호(currentChar)가 '{'가 아니면
                else if (right == '}' && currentChar != '{') {
                    return false;
                }
            }

        }
        // 별 이상이 없으면 true
        return true;
    }
}

/**
 * 키워드 - 문자비교, 스택
 */