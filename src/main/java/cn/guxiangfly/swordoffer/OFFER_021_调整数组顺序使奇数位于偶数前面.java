package cn.guxiangfly.swordoffer;

public class OFFER_021_调整数组顺序使奇数位于偶数前面 {


    public int[] exchange(int[] nums) {
        if (nums == null || nums.length <=1){
            return nums;
        }

        int left = 0;
        int right = nums.length-1;

        while (left<right){
            if (nums[left]%2 ==1) {
                left ++;
                continue;
            }

            if (nums[right]%2 ==0){
                right--;
                continue;
            }


            if (left < right){


                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left ++;
                right --;

            }


        }

        return nums;
    }
}
