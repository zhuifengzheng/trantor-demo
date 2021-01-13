package io.terminus.trantor.demo.model;

import java.util.Arrays;

/**
 * @Author by yuanpeng
 * @Date 2021/1/12
 */
public class ShellSort {

    public static void main(String[] args) {
        int data[] = new int[]{5, 7, 2, 3, 8, 1, 9};

        //希尔排序，只需要在插入排序外面循环步长，在最里面循环对步长进行增减
        for (int k = data.length / 2; k > 0; k = k / 2) {
            for (int i = k; i < data.length; i++) {
                int j = i - k;
                int temp = data[i];
                for (; j >= 0; j=j-k) {
                    if (data[j] > temp) {
                        data[j + k] = data[j];
                    } else {
                        break;
                    }
                }
                data[j + k] = temp;
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
