package programmers.level1;

import java.util.Arrays;

/**
 * 문제 설명
 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
 * <p>
 * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
 * <p>
 * array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
 * 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
 * 2에서 나온 배열의 3번째 숫자는 5입니다.
 * 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 * <p>
 * 제한사항
 * array의 길이는 1 이상 100 이하입니다.
 * array의 각 원소는 1 이상 100 이하입니다.
 * commands의 길이는 1 이상 50 이하입니다.
 * commands의 각 원소는 길이가 3입니다.
 * 입출력 예
 * array	                commands	                        return
 * [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
 * 입출력 예 설명
 * [1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
 * [1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
 * [1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
 */
public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int commandsLength = commands.length;

        // 정답의 목록 크기는 commands의 갯수와 같음
        int[] answer = new int[commandsLength];

        // 정답의 갯수
        int answerLength = answer.length;

        // 정답의 갯수만큼 돌면서
        for (int i = 0; i < answerLength; i++) {

            // 정렬해야 할 범위의 숫자를 담을 배열
            int[] needSort = new int[commands[i][1] - commands[i][0] + 1];
            // 정렬해야 할 범위의 숫자 중 시작 인덱스
            int start = commands[i][0] - 1; // 1 -> 2번째
            // 정렬해야 할 범위의 숫자 중 종료 인덱스
            int end = commands[i][1] - 1; // 4 -> 5번째

            // 구해야 할 숫자의 길이
            // 2 ~ 5번째 숫자를 구한다면 (5-1) - (2-1) + 1 = 4개의 숫자를 구해야 함)
            int length = end - start + 1;

            // array의 start번 인덱스 1 (2번째) 부터 length길이 (4) 만큼 needSort의 0번 인덱스부터 차례대로 복사
            System.arraycopy(array, start, needSort, 0, length);

            // 오름차순 정렬
            Arrays.sort(needSort);

            // commands[i][2] - 1 번째 숫자를 구해서 정답 목록에 넣음
            answer[i] = needSort[commands[i][2] - 1];
        }

        return answer;
    }
}
