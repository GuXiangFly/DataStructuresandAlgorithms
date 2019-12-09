package cn.guxiangfly.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/11/19 15:51
 */
public class P_145_二叉树的后序遍历 {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> output = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root==null){
            return output;
        }
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode pop = stack.pop();
            output.addFirst(pop.val);
            if (pop.left !=null){
                stack.push(pop.left);
            }

            if (pop.right !=null){
                stack.push(pop.right);
            }
        }
        return output;
    }
}
