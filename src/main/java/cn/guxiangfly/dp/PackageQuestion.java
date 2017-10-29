package cn.guxiangfly.dp;

/**
 * PackageQuestion
 *
 * @author guxiang
 * @date 2017/10/29
 *
 * question by: http://blog.csdn.net/u014394715/article/details/51162960
 */
public class PackageQuestion {

    public void getPgAnswer(Package[] pg,int totailweight){

        // dp[i][j]  的每个坐标代表  在前 i 件物品中选择若干件放在承重为 j 的背包中，可以取得的最大价值。

        int[][] dp = new int[pg.length][totailweight];

        //填充第一行
        for (int i = 0; i <totailweight ; i++) {
            if (pg[0].getWeight()<=i){
                dp[0][i] = pg[0].getValue();
            }
        }

        //填充第一列
        for (int i = 0; i <pg.length ; i++) {
            if (pg[i].getWeight()<1){
                dp[i][0] = pg[i].getValue();
            }
        }

        //状态转移
        /**
         * 思路：
         1. 01背包的状态转换方程 f[i,j] = Max{f[i-1,j-Wi]+Pi( j >= Wi ), f[i-1,j] }

         f[i,j]：在前i件物品中选择若干件放在承重为 j 的背包中，可以取得的最大价值。
         Pi表示第i件物品的价值。
         决策：为了背包中物品总价值最大化，第 i件物品应该放入背包中吗 ？
         2. 以a8（行为a，列为的8的单元格）举例
         f[i,j] = a8 = 15
         f[i-1,j] = b8 = 9
         f[i-1,j-Wi] 表示我有一个承重为6的背包（等于当前背包承重减去物品a的重量），当只有物品b,c,d,e四件可选时，这个背包能装入的最大价值
         f[i-1,j-Wi] +Pi =b(8 - 2) + 6 = b6 + 6 = 15
         */
        for (int i = 1; i <pg.length ; i++) {
            for (int j = 1; j <totailweight ; j++) {

                dp[i][j] = dp[i - 1][j];
                if (j < pg[i].getWeight()) {
                    continue;
                }
                dp[i][j] = Math.max(dp[i-1][j-pg[i].getWeight()]+pg[i].getValue(),dp[i-1][j]);
            }
        }

        //显示dp
        for (int[] ints : dp) {
            for (int anInt : ints) {
                System.out.printf("%3d",anInt);
            }
            System.out.println("");
        }

    }


    public static void main(String[] args) {


        Package[] pg2 =  {
                new Package("e",35,10),
                new Package("d",30,40),
                new Package("c",60,30),
                new Package("b",50,50),
                new Package("a",40,35),
                new Package("a",10,40),
                new Package("a",25,30)
        };

        Package[] pg =  {
                new Package("e",5,10),
                new Package("d",4,40),
                new Package("c",6,30),
                new Package("b",3,50)
        };
        PackageQuestion packageQuestion = new PackageQuestion();
        packageQuestion.getPgAnswer(pg2,150);


    }
}


class Package {

    private String name;

    private int weight;

    private int value;

    public Package(String name,int weight,int value){
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }
}