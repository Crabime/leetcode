package cn.crabime.practice.sort;

/**
 * 归并算法时间复杂度O(N log N)
 * 虽然时间复杂度比较好，但是用到了外存
 */
public class MergeSort {

    public void mergeSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // 构造一个与原数组一样大小的临时数组
        int[] tmpArray = new int[arr.length];

        mergeSort(arr, tmpArray, left, right);
    }

    /**
     * 排序核心递归实现
     * @param arr 待排序数组
     * @param tmpArray 临时数组
     * @param left 数组分开后左侧索引
     * @param right 数组分开后右侧索引位置
     */
    private void mergeSort(int[] arr, int[] tmpArray, int left, int right) {
        if (left < right) {
            // 数组拆分成两半，对两部分分别采用归并排序
            int center = (left + right) / 2;
            mergeSort(arr, tmpArray, left, center);
            mergeSort(arr, tmpArray, center + 1, right);

            // rightPos为分割点
            merge(arr, tmpArray, left, center + 1, right);
        }
    }

    private void merge(int[] arr, int[] tmpArr, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int arrLen = rightEnd - leftPos + 1;

        // 左右两侧同时遍历，较小者按顺序放入临时数组中，这里需要保证左右两侧子数组元素已经是有序的了
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (arr[leftPos] < arr[rightPos]) {
                tmpArr[tmpPos++] = arr[leftPos++];
            } else {
                tmpArr[tmpPos++] = arr[rightPos++];
            }
        }

        // 如果左侧子数组在上述遍历完成后还有剩余元素，说明都是大元素
        while (leftPos <= leftEnd) {
            tmpArr[tmpPos++] = arr[leftPos++];
        }

        // 如果又侧子数组在上述遍历完成后还有剩余元素，说明都是大元素
        while (rightPos <= rightEnd) {
            tmpArr[tmpPos++] = arr[rightPos++];
        }

        // 将tmpArr数组中内容拷贝到原数组中
        for (int i = 0; i < arrLen; i++, rightEnd--) {
            arr[rightEnd] = tmpArr[rightEnd];
        }
    }
}
