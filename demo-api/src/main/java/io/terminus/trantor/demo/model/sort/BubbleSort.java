package io.terminus.trantor.demo.model.sort;

import java.util.Arrays;

/**
 * @Author by yuanpeng
 * @Date 2021/1/18
 */
public class BubbleSort {
    public static void main(String[] args) {
        int data[] = new int[]{5, 3, 7, 8, 2, 1, 9};

        for (int i = 0; i < data.length-1; i++) {
            for (int j = 0; j < data.length-i-1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
