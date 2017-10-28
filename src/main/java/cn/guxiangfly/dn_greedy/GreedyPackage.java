package cn.guxiangfly.dn_greedy;

import java.util.Arrays;

/**
 * GreedyPackage
 *
 * @author guxiang
 * @date 2017/10/28
 */
public class GreedyPackage {
    private int MAX_WEIGHT = 150;
    private int[] weights = new int[]{35,30,60,50,40,10,25};
    private int[] values = new int[]{10,40,30,50,35,40,30};

    private void packageGreedy(int capacity , int weights[] , int[] values){
        int n = weights.length;
        double[] r = new double[n];  //性价比
        int[] index = new int[n];     //性价比排序的下标

        for (int i =0; i<n;i++){
            r[i] = (double)values[i]/(double)weights[i];
            index[i] = i;
        }

        for (int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
              if(r[i]<r[j]){
                  //对性价比进行排序
                  double temp = r[i];
                  r[i] = r[j];
                  r[j] = temp;

                  //同时对性价比进行排序
                  int x = index[i];
                  index[i] = index[j];
                  index[j] = x;
              }

            }
        }

        //排序好的重量和价值分别存到数组中
        int[] v1 = new int[n];
        int[] w1 = new int[n];

        for (int i =0;i<n;i++){
            w1[i] = weights[index[i]];
            v1[i] = values[index[i]];
        }

        int maxValue = 0;
        int[]  x = new int[n];
        for (int i = 0; i <n ; i++) {

            if(w1[i]<=capacity){
                //还可以装得下
                x[i] =1;
                maxValue+=v1[i];
                capacity= capacity-w1[i];
                System.out.println("我将他放进包："+w1[i]);
            }
        }

        System.out.println("总共放下的物品数量是："+ Arrays.toString(x));
        System.out.println("最大价值"+maxValue);

    }


    public static void main(String[] args) {
        GreedyPackage greedyPackage = new GreedyPackage();
        greedyPackage.packageGreedy(greedyPackage.MAX_WEIGHT,greedyPackage.weights,greedyPackage.values);
    }
}
