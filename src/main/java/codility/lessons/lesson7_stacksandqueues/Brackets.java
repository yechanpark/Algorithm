package codility.lessons.lesson7_stacksandqueues;

import java.util.Stack;

/**
 * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
 * <p>
 * S is empty;
 * S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
 * S has the form "VW" where V and W are properly nested strings.
 * For example, the string "{[()()]}" is properly nested but "([)()]" is not.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(String S); }
 * <p>
 * that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
 * <p>
 * For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [0..200,000];
 * string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
 */

public class Brackets {
    // 괄호 포맷이 맞으면 1, 아니면 -1 리턴하기
    // 괄호는 () {} [] 3가지 종류
    public int solution(String S) {

        char[] characterArr = S.toCharArray();
        Stack<Character> popStack = new Stack<>();

        for (int i = characterArr.length - 1; i >= 0; i--) {

            // 비어있으면 계속함
            if (popStack.empty()) {
                popStack.push(characterArr[i]);
                continue;
            }

            switch (characterArr[i]) {
                // 왼쪽 괄호가 나왔는데 팝된게 매치가 안되면 안됨.
                case '{':
                    if (popStack.pop() != '}') return 0;
                    break;
                case '[':
                    if (popStack.pop() != ']') return 0;
                    break;
                case '(':
                    if (popStack.pop() != ')') return 0;
                    break;
                // 위 3개가 아니면 스택에 저장
                default:
                    popStack.push(characterArr[i]);
            }
        }

        if (popStack.empty())
            return 1;
        else
            return 0;
    }
}