package cn.guxiangfly.swordoffer;

import cn.guxiangfly.backtrack.Queen;

/**
 * @Author guxiang02
 * @Date 2020/1/13 00:12
 **/
public class 调整数组顺序使奇数位于偶数前面_非稳定 {
    public void reOrderArray(int[] array) {
        int p = 0;
        int q = array.length - 1;

        while (p < q) {

            while (p < q && array[p] % 2 == 1) {
                p++;
            }
            while (p < q && array[q] % 2 == 0) {
                q--;
            }
            swap(p, q, array);
        }
    }

    public static void swap(int p, int q, int[] array) {
        int temp = array[p];
        array[p] = array[q];
        array[q] = temp;
    }
}
