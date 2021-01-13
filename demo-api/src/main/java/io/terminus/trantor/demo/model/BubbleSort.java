package io.terminus.trantor.demo.model;

import java.util.Arrays;

/**
 * @Author by yuanpeng
 * @Date 2021/1/12
 */
public class BubbleSort {
    public static void main(String[] args) {
        int data[] = new int[]{5, 7, 2, 3, 8, 1, 9};

        int len = data.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-i-1; j++) {
               if (data[j]>data[j+1]){
                   int temp = data[j+1];
                   data[j+1] = data[j];
                   data[j] = temp;
               }
            }

        }
        System.out.println(Arrays.toString(data));
    }
}
