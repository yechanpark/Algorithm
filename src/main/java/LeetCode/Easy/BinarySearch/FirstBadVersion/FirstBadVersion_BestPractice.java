package LeetCode.Easy.BinarySearch.FirstBadVersion;

/**
 * 공식키워드 - Binary Search
 */
public class FirstBadVersion_BestPractice extends VersionControl {
    public int solution(int n) {
        int start = 1, end = n;
        while (start < end) {
            // (end - start) / 2 -> can caused OVERFLOW !
            // (1 - 5) / 2 = 3
            // start + (end - start) / 2 -> avoid overflow
            // 5 + (1-5)/2 = 5 + (-2) = 3
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}