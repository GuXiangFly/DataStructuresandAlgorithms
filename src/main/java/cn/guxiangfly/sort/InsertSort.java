package cn.guxiangfly.sort;

import java.util.Arrays;

/**
 * InsertSort
 * 插入排序
 *
 * @link <a href="http://www.bilibili.com/video/av11416853/?spm_id_from=333.338.v_desc.1#page=30">视频讲解</a>
 * @author guxiang
 * @date 2018/1/15
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {12,4,87,46,87};
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int j = i-1;
            while (j>=0&&a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }

        System.out.println(Arrays.toString(a));
    }
}
