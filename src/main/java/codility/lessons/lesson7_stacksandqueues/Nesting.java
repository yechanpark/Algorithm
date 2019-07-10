package codility.lessons.lesson7_stacksandqueues;

import java.util.Stack;

/**
 * A string S consisting of N characters is called properly nested if:
 * <p>
 * S is empty;
 * S has the form "(U)" where U is a properly nested string;
 * S has the form "VW" where V and W are properly nested strings.
 * For example, string "(()(())())" is properly nested but string "())" isn't.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(String S); }
 * <p>
 * that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.
 * <p>
 * For example, given S = "(()(())())", the function should return 1 and given S = "())", the function should return 0, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [0..1,000,000];
 * string S consists only of the characters "(" and/or ")".
 */

public class Nesting {
    public int solution(String S) {

        Stack<Character> characterStack = new Stack<>();

        for (char c : S.toCharArray()) {

            // 비어있는 경우
            if (characterStack.empty()) {
                characterStack.push(c);
            }

            // 비어있지 않으면서 c값이 ')' 문자인 경우 스택에서 1개를 가져왔을 때 반드시 개행문자( '(' ) 여야 함
            // 개행문자가 아닌 경우 포맷에 맞지 않음
            else if (c == ')') {
                if (characterStack.pop() != '(')
                    return 0;
            }

            // 비어있지 않으면서 c값이 '('문자인 경우는 push
            else {
                characterStack.push(c);
            }
        }

        // 스택이 비어있어야 모든 짝이 맞음
        if (characterStack.empty())
            return 1;

            // 스택이 남아있으면 짝이 맞지 않음
        else
            return 0;
    }
}