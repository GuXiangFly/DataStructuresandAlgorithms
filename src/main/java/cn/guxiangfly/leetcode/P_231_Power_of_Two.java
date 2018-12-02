package cn.guxiangfly.leetcode;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 11/25/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_231_Power_of_Two {
    public boolean isPowerOfTwo(int n) {
        return n>0&&((n&(n-1))==0);
    }
}
