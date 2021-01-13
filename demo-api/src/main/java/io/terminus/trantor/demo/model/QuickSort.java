package io.terminus.trantor.demo.model;

import java.util.Arrays;

/**
 * @Author by yuanpeng
 * @Date 2021/1/12
 */
public class QuickSort {
    public static void main(String[] args) {
        int data[] = new int[]{5, 7, 2, 3, 8, 1, 9};
        quick(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }


    public static void quick(int data[],int left,int right){
        // 这里是>符号 【quick(data,left,pointer1-1)】 pointer1可能==left，但是-1就小于
        if (left>right){
            return;
        }

        int pointer1 = left;
        int pointer2 = right;
        // 基数
        int base = data[pointer1];

        while (pointer1<pointer2){
            while (pointer1<pointer2 && data[pointer2]>=base){
                pointer2--;
            }
            // 说明是不满足条件data[pointer2]>base 右边
            if (pointer1<pointer2){
                // 与基数交换
//                int tempBase = data[pointer1];
//                data[pointer1] = data[pointer2];
//                data[pointer2] = tempBase;
                data[pointer1++] = data[pointer2];

            }

            while (pointer1<pointer2 && data[pointer1]<base){
                pointer1++;
            }
            if (pointer1<pointer2){
                // 与基数交换
//                int tempBase = data[pointer1];
//                data[pointer1] = data[pointer2];
//                data[pointer2] = tempBase;
                data[pointer2--] = data[pointer1];

            }
        }
        data[pointer1] = base;

        // 递归基数左边与右边
        quick(data,left,pointer1-1);
        quick(data,pointer1+1,right);
    }
}
