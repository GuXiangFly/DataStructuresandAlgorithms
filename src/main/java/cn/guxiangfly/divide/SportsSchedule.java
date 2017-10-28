package cn.guxiangfly.divide;

/**
 * SportsSchedule
 *
 * @author guxiang
 * @date 2017/10/28
 */
public class SportsSchedule {
    public void  scheduleTable(int[][] table,int n){
        if (n==1){
            table[0][0]=1;
        }else {
            //填充左上区域矩阵
            int m = n/2;
            scheduleTable(table,m);

            //填充右上区域
            for (int i = 0; i <m ; i++) {
                //从二分之一处开始，右边二分之一的每个数比左边你的二分之一的每个数大 n/2   8/2=4
                for (int j = m; j <n ; j++) {
                    table[i][j] = table[i][j-m]+m;
                }
            }

            //填充左下区域
            for (int i = m; i < n; i++) {
                //从二分之一处开始，右边二分之一的每个数比左边你的二分之一的每个数大 n/2   8/2=4
                for (int j = 0; j <m; j++) {
                    table[i][j] = table[i-m][j]+m;
                }
            }
            //填充右下区域
            for (int i = m; i <n ; i++) {
                for (int j = m; j <n; j++) {
                    table[i][j] =table[i-m][j-m];
                }
            }
        }
    }

    public static void main(String[] args) {
        int [][] table = new int[8][8];
        int n =8;

        SportsSchedule sportsSchedule = new SportsSchedule();
        sportsSchedule.scheduleTable(table,n);

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
