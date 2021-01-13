package io.terminus.trantor.demo.model;

import java.util.Arrays;

/**
 * @Author by yuanpeng
 * @Date 2021/1/12
 */
public class InsertSort {
    public static void main(String[] args) {
        int data[] = new int[]{5,7,2,3,8,1,9};

        for (int i=1;i<data.length;i++){
            int j = i - 1;
            int temp = data[i];
            for (;j>=0;j--){
                if (data[j]>temp){
                    data[j+1] = data[j];
                }else {
                    break;
                }
            }
            data[j+1] = temp;
        }
        System.out.println(Arrays.toString(data));
    }
}
