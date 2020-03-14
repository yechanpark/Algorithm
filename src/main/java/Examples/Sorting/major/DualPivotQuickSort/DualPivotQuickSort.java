package Examples.Sorting.major.DualPivotQuickSort;

/**
 * Dual Pivot Quick Sort
 *
 * <img src="DualPivotQuickSort.png"></img>
 */
public class DualPivotQuickSort {
    public void sort(int[] A) {
        dualPivotQuickSort(A, 0, A.length - 1);
    }

    private void dualPivotQuickSort(int[] A, int left, int right) {
        // right가 left보다 낮으면 안된다.
        if (left > right) return;

        // 무조건 pivot1 < pivot2 이어야 함
        if (A[right] < A[left]) swap(A, left, right);

        // 배열의 양 끝을 각각 pivot1, pivot2로 지정
        int pivot1 = A[left], pivot2 = A[right];

        // 비교를 수행할 차례의 요소를 지정하는 현재 인덱스
        // 왼쪽 끝에서 pivot1을 제외한 인덱스(왼쪽 끝+1)부터 시작하여 증가
        int currentIndex = left + 1;

        // pivot1보다 작은 값이 들어갈 자리를 표시하는 인덱스 번호.
        // 왼쪽 끝에서 pivot1을 제외한 인덱스(왼쪽 끝+1)부터 시작하여 증가
        int lessThanPivot1Index = currentIndex;

        // pivot2보다 큰 값이 들어갈 자리를 표시하는 인덱스 번호.
        // 오른쪽 끝에서 pivot2를 제외한 인덱스(오른쪽 끝+1)부터 시작하여 감소
        int greaterThanPivot2Index = right - 1;

        // 현재 검사하는 인덱스가 pivot2보다 큰 값이 들어갈 자리를 표시하는 인덱스보다 작거나 같은 경우
        // == (검사가 끝나지 않은 경우)
        while (currentIndex <= greaterThanPivot2Index) {
            // '현재 인덱스에 대한 값 < pivot1' 인 경우
            //  -> 현재 인덱스는 pivot1보다 작지만 오른쪽에 있으므로, pivot1보다 작은 곳(왼쪽 서브 리스트)으로 옮겨야 함
            if (A[currentIndex] < pivot1) {
                // 현재 인덱스의 값과 pivot1보다 적은 수가 들어가야할 자리의 값을 교환
                //   -> pivot1과 바꾸는 것이 아님에 주의
                // 다음 요소를 검사하기 위해 pivot1보다 작은 수가 들어가야 할 자리의 인덱스 값을 증가
                swap(A, currentIndex, lessThanPivot1Index++);
            }

            // '현재 인덱스에 대한 값 > pivot2' 인 경우
            //  -> 현재 인덱스는 pivot2보다 크지만 왼쪽에 있으므로, pivot2보다 큰 곳(오른쪽 서브 리스트)으로 옮겨야 함
            else if (A[currentIndex] > pivot2) {
                // 조건1. 'pivot2보다 큰 수가 들어가야 할 자리의 값 > pivot2'
                //   -> 자기 자리(오른쪽 서브 리스트)에 있는 경우
                // 조건2. '현재 검사하는 인덱스 < pivot2보다 큰 수가 들어가야 할 자리의 인덱스'
                //   -> 아직 모든 요소의 검사가 끝나지 않은 경우
                // currentIndex 데이터는 현재 자신의 자리이므로
                while ((A[greaterThanPivot2Index] > pivot2) && (currentIndex < greaterThanPivot2Index)) {
                    greaterThanPivot2Index--;
                }

                // 비교대상을 찾은 경우
                //   -> A[greaterThanPivot2Index] <= pivot2 이거나 (greaterThanPivot2Index인덱스의 값은 pivot2보다 커야하나 같거나 작으므로 비교 대상)
                //   -> currentIndex >= greaterThanPivot2Index인 경우 (더 비교할 것이 없는 경우)
                // 현재 인덱스의 값과 pivot2보다 큰 수가 들어가야 할 자리의 인덱스의 값을 교환
                // 다음 요소를 검사하기 위해 pivot2보다 큰 수가 들어가야 할 자리의 인덱스 값을 감소
                swap(A, currentIndex, greaterThanPivot2Index--);

                // 위에서 currentIndex가 바뀌었으므로, pivot1보다 작은지 확인하여 작다면 pivot1의 왼쪽으로 이동
                // pivot1보다 작지 않다면 자신의 위치(중간 서브 리스트)에 있는 것이므로 움직이지 않음
                if (A[currentIndex] < pivot1) {
                    swap(A, currentIndex, lessThanPivot1Index++);
                }

            }

            // 1. 위 연산이 끝난 이후거나
            // 2. 'pivot1 <= 현재 인덱스에 대한 값 <= pivot2' 인 경우
            //    자신이 있어야 할 자리(중간 서브 리스트)에 잘 들어있는 것이므로 아무것도 하지 않고 다음 요소 검사
            // 다음 요소를 검사하기 위해 현재 인덱스 증가
            currentIndex++;
        } // end while

        // lessThanPivot1Index, greaterThanPivot2Index 모두 다음 연산을 위해 계산되므로,
        // 위에서 무조건 결과값을 감소 및 증가시킴.
        // 따라서 pivot1, pivot2의 실제 자리는 1번씩 연산을 더 해야 함
        int pivot1Index = lessThanPivot1Index - 1;
        int pivot2Index = greaterThanPivot2Index + 1;

        // 첫 요소와 pivot1의 자리에 있는 값을 교환 -> pivot1은 자신의 자리를 찾아감
        swap(A, left, pivot1Index);
        // 마지막 요소와 pivot2의 자리에 있는 값을 교환 -> pivot2는 자신의 자리를 찾아감
        swap(A, right, pivot2Index);

        // 왼쪽 서브 리스트 정렬
        dualPivotQuickSort(A, left, pivot1Index - 1);
        // 중간 서브 리스트 정렬
        dualPivotQuickSort(A, pivot1Index + 1, pivot2Index - 1);
        // 오른쪽 서브 리스트 정렬
        dualPivotQuickSort(A, pivot2Index + 1, right);

    }

    private void swap(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
}
