package cn.guxiangfly.sort.hanshunping;

import java.util.Arrays;

/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/11/1 11:58
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {54,26,93,77,77,31,44,55,77};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;

        int pivot = arr[(left + right) / 2];

        int temp=0;

        while (l < r) {

            while (arr[l] < pivot) {
                l++;
            }
            while (arr[r] > pivot) {
                r--;
            }

            if (l>=r){
                break;
            }

            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            if (arr[l] == pivot) {
                r--;
            }
            if (arr[r] == pivot) {
                l++;
            }
        }

        if (l==r){
            l++;
            r--;
        }

        if (left<r){
            quickSort(arr,left,r);
        }
        if (right>l){
            quickSort(arr,l,right);
        }


    }
}
