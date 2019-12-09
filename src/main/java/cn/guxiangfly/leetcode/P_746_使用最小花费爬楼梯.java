package cn.guxiangfly.leetcode;

public class P_746_使用最小花费爬楼梯 {



    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 0){
            return 0;
        }

        int m = cost.length-1;
        if (m == 0){
            return 0;
        }
        if (m ==1){
            return 0;
        }
        //我是这样理解的,感觉比较好理解
        //dp数组的每一个元素表示到达当前楼层所需的最小花费
        //也就是dp的第i个值是不包含cost[i]的，因为还没从第i层走出去，没消耗体力
        //dp的长度=cost+1，dp的最后一个元素就是到达楼顶所需的最小花费
        int[] dp = new int[cost.length];
        dp[0] = 0;
        dp[1] = 0;//因为最开始可以选择起点，而选择起点是不消耗体力的
        for(int i=2; i<dp.length; i++){
            //要么从第i-2层走到第i层，从要么第i-1层走到第i层
            int a = dp[i-2]+cost[i-2];
            int b = dp[i-1]+cost[i-1];
            dp[i] = Math.min(a,b);
        }

        return dp[dp.length-1];
    }


    public int minCostClimbingStairs2(int[] cost) {
        if (cost.length == 0){
            return 0;
        }

        int i = cost.length-1;
        if (i == 0){
            return 0;
        }
        if (i ==1){
            return 0;
        }
        int[] dp_arr =  new int[cost.length];
        dp_arr[0] = cost[0];
        dp_arr[1] = cost[1];
        dp_arr[2] = Math.min(cost[0],cost[1]) + cost[2];
        for (int j = 3; j < dp_arr.length; j++) {
            int a = dp_arr[j-1] + cost[j];
            int b = dp_arr[j-2] + cost[j];

            dp_arr[j] = Math.min(a,b);
        }

        return Math.min(dp_arr[i],dp_arr[i-1]);
    }
}
