package LeetCode.Easy.Math.HappyNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * 공식키워드 - Math, Hash Table
 */
public class HappyNumber_BestPractice {
    public boolean solution(int n) {
        List<Integer> list = new ArrayList<>();

        int result = 0;

        while (result != 1) {
            while (n != 0) {
                result = result + (n % 10) * (n % 10);
                n = n / 10;
            }

            if (list.contains(result)) {
                return false;
            } else {
                list.add(result);
            }

            if (result == 1) {
                return true;
            } else
                n = result;
            result = 0;
        }
        
        return false;
    }
}