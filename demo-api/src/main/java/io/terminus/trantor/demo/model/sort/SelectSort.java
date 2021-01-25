package io.terminus.trantor.demo.model.sort;

import java.util.Arrays;

/**
 * @Author by yuanpeng
 * @Date 2021/1/18
 */
public class SelectSort {
    public static void main(String[] args) {
        int data[] = new int[]{5, 3, 7, 8, 2, 1, 9};

        // 选择一个基数，从0开始，往后比较，选出最小的，然后和当前基数互换；而插入排序是从前比较插入
        for (int i=0; i<data.length-1;i++){
            int minPos = i;
            for (int j=i+1;j<data.length;j++){
                if (data[minPos] > data[j]){
                    minPos = j;
                }
            }
            if (minPos!=i){
                // 把最小值与当前开始比较位置的数互换
                int temp = data[i];
                data[i] = data[minPos];
                data[minPos] = temp;
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
