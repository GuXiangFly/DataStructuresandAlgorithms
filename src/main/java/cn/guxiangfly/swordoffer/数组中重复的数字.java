package cn.guxiangfly.swordoffer;

/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/11/17 21:06
 */
public class 数组中重复的数字 {

    public boolean duplicate(int numbers[], int length, int[] duplication) {
        int temp;
        if (length <= 1){
            return false;
        }
        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                if (numbers[numbers[i]] != numbers[i]) {
                    temp = numbers[numbers[i]];
                    numbers[numbers[i]] = numbers[i];
                    numbers[i] = temp;
                } else {
                    duplication[0] = numbers[i];
                    return true;
                }
            }
        }
        return false;
    }
}
