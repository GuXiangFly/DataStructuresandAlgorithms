package cn.guxiangfly.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author guxiang02
 * @Date 2019/12/22 23:46
 **/
public class P_046_全排列 {
    public static List<List<Integer>> res = null;

    public static boolean[] used = null;

    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        used = new boolean[nums.length];

        if (nums == null || nums.length==0){
            return res;
        }

        findCombination(nums,0,new LinkedList<>());
        return res;
    }

    public void findCombination(int[] nums,int index , LinkedList<Integer>  subList){
        if (index == nums.length){
           List<Integer> clone = (List<Integer>) subList.clone();
            res.add(clone);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] == false){
                subList.addLast(nums[i]);
                used[i] = true;
                findCombination(nums,index+1, subList);
                subList.removeLast();
                used[i] = false;
            }
        }
    }
}
