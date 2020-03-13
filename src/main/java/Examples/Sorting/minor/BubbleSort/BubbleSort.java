package Examples.Sorting.minor.BubbleSort;

public class BubbleSort {
    public void sort(int[] A) {
        bubbleSort(A);
    }

    private void bubbleSort(int[] A) {
        int i = 0, n = A.length;
        boolean swapNeeded;
        while (i < n - 1) {
            swapNeeded = false;
            for (int j = 1; j < n - i; j++) {
                if (A[j - 1] > A[j]) {
                    int temp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = temp;
                    swapNeeded = true;
                }
            }
            if (!swapNeeded) {
                break;
            }
            i++;
        }
    }
}
