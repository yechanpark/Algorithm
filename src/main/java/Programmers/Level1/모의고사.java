package Programmers.Level1;

import java.util.Arrays;

/**
 * 문제 설명
 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 * <p>
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * <p>
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 * <p>
 * 제한 조건
 * 시험은 최대 10,000 문제로 구성되어있습니다.
 * 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
 * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 * 입출력 예
 * answers	    return
 * [1,2,3,4,5]	[1]
 * [1,3,2,4,2]	[1,2,3]
 * 입출력 예 설명
 * 입출력 예 #1
 * <p>
 * 수포자 1은 모든 문제를 맞혔습니다.
 * 수포자 2는 모든 문제를 틀렸습니다.
 * 수포자 3은 모든 문제를 틀렸습니다.
 * 따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.
 * <p>
 * 입출력 예 #2
 * <p>
 * 모든 사람이 2문제씩을 맞췄습니다.
 */
public class 모의고사 {
    public int[] solution(int[] answers) {
        int[][] supoja = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] correctAnswerCount = new int[3];
        int[] supojaIndex = new int[3];

        int aswersLength = answers.length;
        int supojaLength = supoja.length;

        // 채점
        for (int i = 0; i < aswersLength; i++) {
            int answer = answers[i];
            // 각 수포자들이 찍은 답을 채점
            for (int j = 0; j < supojaLength; j++) {
                supojaIndex[j] = i % supoja[j].length;
                // 정답인 경우 각 수포자 인덱스에 맞춘 갯수를 더함
                if (answer == supoja[j][supojaIndex[j]]) {
                    correctAnswerCount[j]++;
                }
            }
        }

        // 각 수포자들의 정답 갯수 배열 중 최대값 (가장 많이 받은 점수)
        int max = Arrays.stream(correctAnswerCount).max().getAsInt();
        int resultCount = 0;
        for (int i = 0; i < supojaLength; i++)
            if (correctAnswerCount[i] >= max) resultCount++;

        int[] answer = new int[resultCount];
        int resultIndex = 0;
        for (int i = 0; i < supojaLength; i++)
            if (correctAnswerCount[i] >= max) answer[resultIndex++] = i + 1;

        Arrays.sort(answer);
        return answer;
    }
}
