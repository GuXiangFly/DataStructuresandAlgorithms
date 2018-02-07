package cn.guxiangfly.leetcode._78sbsets;

import java.util.ArrayList;
import java.util.List;

/**
 * Test
 *
 * @author guxiang
 * @date 2018/2/7
 *
 * Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,3], a solution is:

        [
            [3],
            [1],
            [2],
            [1,2,3],
            [1,3],
            [2,3],
            [1,2],
            []
        ]


 我的思路：  这个就是说 有两种情况  1 2 3 这三个数字 每个都有可能是填上去 或者不填上去

            v[idx] = true;
            robot(idx+1, nums);

            v[idx] = false;
            robot(idx+1, nums);

            通过这个代码 就可以将6种情况的排列组合都放上去
            然后只需要将为false 的数字不填上去  为true 的数字 填上去

 */
public class Solution {

    public static boolean v[] = new  boolean[100];

    public static  List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public void robot(int idx,int[] nums ){
        if (idx >= nums.length){
            List<Integer> r = new ArrayList<>();
            for (int i = 0;i<nums.length;i++){
                if (v[i]){
                    r.add(nums[i]);
                }
            }
            ans.add(r);
            return;
        }



        v[idx] = true;
        robot(idx+1, nums);

        v[idx] = false;
        robot(idx+1, nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        ans.clear();
        robot(0,nums);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Solution solution = new Solution();
        List<List<Integer>> subsets = solution.subsets(nums);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }

    }


}
