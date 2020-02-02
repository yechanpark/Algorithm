package LeetCode.Easy.Map.TwoSumII;

/**
 * 배열의 양 끝에서부터 한 개의 요소씩 합한다.
 * 결과가 크면 큰 숫자를 제외하고 다시 검사
 * 결과가 작으면 작은 숫자를 제외하고 다시 검사
 * 양쪽 인덱스의 합이 target과 같은 경우 양쪽 인덱스에서 +1씩 한 결과를 리턴
 */
public class TwoSumII_BestPractice {
    public int[] solution(int[] numbers, int target) {
        // 처음과 끝 인덱스 정의
        int start = 0, end = numbers.length - 1;

        // 모든 검사가 끝날 때 까지 반복
        while (start < end) {
            // 양 끝 숫자의 합이 target과 같은 경우
            if (numbers[start] + numbers[end] == target) break;

            // 양 끝 숫자의 합이 target보다 작은 경우 (왼쪽 인덱스를 증가)
            if (numbers[start] + numbers[end] < target) start++;

            // 양 끝 숫자의 합이 target보다 큰 경우 (오른쪽 인덱스를 증가)
            else end--;
        }
        return new int[]{start + 1, end + 1};
    }
}