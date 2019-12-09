package cn.guxiangfly.leetcode;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 11/28/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_070_Climbing_Stairs {

    public static void main(String[] args) {
        int i = new P_070_Climbing_Stairs().climbStairs(3);
        System.out.println(i);

    }
    /**
     * opt(1) = 1
     * opt(2) = 2
     * opt(3) = opt(1) + opt(2)
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n ==1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        int[] dp_arr = new int[n+1];
        dp_arr[1] = 1;
        dp_arr[2] = 2;

        for (int i = 3; i < dp_arr.length; i++) {
            dp_arr[i] = dp_arr[i-1] + dp_arr[i-2];
        }
        return dp_arr[n];
    }




    public int climbStairs_1(int n) {
        if (n <= 2) return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int climbStairs2(int n) {
        if (n <= 2) return n;
        int oneStep = 1, twoStep = 1, res = 0;

        for (int i = 2; i <= n; i++) {
            res = oneStep+twoStep;
            twoStep = oneStep;
            oneStep = res;
        }
        return res;
    }
}
