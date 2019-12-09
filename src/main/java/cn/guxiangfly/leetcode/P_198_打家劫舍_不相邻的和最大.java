package cn.guxiangfly.leetcode;

public class P_198_打家劫舍_不相邻的和最大 {


    public int rob(int[] nums) {
        return dp_opt(nums);
    }


    public int dp_opt(int[] arr){

        if (arr.length == 0 ){
            return 0;
        }
        if (arr.length == 1){
            return arr[0];
        }
        if (arr.length == 2){
            return Math.max(arr[0],arr[1]);
        }



        int[] opt_arr = new int[arr.length];
        opt_arr[0] = arr[0];
        opt_arr[1] = Math.max(arr[0],arr[1]);

        for (int i = 2; i < opt_arr.length; i++) {
            int a= opt_arr[i-2] + arr[i];
            int b = opt_arr[i-1];
            opt_arr[i] = Math.max(a,b);
        }

        return opt_arr[arr.length-1];
    }

    /**
     * 这是递归的方式
     * @param nums
     * @return
     */
    public int rob2(int[] nums) {

        if (nums.length==0){
            return 0;
        }
        return rec_opt(nums,nums.length-1);
    }

    public int rec_opt(int[] arr , int i){
        if (i==0){
            return arr[0];
        }else if (i==1){
            return Math.max(arr[0],arr[1]);
        }else {
            int a = rec_opt(arr,i-2) + arr[i];
            int b = rec_opt(arr,i-1);
            return Math.max(a,b);
        }

    }
}
