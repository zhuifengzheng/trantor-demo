package io.terminus.trantor.demo.model.sort;

import java.util.Arrays;

/**
 * @Author by yuanpeng
 * @Date 2021/1/18
 */
public class SelectSort {
    public static void main(String[] args) {
        int data[] = new int[]{5, 3, 7, 8, 2, 1, 9};

        for (int i = 0; i < data.length - 1; i++) {
            int min = data[i];
            int minPos=i;
            for (int j = i + 1; j < data.length; j++) {
                if (min > data[j]) {
                    min = data[j];
                    minPos = j;
                }
            }
            data[minPos] = data[i];
            data[i] = min;
        }
        System.out.println(Arrays.toString(data));
    }
}
