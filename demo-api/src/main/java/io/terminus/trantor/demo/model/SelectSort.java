package io.terminus.trantor.demo.model;

import java.util.Arrays;

/**
 * @Author by yuanpeng
 * @Date 2021/1/12
 */
public class SelectSort {
    public static void main(String[] args) {
        int data[] = new int[]{5, 7, 2, 3, 8, 1, 9};

        int len = data.length;
        for (int i = 0; i < len - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < len; j++) {
                if (data[minPos] > data[j]) {
                    minPos = j;
                }
            }
            if (minPos != i) {
                int temp = data[i];
                data[i] = data[minPos];
                data[minPos] = temp;
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
