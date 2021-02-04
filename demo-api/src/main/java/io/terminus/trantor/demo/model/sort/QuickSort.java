package io.terminus.trantor.demo.model.sort;

import java.util.Arrays;

/**
 * @Author by yuanpeng
 * @Date 2021/1/22
 */
public class QuickSort {
    public static void main(String[] args) {
        int data[] = new int[]{5, 3, 7, 9, 2, 1, 8};

        qSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }

    public static void qSort(int data[], int left, int right) {
        if (left > right) {
            return;
        }
        int leftPos = left;
        int rightPos = right;
        int base = data[leftPos];

        // 如果没有最外层的while循环，那么基数只会与后面的数换一次，与前面的数换一次，有while(leftPos < rightPos)
        // 就可以在第一轮把小于base的数全部排到base的左边，大于base的数全部排在base的右边
        while (leftPos < rightPos) {
            while (leftPos < rightPos && data[rightPos] > base) {
                rightPos--;
            }
            // 交换右边 data[rightPos]<base
            if (leftPos < rightPos) {
                // 这里leftPos++，因为上一个while循环在右边找到了比base小的数，那么要和左边交换位置
                // 交换后leftPos这个位置就是右边数的值，下面while循环通过data[leftPos] <= base比较的
                // 如果这里leftPos不加1，那么data[leftPos] <= base还会在比较一次，没有意义
                data[leftPos++] = data[rightPos];
            }


            while (leftPos < rightPos && data[leftPos] <= base) {
                leftPos++;
            }

            // 交换左边
            if (leftPos < rightPos) {
                data[rightPos--] = data[leftPos];
            }

        }

        data[leftPos] = base;
        qSort(data, left, leftPos - 1);
        qSort(data, leftPos + 1, right);

    }
}
