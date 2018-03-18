package cn.guxiangfly.leetcode._47Permutations2;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 *  @link https://leetcode.com/problems/permutations-ii/description/
 * @author guxiang
 * @date 2018/2/7
 */
public class Solution {
    private static List<List<Integer>>  ans  = new ArrayList<>();

    public static boolean visited[] = new  boolean[100];
    public static int[] path = new int[100];

    public  void dfs(int idx,int[] nums) {
        if (idx>=nums.length){
            List<Integer>  list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                    list.add(path[i]);
            }
            /**
             * 去重
             */
            if (ans.contains(list))
                return;
            ans.add(list);
            return;
        }

        /**
         *  首次执行这个for循环表示 结果序列的第一个 可能是  给出的数组的 第一个 第二个 -- 第N个
         * dfs 一次为结果序列的第二个
         * idx表示 是结果序列上的第idx个
         *  如果给出的数组的 第i个没有被访问 那么就把它给 结果序列的第idx个元素 赋上 nums[i]
         *
         *  path 是用于记录结果序列的
         *  那么 结果序列
         *
         */
        for (int i = 0; i < nums.length; i++) {

            if (visited[i]==false){

                path[idx] = nums[i];
                visited[i] = true;
                dfs(idx+1,nums);
                visited[i] = false;
            }

        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        ans.clear();
        dfs(0,nums);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        Solution solution = new Solution();
        List<List<Integer>> permute = solution.permuteUnique(nums);
        for (List<Integer> integers : permute) {
            for (Integer integer : integers) {
                System.out.print(integer);
            }
            System.out.println("");
        }
    }
}
