package Examples.Sorting.minor.ShellSort;

/**
 * 쉘정렬
 * <p>
 * 시간복잡도
 * - 최선 O(N)
 * - 평균 O(n^1.5)
 * - 최악 O(n^2)
 * <p>
 * 공간복잡도
 * - O(1)
 * <p>
 * 특징
 * <p>
 * 정렬해야 할 리스트의 각 k번째 요소를 추출해서 부분 리스트를 만든다. 이때, k를 ‘간격(gap)’ 이라고 한다
 * <p>
 * 간격을 기준으로 연속적이지 않은 여러 개의 부분 리스트를 생성
 * <p>
 * 각 부분 리스트를 삽입 정렬을 이용하여 정렬
 * <p>
 * 모든 부분 리스트가 정렬되면 다시 전체 리스트를 더 적은 개수의 부분 리스트로 만든 후에 알고리즘을 반복
 * <p>
 * 위의 과정을 부분 리스트의 개수가 1이 될 때까지 반복
 * <p>
 * 애니메이션
 * <p>
 * <img src="ShellSort_Animation.gif"></img>
 */
public class ShellSort {
    public void sort(int[] A) {
        shellSort(A);
    }

    private void shellSort(int[] A) {
        int leftIndex;
        // gap에 A를 절반으로 계속 나누어 넣음, 1까지 계속함 (N/2, N/4, N/8, ..., 1)
        for (int gap = A.length / 2; gap > 0; gap /= 2) {
            // rightIndex는 gap부터 시작, 오른쪽으로 진행.
            for (int rightIndex = gap; rightIndex < A.length; rightIndex++) {

                // 비교할 서브 리스트의 맨 오른쪽 값
                int tmp = A[rightIndex];

                // rightIndex부터 시작하여 gap 간격으로 원소를 비교
                // leftIndex >= gap
                //    -> leftIndex는 rightIndex에서 시작해서 gap만큼 감소하면서 진행
                //    -> gap보다 작은 값이면, 이미 서브 리스트의 맨 왼쪽 값을 계산한 것임.
                // tmp - A[leftIndex - gap] < 0
                //    -> 서브 리스트의 왼쪽 값(A[leftIndex - gap])이 오른쪽 값(A[leftIndex])보다 크면
                //       오른쪽 값(A[leftIndex])에 왼쪽 값(A[leftIndex - gap])을 복사.
                for (leftIndex = rightIndex; (leftIndex >= gap) && (A[leftIndex - gap] > tmp); leftIndex -= gap) {
                    A[leftIndex] = A[leftIndex - gap];
                }

                // 만약 정렬이 돼있어서 위 for문이 실행이 안됐다면
                //    -> leftIndex == rightIndex이므로 변화가 없음.
                // 만약 정렬이 안돼있어서 위 for문이 실행이 됐다면
                //    -> 서브 리스트의 맨 왼쪽 값(A[leftIndex])은 서브 리스트의 맨 오른쪽 값(A[rightIndex])으로 대체해야 함
                //    -> 큰 값은 위 for문에서 정렬됨
                A[leftIndex] = tmp;
            }
        }
    }
}
