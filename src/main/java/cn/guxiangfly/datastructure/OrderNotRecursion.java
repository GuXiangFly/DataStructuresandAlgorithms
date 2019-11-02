package cn.guxiangfly.datastructure;

import cn.guxiangfly.swordoffer.TreeNode;

import java.util.Stack;

/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/11/1 19:52
 */
public class OrderNotRecursion {

    public static void preOrder(TreeNode root){
        Stack<TreeNode> stacks = new Stack<>();
        stacks.push(root);
        while (!stacks.isEmpty()){
            TreeNode pop = stacks.pop();
            System.out.println(pop.val);

            if (pop.right!=null){
                stacks.push(pop.right);
            }
            if (pop.left!=null){
                stacks.push(pop.left);
            }
        }
    }


}
