package Codility.Lessons.lesson3_timecomplexity;

/**
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
 * <p>
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int X, int Y, int D); }
 * <p>
 * that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
 * <p>
 * For example, given:
 * <p>
 * X = 10
 * Y = 85
 * D = 30
 * the function should return 3, because the frog will be positioned as follows:
 * <p>
 * after the first jump, at position 10 + 30 = 40
 * after the second jump, at position 10 + 30 + 30 = 70
 * after the third jump, at position 10 + 30 + 30 + 30 = 100
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * X, Y and D are integers within the range [1..1,000,000,000];
 * X ≤ Y.
 */

public class FrogJmp {
    // X : 현재 위치 (1 이상)
    // Y : 가고 싶은 위치 (X보다 같거나 큼, 1 이상)
    // D : 고정된 이동거리 (1 이상)
    // return : 가장 적은 이동 횟수
    public int solution(int X, int Y, int D) {

        // 가고싶은 위치 - 현재위치 = 이동해야 하는 거리
        int remainDistance = Y - X;

        // 이미 제자리면 0번 이동
        if (remainDistance == 0) return 0;

        int move = remainDistance / D;

        if (remainDistance % D >= 1)
            move++;

        return move;
    }
}

/**
 * 키워드 - 초과, 이동, 이동거리
 */