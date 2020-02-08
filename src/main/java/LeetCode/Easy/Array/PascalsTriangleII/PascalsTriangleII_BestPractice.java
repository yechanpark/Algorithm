package LeetCode.Easy.Array.PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

/**
 * 공식키워드 - Array
 */
public class PascalsTriangleII_BestPractice {
    public List<Integer> solution(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<>(rowIndex + 1);
        for (int i = 0; i < rowIndex + 1; i++) {
            result.add(1);
            for (int j = i - 1; j > 0; j--) {
                result.set(j, result.get(j) + result.get(j - 1));
            }
        }

        return result;
    }
}