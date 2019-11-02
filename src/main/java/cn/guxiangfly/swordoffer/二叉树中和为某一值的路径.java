package cn.guxiangfly.swordoffer;

import java.util.ArrayList;

/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/10/31 21:50
 */
public class 二叉树中和为某一值的路径 {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        helper(root,target,result,new ArrayList<Integer>());

        /** 这个纯属是由于牛客刷题系统太傻比 list需要排序*/
        ArrayList<ArrayList<Integer>>  reverseResult = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            reverseResult.add(result.get(result.size()-1-i));
        }

        return reverseResult;
    }

    public void helper(TreeNode root, int sum,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> current){
        if (root==null){
            return;
        }
        current.add(root.val);
        /** 這代表是在叶子节点中了*/
        if (root.left==null && root.right==null && sum==root.val){
            res.add(new ArrayList<>(current));

            /** 由于这是一个递归 需要把当前加入current的元素去掉*/
            current.remove(current.size()-1);
            return;
        }

        helper(root.right,sum-root.val,res,current);
        helper(root.left,sum-root.val,res,current);
        current.remove(current.size()-1);
    }
}
