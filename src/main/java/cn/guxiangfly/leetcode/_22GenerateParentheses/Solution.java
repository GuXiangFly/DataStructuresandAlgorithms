package cn.guxiangfly.leetcode._22GenerateParentheses;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Test
 *
 * @author guxiang
 * @date 2018/2/7
 * <p>
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 * <p>
 * For example,
 * If nums = [1,2,3], a solution is:
 * <p>
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 * <p>
 * <p>
 * 我的思路：  这个就是说 有两种情况  1 2 3 这三个数字 每个都有可能是填上去 或者不填上去
 * <p>
 * v[idx] = true;
 * robot(idx+1, nums);
 * <p>
 * v[idx] = false;
 * robot(idx+1, nums);
 * <p>
 * 通过这个代码 就可以将6种情况的排列组合都放上去
 * 然后只需要将为false 的数字不填上去  为true 的数字 填上去
 */
public class Solution {

    public static boolean visited[] = new boolean[1000];

    public static List<String> ans = new ArrayList<>();

    public void dfs(int idx, int rn, int ln, int n, char[] path) {

        if (idx >= 2 * n) {
           String string= new String(path);
           ans.add(string);
            return;
        }

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                if (rn < n) {
                    path[idx] = '(';
                    dfs(idx+1,rn+1 ,ln,n,path);
                    path[idx] = ' ';
                }
            }
            if (i==1){
                if (ln<rn){
                    path[idx] = ')';
                    dfs(idx+1,rn,ln+1 ,n,path);
                }
            }
        }

    }

    public List<String> generateParenthesis(int n) {
        ans.clear();
        char[] path = new char[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            path[i] = ' ';
        }
        dfs(0, 0, 0, n, path);
        return ans;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        List<String> strings = solution.generateParenthesis(3);
        for (String string : strings) {
            System.out.println(string);
        }
    }


}
