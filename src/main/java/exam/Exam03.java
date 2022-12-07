package exam;

/**
 * @Author hui
 * @Description 3、用归并排序将3，1，4，1，5，9，2，6 排序。
 * @Date
 * @Param
 * @return
 */

public class Exam03 {

    public static int[] mergeSort(int[] nums, int l, int h) {
        if (l == h) {
            return new int[]{nums[l]};
        }

        int mid = l + (h - l) / 2;
        //左有序数组
        int[] leftArr = mergeSort(nums, l, mid);
        //右有序数组
        int[] rightArr = mergeSort(nums, mid + 1, h);
        //新有序数组
        int[] newNum = new int[leftArr.length + rightArr.length];

        int m = 0, i = 0, j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newNum[m++] = leftArr[i] <= rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        while (i < leftArr.length) {
            newNum[m++] = leftArr[i++];
        }
        while (j < rightArr.length) {
            newNum[m++] = rightArr[j++];
        }
        return newNum;
    }
}
