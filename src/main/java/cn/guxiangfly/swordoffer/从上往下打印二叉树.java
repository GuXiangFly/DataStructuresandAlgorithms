package cn.guxiangfly.swordoffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;


/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/11/4 21:45
 */
public class 从上往下打印二叉树 {



    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        while (!deque.isEmpty()){
            TreeNode pop = deque.pop();
            result.add(pop.val);
            if (pop.left!=null){
                deque.add(pop.left);
            }
            if (pop.right!=null){
                deque.add(pop.right);
            }
        }
        return result;
    }

}
