package cn.guxiangfly.dp;

/**
 * LCS
 *  寻找最长的公共子序列
 * @author guxiang
 * @date 2017/10/28
 */
public class MinPath {

    public int getMinPath(int [][] m){

        //定义为 rows行数  一列有几个
        // col列的  矩阵   一行有几个
        int rows= m.length;
        int col = m[0].length;


        int[][] dp = new int[rows][col];

        //将第一行推出来   rows代表是列数  一行有几个
        for (int i = 0; i <rows ; i++) {
            if (i==0){
                dp[0][i]=m[0][i];
            }else {
                dp[0][i]=m[0][i]+dp[0][i-1];
            }
        }


        //将第一l列推出来   col代表是行数  一行有几个
        for (int i = 0; i <col ; i++) {
            if (i==0){
                dp[i][0]=m[i][0];
            }else {
                dp[i][0]=m[i][0]+dp[i-1][0];
            }
        }


        for (int i = 1; i <rows ; i++) {
            for (int j = 1; j <col ; j++) {
                dp[i][j]= Math.min(dp[i-1][j]+m[i][j],dp[i][j-1]+m[i][j]);
            }
        }

        //显示dp
        for (int[] ints : dp) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println("");
        }

        return dp[rows-1][col-1];
    }




    public static void main(String[] args) {
       // MinPath lcs = new MinPath();
       // int findLCS = lcs.findLCS("android", "random");
       // System.out.println("最长子序列长度："+findLCS);

        int [][] m = new int[][]{
                {1,3,5,9},
                {8,1,3,4},
                {5,0,6,1},
                {8,8,4,0}
        };

        MinPath minPath = new MinPath();
        minPath.getMinPath(m);
    }
}
