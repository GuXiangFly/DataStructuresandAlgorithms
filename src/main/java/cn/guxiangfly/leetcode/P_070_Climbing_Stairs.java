package cn.guxiangfly.leetcode;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 11/28/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_070_Climbing_Stairs {
    public int climbStairs(int n) {
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
