package LeetCode.Easy.Array.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 *<img src="PascalTriangleAnimated2.jpg" />
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class PascalsTriangle {
    public List<List<Integer>> solution(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        // 깊이가 0이면 빈 리스트 반환
        if (numRows == 0) return result;

        // 배열의 길이를 구해서 배열을 생성
        int arrLength = 0;
        for (int i = 1; i <= numRows; i++) {
            arrLength += i;
        }
        int[] arr = new int[arrLength];

        // 배열의 현재 인덱스
        int currentIndex = 0;

        // 깊이는 0 ~ numRows-1까지 반복
        for (int depth = 0; depth < numRows; depth++) {
            // depth당 결과를 만들 subResult 리스트
            List<Integer> subResult = new ArrayList<>();

            // 깊이 마다 for문을 돔
            for (int rowIndex = 0; rowIndex <= depth; rowIndex++) {
                // 처음과 끝은 1로 세팅
                if (rowIndex == 0 || rowIndex == depth) {
                    // 이후 배열의 인덱스를 계산해서 값을 구해야 하므로 배열에 저장
                    arr[currentIndex] = 1;
                    // 결과를 리턴하기 위해 리스트에도 저장
                    subResult.add(1);
                }

                // 처음과 끝이 아니면, 왼쪽 위 인덱스와 오른쪽 위 인덱스를 더해서 현재 인덱스에 저장
                else {
                    // 위 왼쪽 인덱스. 현재 인덱스에서 (깊이(0부터 시작) +1 )만큼 빼면 된다.
                    int upLeftIndex  = currentIndex - (depth + 1); // 왼쪽인덱스가 1개 더 멀어서 1을 더 빼야 함
                    // 위 오른쪽 인덱스. 현재 인덱스에서 깊이(0부터 시작)만큼 빼면 된다.
                    int upRightIndex = currentIndex - depth;
                    // 현재 인덱스의 값 = 위 왼쪽 인덱스의 값 + 위 오른쪽 인덱스의 값.
                    // 이후 배열의 인덱스를 계산해서 값을 구해야 하므로 배열에 저장
                    arr[ currentIndex ] = arr[ upLeftIndex ] + arr[ upRightIndex ];
                    // 결과를 리턴하기 위해 리스트에도 저장
                    subResult.add(arr[ currentIndex ]);
                }

                // 다음 배열 요소를 저장하기 위해 1 증가
                currentIndex++;
            }

            // 한 depth에서 만들어진 리스트를 상위 리스트에 추가
            result.add(subResult);
        }

        // 최종적으로 만들어진 리스트 반환
        return result;
    }
}

/**
 * 키워드 - 규칙찾기, 파스칼 삼각형(Pascal's Triangle), 배열, 배열 트리 인덱스 계산
 */