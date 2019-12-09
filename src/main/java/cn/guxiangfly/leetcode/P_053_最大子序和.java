package cn.guxiangfly.leetcode;

public class P_053_最大子序和 {


    /**
     * 这段代码可以被优化
     * 比方说在 赋值dp_arr 的时候 就
     * @param nums
     * @return
     */
    public int maxSubArray1(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }

        int[] dp_arr = new int[nums.length];
        dp_arr[0] = nums[0];
        for (int i = 1; i < dp_arr.length; i++) {
            int a = nums[i];
            int b = dp_arr[i-1] + nums[i];
            dp_arr[i] = Math.max(a,b);
        }


        // 这里可以优化一下 在 比较的时候 可以在  dp_arr[i] = Math.max(a,b)的时候 就比较出最大值
        int maxNum = nums[0];
        for (int dp_i : dp_arr) {
            if (dp_i> maxNum){
                maxNum = dp_i;
            }
        }
        return maxNum;
    }
}
