package Examples.Search;

/**
 * Array BinarySearch Example
 */
public class BinarySearch {
    int[] A;
    int target;

    public int search(int[] A, int target) {
        if (A.length == 0) return -1;

        this.A = A;
        this.target = target;

        return this.binarySearch(0, A.length - 1);
    }

    private int binarySearch(int low, int high) {
        // 값이 없는 경우 -1 리턴
        if (low > high) return -1;

        // 중간 인덱스를 구함
        int mid = high + (low - high) / 2;

        // 값을 찾은 경우 mid 인덱스 반환
        if (A[mid] == target) {
            return mid;
        }

        // 중간 값(A[mid])이 찾으려는 값(target)보다 큰 경우 왼쪽을 확인
        // 만약 low = 0, mid = 1이라면 (0, 0)이 리턴 될 것
        //    -> 다음 함수에서 A[0]과 target을 검사
        // 만약 low = 0, mid = 0이라면 (0, -1)이 리턴 될 것
        //    -> if (low > high) 조건문에 의해 -1 리턴
        else if (A[mid] > target) {
            return this.binarySearch(low, mid - 1);
        }

        // 중간 값(A[mid])이 찾으려는 값(target)보다 작은 오른쪽을 확인
        // 만약 mid = 0, high = 1이라면 (1, 1)이 리턴 될 것
        //    -> 다음 함수에서 A[1]과 target을 검사
        // 만약 low = 1, high = 1이라면 (2, 1)이 리턴 될 것
        //    -> if (low > high) 조건문에 의해 -1 리턴
        else {
            return this.binarySearch(mid + 1, high);
        }

    }

}
