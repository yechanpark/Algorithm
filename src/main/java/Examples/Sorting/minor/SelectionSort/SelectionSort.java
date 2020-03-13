package Examples.Sorting.minor.SelectionSort;

public class SelectionSort {
    public void sort(int[] A) {
        selectionSort(A);
    }

    private void selectionSort(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[minElementIndex] > A[j]) {
                    minElementIndex = j;
                }
            }

            if (minElementIndex != i) {
                int temp = A[i];
                A[i] = A[minElementIndex];
                A[minElementIndex] = temp;
            }
        }
    }
}
