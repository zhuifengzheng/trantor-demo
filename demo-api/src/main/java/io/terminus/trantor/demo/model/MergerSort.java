package io.terminus.trantor.demo.model;

import java.util.Arrays;

/**
 * @Author by yuanpeng
 * @Date 2021/1/12
 */
public class MergerSort {
    public static void main(String[] args) {
        int data[] = new int[]{5, 7, 2, 3, 8, 1, 9};

        split(data,0,data.length-1);
        System.out.println(Arrays.toString(data));
    }

    public static void split(int data[],int left,int right){
        if (left<right){
            int mid = (left+right)/2;
            split(data,left,mid);
            split(data,mid+1,right);

            merger(data,left,mid,right);
        }
    }

    public static void merger(int data[],int left,int mid,int right){
        int pointer1 = left;
        int pointer2 = mid+1;
        int pos = left;

        int temp[] = new int[data.length];

        while (pointer1<=mid && pointer2<=right){
            if (data[pointer1]>data[pointer2]){
                temp[pos++] = data[pointer2++];
            }else {
                temp[pos++] = data[pointer1++];
            }
        }


        while (pointer1<=mid){
            temp[pos++] = data[pointer1++];
        }
        while (pointer2<=right){
            temp[pos++] = data[pointer2++];
        }

        while (left<=right){
            data[left] = temp[left];
            left++;
        }
    }
}
