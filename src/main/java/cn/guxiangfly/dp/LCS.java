package cn.guxiangfly.dp;

/**
 * LCS
 *  寻找最长的公共子序列
 * @author guxiang
 * @date 2017/10/28
 */
public class LCS {
    public int findLCS(String A,String B){
        int n = A.length();
        int m = B.length();
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        int [][] dp = new int[n][m];

        //将第一行推出来   n代表是行
        for (int i = 0; i <n ; i++) {
            if (a[i]==b[0]){
                dp[i][0]=1;
                for (int j = i; j <n ; j++) {
                    dp[j][0]=1;
                }
                //由于第一列只出了一个字母，与第一行的所有匹配，所以只可能有一个匹配上，break是为了提高效率，不break也可以
                break;
            }
        }

        //将第一列推出来
        for (int i = 0; i <m ; i++) {
            if (b[i]==a[0]){
                dp[0][i]=1;
                for (int j = i; j < m; j++) {
                    dp[0][j]=1;
                }
                break;
            }
        }

        //初始化好第一行第一列后，就可以通过动态规划的公式，去推出后面的矩阵
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <m ; j++) {
                if (a[i]==b[j]){
                    dp[i][j]= dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }


        for (int[] ints : dp) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println("");
        }
        return dp[n-1][m-1];
    }

    public static void main(String[] args) {
        LCS lcs = new LCS();
        int findLCS = lcs.findLCS("androidwe", "randome");
        System.out.println("最长子序列长度："+findLCS);
    }
}
