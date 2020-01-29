package LeetCode.Easy.Regularity.PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 * <br>
 * Note that the row index starts from 0.
 * <br>
 * <img src="PascalTriangleAnimated2.jpg" />
 * <br>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * <br>
 * Example:
 * <br>
 * Input: 3
 * Output: [1,3,3,1]
 * Follow up:
 * <br>
 * Could you optimize your algorithm to use only O(k) extra space?
 */
public class PascalsTriangleII {
    public List<Integer> solution(int rowIndex) {
        // 파스칼 삼각형을 이루는 배열의 길이 (총 원소의 갯수)
        int pascalsTriangleArrayLength = 0;
        for (int i = 0 ; i <= rowIndex+1; i++) {
            for (int j = 0; j < i; j++) {
                pascalsTriangleArrayLength++;
            }
        }
        int[] pascalsTriangleArray = new int[pascalsTriangleArrayLength];

        // 현재 인덱스를 저장할 변수
        int currentIndex = 0;

        // 깊이만큼 루프
        for (int depth = 0; depth <= rowIndex; depth++ ) {
            // 깊이 당 인덱스
            for (int depthIndex = 0; depthIndex <= depth; depthIndex++) {
                // 깊이의 처음이거나 끝이면 1을 넣음
                if ( depthIndex == 0 || depthIndex == depth) {
                    pascalsTriangleArray[currentIndex++] = 1;
                }

                // 깊이의 중간이면 왼쪽 위의 값 + 오른쪽 위의 값을 더한 값을 넣음
                else {
                    int leftUp = pascalsTriangleArray[currentIndex-depth-1];
                    int rightUp = pascalsTriangleArray[currentIndex-depth];
                    pascalsTriangleArray[currentIndex++] = leftUp + rightUp;
                }
            }
        }

        // 마지막 깊이의 요소들 ( (currentIndex - rowIndex - 1) ~ curruntIndex ) 리턴
        List<Integer> result = new ArrayList<>();
        for (int i = currentIndex-rowIndex-1; i < currentIndex; i++) {
            result.add(pascalsTriangleArray[i]);
        }
        return result;
    }
}

/**
 * 키워드 - 규칙찾기, 파스칼 삼각형(Pascal's Triangle), 배열, 배열 트리 인덱스 계산
 */