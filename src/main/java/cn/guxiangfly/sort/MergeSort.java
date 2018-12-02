package cn.guxiangfly.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * MergeSort
 * 将两个有序的数组 合并成一个有序的数组
 *
 * @author guxiang
 * @date 2018/1/15
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] a = {15, 20, 45, 50, 57};

        int[] b = {30, 35, 41, 45, 78, 97};

        int[] ints = mergesort2(a, b);
        System.out.println(Arrays.toString(ints));
    }

    private static void mergesort1(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if (i < a.length) {
            System.arraycopy(a, i, c, k, a.length - i);
        }
        if (j < b.length) {
            System.arraycopy(b, j, c, k, b.length - j);
        }

        System.out.println(Arrays.toString(c));
    }


    public static int[] mergesort2(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        int i = 0, j = 0, cur = 0;

        while (i < a1.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                res[cur++] = a1[i++];
            }else {
                res[cur++] = a2[j++];
            }
        }

        while (i < a1.length) {
            res[cur++] = a1[i++];
        }

        while (j < a2.length) {
            res[cur++] = a2[j++];
        }

        return res;
    }


}
