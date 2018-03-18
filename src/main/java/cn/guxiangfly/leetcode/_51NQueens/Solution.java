package cn.guxiangfly.leetcode._51NQueens;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 * @link https://leetcode.com/problems/n-queens/description/\
 *
 * @author guxiang
 * @date 2018/2/7
 */
public class Solution {

    public static boolean lie[] = new  boolean[100];

    public static  List<List<String>> ans = new ArrayList<List<String>>();


    public static boolean zheng[] = new boolean[100];
    public static boolean fan[] = new boolean[100];

    /**
     * 这个path用于记录 一个棋盘中皇后的位置
     */
    public static int[] path = new int[100];

    public void dfs(int idx , int n){
        //n * n 的棋盘
        if (idx >= n){

            List<String> chess = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String tmp = "";
                for (int j = 0; j <n; j++) {
                    if (j == path[i]){
                        tmp +="Q";
                    } else {
                        tmp +=".";
                    }
                }
                chess.add(tmp);
            }
            ans.add(chess);
            return;
        }

        /**
         * 这个for循环是尝试遍历 棋盘的第一排的皇后 放在哪  for是写出所有的相邻状态  是同一层的关系
         *
         * dfs就是往下去看  第二排（行）的皇后应该放在哪
         */
        for (int i = 0; i < n; i++) {
            // lie 代表 列
            // 当第 i 列 没有被占用的时候 才走下去
           if (!lie[i] && !zheng[idx +i] && !fan[idx-i+n-1]){

               // 机器人在第idx行 的 第i列
               path[idx] = i;
               zheng[idx+i] = true;
               fan[idx-i+n-1] = true;
               //机器人占据 第 i 行
               lie[i] = true;
               dfs(idx+1,n);
               //机器人结束后就死了  他应该之后就被销毁
               lie[i] = false;

               zheng[idx+i] = false;
               fan[idx-i+n-1] = false;
           }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        ans.clear();
        dfs(0,n);
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> lists = solution.solveNQueens(4);
        for (List<String> list : lists) {
            for (String s : list) {
                System.out.println(s);
            }
            System.out.println("");
        }
    }
}
