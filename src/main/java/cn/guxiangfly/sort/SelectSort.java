package cn.guxiangfly.sort;

/**
 * SelectSort
 *
 * @author guxiang
 * @date 2017/11/8
 */
public class SelectSort {
    public void selectSort(int[] array){
        int [] newArray = new int[array.length];
        int min = array[0];
        for (int i = 0; i <array.length ; i++) {
            for (int j = i; j <array.length; j++) {
                if (array[j]<min){
                    newArray[i]=min;
                }
            }
        }
    }
}
