package io.terminus.trantor.demo.model.sort;

import java.util.Arrays;

/**
 * @Author by yuanpeng
 * @Date 2021/1/22
 */
public class MergerSort {
    public static void main(String[] args) {
        int data[] = new int[]{5, 3, 7, 8, 2, 1, 9};

        split(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }

    public static void split(int data[], int left, int right) {
        if (left < right) {
            // 分
            int mid = (left + right) / 2;

            split(data, left, mid);
            split(data, mid + 1, right);

            // 合并
            int temp[] = new int[data.length];
            merger(data, left, mid, right, temp);
        }
    }

    public static void merger(int data[], int left, int mid, int right, int temp[]) {
        int pos = left;
        int posLeft = left;
        int posRight = mid + 1;

        while (posLeft <= mid && posRight <= right) {
            if (data[posLeft] < data[posRight]) {
                temp[pos++] = data[posLeft++];
            } else {
                temp[pos++] = data[posRight++];
            }
        }

        while (posLeft <= mid) {
            temp[pos++] = data[posLeft++];
        }

        while (posRight <= right) {
            temp[pos++] = data[posRight++];
        }

        while (left <= right) {
            data[left] = temp[left];
            left++;
        }
    }
}
