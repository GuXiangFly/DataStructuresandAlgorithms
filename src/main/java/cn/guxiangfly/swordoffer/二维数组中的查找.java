package cn.guxiangfly.swordoffer;

/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/11/17 16:42
 */
public class 二维数组中的查找 {

    public boolean Find(int target, int [][] array) {
        if(array==null || array.length==0 || array[0].length==0){
            return false;
        }
        // i表示为第i行   j表示为第j列
        int i = 0;
        int j = array[0].length-1;
        while (i<array.length && j>=0){
            if (array[i][j]== target) {
                return true;
            }
            else if (array[i][j]> target) {
                j--;
            }
            else if (array[i][j]< target) {
                i++;
            }
        }

        return false;
    }

}
