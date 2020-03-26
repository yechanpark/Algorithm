package Examples.Sorting.minor.InsertionSort;

public class InsertionSort {
    public void sort(int[] A) {
        insertionSort(A);
    }

    private void insertionSort(int[] A) {
        int n = A.length;
        for (int j = 1; j < n; j++) {
            int key = A[j];
            int i = j - 1;
            while ((i > -1) && (A[i] > key)) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
        }
    }
}
