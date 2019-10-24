package cn.crabime.practice.sort;

/**
 * 冒泡排序
 * 时间复杂度O(n^2)
 */
public class BubbleSort {

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    /**
     * 冒牌算法改进版本
     */
    public void advanceBubbleSort(int[] arr) {
        int swapPos = 0, swapTmpPos = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            swapPos = swapTmpPos;

            for (int j = arr.length - 1; j > swapPos; j--) {

                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;

                    swapTmpPos = j;
                }
            }

            if (swapPos == swapTmpPos) {
                break;
            }
        }
    }
}
