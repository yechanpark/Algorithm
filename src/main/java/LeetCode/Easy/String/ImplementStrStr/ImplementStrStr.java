package LeetCode.Easy.String.ImplementStrStr;

/**
 * Implement strStr().
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * <p>
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 * <p>
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * <p>
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */

// String.indexof(String str) 사용하지 않고 구하기
public class ImplementStrStr {
    public int solution(String haystack, String needle) {
        char[] hayStackCharArr = haystack.toCharArray();
        char[] needleCharArr = needle.toCharArray();
        int hayStackLength = hayStackCharArr.length;
        int needleLength = needleCharArr.length;

        // 찾는 문자가 "" 이면 무조건 0을 리턴
        if (needleLength == 0) return 0;

        // 찾는 문자가 너무 긴 경우 어차피 없음
        if (hayStackLength < needleLength) return -1;

        for (int i = 0; i < hayStackLength; i++) {
            for (int j = 0; j < needleLength; j++) {

                // hayStack에서 찾을 수 있는 문자열이 더 이상 없는 경우
                // hayStack의 길이가 5, needle의 길이가 2라면, hayStack의 끝 2자리와 비교해야 함.
                // 01234
                // Hello
                //    aa
                // 이 때 i값이 3보다 작은 경우라면 마지막까지 비교 후 더 이상 비교할 수 없는 상황이 된 것이므로 -1 리턴
                if (hayStackLength - needleLength < i)
                    return -1;

                // needle과 hayStack을 비교하여 하나라도 틀린 것이 있으면 hayStack의 다음 문자로 넘어감
                if (hayStackCharArr[i + j] != needleCharArr[j])
                    break;

                // 만약 needle 검사의 끝까지 올 때 까지 필터링을 당하지 않았으면 같은 문자이므로, 현재 hayStack의 i값이 결과
                if (j == needleLength-1)
                    return i;
            }
        }

        // 중간에 결과가 나오지 않았다면 찾지 못한 것임
        return -1;
    }
}

/**
 * 키워드 - 문자비교, 예외처리, 인덱스 계산
 */