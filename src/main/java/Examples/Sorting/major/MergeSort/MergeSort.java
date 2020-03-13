package Examples.Sorting.major.MergeSort;

/**
 * 합병정렬
 * <p>
 * 시간복잡도
 * <p>
 * 분할 단계에서는 비교연산, 이동연산 수행하지 않음
 * 1. 비교 횟수
 * <p>
 * 1) 순환 호출의 깊이 (합병 단계의 수)
 * 레코드의 개수 n이 2의 거듭제곱이라고 가정(n=2^k)했을 때, n=2^3의 경우, 2^3 -> 2^2 -> 2^1 -> 2^0 순으로 줄어들어 순환 호출의 깊이가 3임을 알 수 있다.
 * 이것을 일반화하면 n=2^k의 경우, k(k=logn)임을 알 수 있다.
 * <p>
 * 2) 각 합병 단계의 비교 연산
 * 크기 1인 부분 배열 2개를 합병하는 데는 최대 2번의 비교 연산이 필요하고, 부분 배열의 쌍이 4개이므로 24=8번의 비교 연산이 필요하다.
 * 다음 단계에서는 크기 2인 부분 배열 2개를 합병하는 데 최대 4번의 비교 연산이 필요하고, 부분 배열의 쌍이 2개이므로 42=8번의 비교 연산이 필요하다.
 * 마지막 단계에서는 크기 4인 부분 배열 2개를 합병하는 데는 최대 8번의 비교 연산이 필요하고, 부분 배열의 쌍이 1개이므로 8*1=8번의 비교 연산이 필요하다.
 * 이것을 일반화하면 하나의 합병 단계에서는 최대 n번의 비교 연산을 수행함을 알 수 있다.
 * <p>
 * 3) 순환 호출의 깊이 만큼의 합병 단계 * 각 합병 단계의 비교 연산 = nlogn
 * <p>
 * 2. 이동 횟수
 * <p>
 * 1) 순환 호출의 깊이 (합병 단계의 수)
 * 레코드의 개수 n이 2의 거듭제곱이라고 가정(n=2^k)했을 때, n=2^3의 경우, 2^3 -> 2^2 -> 2^1 -> 2^0 순으로 줄어들어 순환 호출의 깊이가 3임을 알 수 있다.
 * 이것을 일반화하면 n=2^k의 경우, k(k=logn)임을 알 수 있다.
 * <p>
 * 2) 각 합병 단계의 이동 연산
 * 임시 배열에 복사했다가 다시 가져와야 되므로 이동 연산은 총 부분 배열에 들어 있는 요소의 개수가 n인 경우, 레코드의 이동이 2n번 발생한다.
 * <p>
 * 3) 순환 호출의 깊이 만큼의 합병 단계 * 각 합병 단계의 이동 연산 = 2nlogn
 * <p>
 * 3. T(n) = nlogn(비교) + 2nlogn(이동) = 3nlogn = O(nlogn)
 * <p>
 * - 평균, 최악 O(nlogn)
 * 무조건 동일한 연산 순서를 가지므로 동일
 * <p>
 * 공간복잡도
 * <p>
 * 특징
 * <p>
 * 1) 분할(Divide): 입력 배열을 같은 크기의 2개의 부분 배열로 분할.
 * <p>
 * 2) 정복(Conquer): 부분 배열을 정렬. 부분 배열의 크기가 충분히 작지 않으면 순환 호출 을 이용하여 다시 분할 정복 방법을 적용.
 * 각 부분 배열을 정렬할 때도 합병 정렬을 순환적으로 호출하여 적용
 * <p>
 * 3) 결합(Combine): 정렬된 부분 배열들을 하나의 배열에 합병. 추가적인 리스트가 필요.
 * 실제로 정렬이 이루어지는 시점은 2개의 리스트를 합병(merge)하는 단계.
 * <p>
 * 4) 2개의 정렬된 리스트를 합병(merge)하는 과정
 * 2개의 리스트의 값들을 처음부터 하나씩 비교하여 두 개의 리스트의 값 중에서 더 작은 값을 새로운 리스트(sorted)로 옮긴다.
 * 둘 중에서 하나가 끝날 때까지 이 과정을 되풀이한다.
 * 만약 둘 중에서 하나의 리스트가 먼저 끝나게 되면 나머지 리스트의 값들을 전부 새로운 리스트(sorted)로 복사한다.
 * 새로운 리스트(sorted)를 원래의 리스트(list)로 옮긴다.
 * <p>
 * 애니메이션
 * <p>
 * <img src="MergeSort.jpg"></img>
 */
public class MergeSort {

    public int[] sort(int[] A) {
        this.mergeSort(A, 0, A.length - 1);
        return A;
    }

    // 1. 왼쪽, 오른쪽 서브 배열로 분할하고
    // 2. 왼쪽, 오른쪽 서브 배열을 합치면서 정렬
    private void mergeSort(int[] A, int low, int high) {
        // 사이즈가 1개인 경우(high == low)가 되면 더 이상 분할할 수 없음
        // 빈 배열의 경우, low=0, high=-1 이 되므로, 무한루프에 빠짐. 따라서 <= 를 써야 함
        if (high <= low) return;

        // 중간 인덱스를 구함
        int mid = (low + high) / 2;

        // low ~ mid까지 왼쪽 서브 배열로 넣음. mid의 경우 정렬되지 않았으므로 포함시켜야 함
        mergeSort(A, low, mid);

        // mid+1 ~ high까지 오른쪽 서브 배열로 넣음.
        mergeSort(A, mid + 1, high);

        // 나누어진 왼쪽 서브 배열과 오른쪽 서브 배열을 합침
        merge(A, low, mid, high);
    }

    // 나누어진 왼쪽 서브 배열과 오른쪽 서브 배열을 합침
    private void merge(int[] A, int low, int mid, int high) {
        // 왼쪽/오른쪽 서브 배열
        int[] leftSubArray = new int[mid - low + 1];
        int[] rightSubArray = new int[high - mid];

        // 원래 배열에서 왼쪽/오른쪽 서브 배열의 인덱스를 계산하여 복사
        for (int i = 0; i < leftSubArray.length; i++)
            leftSubArray[i] = A[low + i];
        for (int i = 0; i < rightSubArray.length; i++)
            rightSubArray[i] = A[mid + i + 1];

        // 왼쪽, 오른쪽 서브 배열을 원래 배열에 합칠 때 사용하기 위한 서브 배열에 대한 인덱스
        int leftIndex = 0;
        int rightIndex = 0;

        // 왼쪽/오른쪽 서브 배열을 원래 배열에 병합
        for (int i = low; i < high + 1; i++) {

            // 왼쪽/오른쪽 서브 배열 모두 병합할 요소가 남아있는 경우, 더 작은 값을 원래 배열에 덮어씀
            if (leftIndex < leftSubArray.length && rightIndex < rightSubArray.length) {

                // 왼쪽 배열이 더 작은 경우, 왼쪽 배열의 값을 복사
                if (leftSubArray[leftIndex] < rightSubArray[rightIndex]) {
                    A[i] = leftSubArray[leftIndex];
                    leftIndex++;
                }
                // 오른쪽 배열이 더 작은 경우, 오른쪽 배열의 값을 복사
                else {
                    A[i] = rightSubArray[rightIndex];
                    rightIndex++;
                }
            }

            // 왼쪽 서브 배열만 병합할 요소가 남아있는 경우
            else if (leftIndex < leftSubArray.length) {
                // 남은 왼쪽 서브 배열을 복사
                A[i] = leftSubArray[leftIndex];
                leftIndex++;
            }

            // 오른쪽 서브 배열만 병합할 요소가 남아있는 경우
            // else
            else if (rightIndex < rightSubArray.length) {
                // 남은 오른쪽 서브 배열을 복사
                A[i] = rightSubArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
