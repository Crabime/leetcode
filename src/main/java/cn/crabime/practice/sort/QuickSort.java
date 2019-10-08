package cn.crabime.practice.sort;

public class QuickSort {

    private final static int CUTOFF = 20;

    /**
     * 将数组arr中i与j数值互换
     */
    private void swapReference(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private int pivot(int[] arr, int left, int right) {
        int center = (left + right) / 2;

        if (arr[center] < arr[left]) {
            swapReference(arr, center, left);
        }
        if (arr[left] > arr[right]) {
            swapReference(arr, left, right);
        }
        if (arr[center] > arr[right]) {
            swapReference(arr, center, right);
        }
        swapReference(arr, center, right - 1);

        return arr[right - 1];
    }

    private void insertSort(int[] arr) {

        int j;

        for (int p = 1; p < arr.length; p++) {
            int tmp = arr[p];

            for (j = p; j > 0 && arr[j] < arr[j - 1]; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = tmp;
        }
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left + CUTOFF <= right) {
            int pv = pivot(arr, left, right);
            int i = left, j = right - 1;
            for (;;) {
                while (arr[++i] < pv) {}
                while (arr[--j] > pv) {}
                if (i < j) {
                    swapReference(arr, i, j);
                } else {
                    break;
                }
                swapReference(arr, i, right - 1);

                quickSort(arr, left, i - 1);
                quickSort(arr, i + 1, right);
            }
        } else {
            insertSort(arr);
        }
    }
}
