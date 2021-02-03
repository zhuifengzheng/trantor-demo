package io.terminus.trantor.demo.model.sort;

import java.util.Arrays;

/**
 * @Author by yuanpeng
 * @Date 2021/1/18
 */
public class InsertSort {
    public static void main(String[] args) {
        int data[] = new int[]{5, 3, 7, 8, 2, 1, 9};
        for (int i = 1; i < data.length; i++) {
            int j = i - 1;
            int temp = data[i]; // 要插入数的当前位置，i从1开始，第0个不用排序
            for (; j >= 0; j--) {
                if (temp < data[j]) {
                    data[j + 1] = data[j];
                } else {
                    break;
                }
            }
            data[j + 1] = temp;
        }
        System.out.println(Arrays.toString(data));
    }
}