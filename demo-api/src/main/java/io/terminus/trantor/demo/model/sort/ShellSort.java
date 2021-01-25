package io.terminus.trantor.demo.model.sort;

import java.util.Arrays;

/**
 * @Author by yuanpeng
 * @Date 2021/1/18
 */
public class ShellSort {
    public static void main(String[] args) {
        int data[] = new int[]{5, 3, 7, 9, 2, 1, 8};
        for (int k = data.length / 2; k > 0; k = k / 2) {
            for (int i = k; i < data.length; i++) {
                int j = i - k;
                int temp = data[i]; // 要插入数的当前位置，i从1开始，第0个不用排序
                for (; j >= 0; j=j-k) {
                    if (temp < data[j]) {
                        data[j + k] = data[j];
                    } else {
                        // 希尔排序就是为了代码到达这里的次数变多
                        break;
                    }
                }
                data[j + k] = temp;
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
