package cn.crabime.practice.sort;

/**
 * 快速排序
 *      最坏情况（枢纽元始终为最小或最大的数）时间复杂度O(N^2)
 *      最好情况（枢纽元正好位于中间）时间复杂度O(N log N)
 * 快排三步骤：
 * 一、选枢纽元，保证left < center < right
 * 二、将枢纽元至于right - 1位置
 * 三、左右侧与枢纽元比较，小于枢纽元的至于左侧，大于枢纽元的至于右侧
 * 四、当某一单位数组长度小于10，改为插入排序
 */
public class QuickSort {

    private final static int CUTOFF = 10;

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

    private void insertSort(int[] arr, int left, int right) {

        int j;

        for (int p = left + 1; p < right; p++) {
            int tmp = arr[p];

            for (j = p; j > 0 && tmp < arr[j - 1]; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = tmp;
        }
    }

    public void quickSort(int[] arr, int left, int right) {
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
            insertSort(arr, left, right);
        }
    }
}
