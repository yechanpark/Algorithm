package Examples.Sorting.major.QuickSort;

/**
 * 퀵정렬
 * <p>
 * 시간복잡도
 *  - 평균 Θ(nlogn)
 *  T(n) : n 개의 원소인 배열을 정렬할 때 걸리는 수행 시간을
 *  S(n) : 퀵 정렬은 재귀적인 방법으로 해결하고 반 씩 나누어 재귀 호출이 이루어지는데, 재귀 호출이 진행하기 전에 비교에 걸리는 시간
 *  n 개인 원소를 재귀 호출 전에 비교하는 횟수는 n번이므로 S(n)=n
 *  T(n) = 2*T(n/2) + n = n^2T(n/n^2) + 2*n = ... = h*n
 *  재귀는 원소 개수가 1보다 작으면 탈출하므로 n^h =1 일 때 더 이상 재귀 호출은 발생하지 않음
 *  h = logn이므로 T(n) = nlogn
 *
 *  - 최악 O(n^2)
 *  데이터들이 정렬되어있거나 역순으로 정렬되어 있을 때 Pivot을 최솟값이나 최댓값으로 선택한 경우
 * <p>
 * 공간복잡도
 * <p>
 * 특징
 * - Pivot을 기준으로 왼쪽에 작은 것, 오른쪽에 큰 것 배치
 * - 0 ~ Pivot -1         만큼 왼쪽 서브 리스트 다시 정렬
 * - Pivot+1 ~ A.legnth-1 만큼 오른쪽 서브 리스트 다시 정렬
 * - 위 과정 을 left, right가 교차될 때 까지 반복
 * <p>
 * 애니메이션
 * <p>
 * <img src="QuickSort_Animation.gif"></img>
 */
public class QuickSort {
    public void sort(int[] A) {
        quickSort(A, 0, A.length - 1);
    }

    private void quickSort(int[] A, int low, int high) {
        if (low >= high) return;

        int mid = partition(A, low, high); // 중간 지점

        quickSort(A, low, mid - 1); // 중간 지점을 기준(제외)으로 왼쪽 서브 리스트 정렬
        quickSort(A, mid, high);          // 중간 지점을 기준(포함)으로 오른쪽 서브 리스트 정렬
    }

    private int partition(int[] A, int low, int high) {
        // 피벗 설정. 중간에 위치한 값 기준
        int pivot = A[(low + high) / 2];
        while (low <= high) {
            // low위치의 값이 피벗보다 작으면 자신의 자리(피벗의 왼쪽)에 있으므로 패스
            while (A[low] < pivot) low++;

            // high위치의 값이 피벗보다 크면 자신의 자리(피벗의 오른쪽)에 있으므로 패스
            while (A[high] > pivot) high--;

            // low가 high보다 작은 경우
            // -> 각각 자신의 위치가 아님
            // -> low와 high의 자리를 변경
            // low가 high보다 큰 경우
            // -> 이미 정렬된 경우
            // -> 변경하지 않음
            if (low <= high) {
                swap(A, low, high);
                low++;
                high--;
            }

        }

        // 기준지점이 되는 위치인 low 반환
        return low;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
