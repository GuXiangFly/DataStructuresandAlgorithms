package cn.guxiangfly.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author guxiang02
 * @Date 2020/7/24
 *
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 * 假设现在有
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/coin-change
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class P_322_零钱兑换 {

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;

        new P_322_零钱兑换().coinChange(coins, amount);
    }



    public int coinChange(int[] coins, int amount) {

        if (amount == 0) {
            return 0;
        }
        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            minCoins = Math.min(coin, minCoins);
        }

        if ( amount< minCoins) {
            return -1;
        }


        int[] dp = new int[amount+1];
        for (int i = 0; i < minCoins; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int coin : coins) {
            dp[coin] = 1;
        }
        dp[0] = 0;

        /**
         * i 代表 amount =i的时候的最优解
         */
        for (int i = minCoins; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i>= coin) {
                    min = Math.min(min , dp[i-coin] +1);
                }
            }
            dp[i] = min;
        }

        if (dp[amount] > amount){
            return -1;
        }
        if (dp[amount] <1) {
            return -1;
        }
        return dp[amount] ;

    }




    public int coinsIn45(int amount){
        if (amount<1) {
            return Integer.MAX_VALUE;
        }

        if (amount == 25 || amount == 20 || amount == 5 || amount ==1){
            return 1;
        }

        int min1 = coinsIn45(amount -25) + 1;
        int min2 = coinsIn45(amount -20) + 1;
        int min3 = coinsIn45(amount -5) + 1;
        int min4 = coinsIn45(amount -1) + 1;

        List<Integer> resultSort = new ArrayList<>();
        resultSort.add(min1);
        resultSort.add(min2);
        resultSort.add(min3);
        resultSort.add(min4);

        return Collections.min(resultSort);
    }
}
