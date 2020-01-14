package cn.guxiangfly.swordoffer;

/**
 * @Author guxiang02
 * @Date 2020/1/13 00:12
 **/
public class 调整数组顺序使奇数位于偶数前面_稳定 {
    public void reOrderArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
                    swap(j, j+1, array);
                }
            }
        }
    }

    public static void swap(int p, int q, int[] array) {
        int temp = array[p];
        array[p] = array[q];
        array[q] = temp;
    }
}
