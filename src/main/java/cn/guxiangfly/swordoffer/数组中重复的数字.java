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

    /**
     * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/solution/jian-zhi-offer-mian-shi-ti-jing-xuan-tu-jie-03-shu/
     * 输入
     *  [2, 3, 1, 0, 2, 5, 3]
     * 第一次交换
     *  [1, 3, 2, 0, 2, 5, 3]
     * 第二次交换
     *  [3, 1, 2, 0, 2, 5, 3]
     *  第三次交换
     *  [0, 1, 2, 3, 2, 5, 3]
     * @param nums
     * @return
     */
     public int findRepeatNumber(int[] nums) {

         for (int i = 0; i < nums.length; i++) {



             while (nums[i] != i){
                 if (nums[i] != nums[nums[i]]){
                     int temp = nums[i];
                     nums[i] = nums[nums[i]];
                     nums[nums[i]] = temp;
                 }else {
                     return nums[i];
                 }
             }
         }
        return -1;
    }


//    public boolean  duplicate2(int numbers[], int length, int[] duplication) {
//        if (length<=1){
//            return false;
//        }
//        for (int i = 0; i < length; i++) {
//            if (numbers[i] != i){
//                if (numbers[numbers[i]] != )
//            }
//        }
//    }
}
