package cn.guxiangfly.sort;

import java.util.Arrays;

/**
 * QuickSort
 *
 * @author guxiang
 * @date 2018/1/10
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr= new int[]{2,3,4,8,1,2};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int left,int right){
        //如果left不小于right
        if (left>=right) return;

        //以最左边的为基准点:pivot
        int pivot = arr[left];

        //比pivot大的在左边，比p小的在右边
        int i=left,j=right;

        while (i<j){
            //j向左移动  找一个比p小的
            while (arr[j]>=pivot && i<j){
                j--;
            }
            //i向右移动  找一个比p大的
            while (arr[i]<=pivot && i<j){
                i++;
            }
            //ij交换
            if (i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //最初的 arr[left] 就是数组的最左边 也就是 pivot的位置
        arr[left] = arr[i];
        arr[i] = pivot;


        //对序列中  i左边的元素实施快速排序
        quickSort(arr,left,i-1);
        //对序列中  i右边的元素实施快速排序
        quickSort(arr,i+1,right);
    }



}
