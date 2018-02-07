package cn.guxiangfly.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * MergeSort
 *
 * @author guxiang
 * @date 2018/1/15
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] a = {15, 20, 45, 50, 57};

        int[] b = {30, 35, 41, 45, 78, 97};

        int[] c = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            }
            else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if (i<a.length){
            System.arraycopy(a,i,c,k,a.length-i);
        }
        if (j<b.length){
            System.arraycopy(b,j,c,k,b.length-j);
        }

        System.out.println(Arrays.toString(c));
    }
}
