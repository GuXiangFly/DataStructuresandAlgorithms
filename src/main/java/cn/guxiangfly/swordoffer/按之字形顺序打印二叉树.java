package cn.guxiangfly.swordoffer;


import java.util.ArrayList;
import java.util.Stack;

/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/11/5 12:17
 */
public class 按之字形顺序打印二叉树 {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (pRoot==null){
            return result;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(pRoot);
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            if (!stack1.isEmpty()){
                ArrayList<Integer> list1 = new ArrayList<>();
                while (!stack1.isEmpty()){
                    TreeNode pop = stack1.pop();
                    if (pop.left!=null){
                        stack2.push(pop.left);
                    }
                    if (pop.right!=null){
                        stack2.push(pop.right);
                    }
                    list1.add(pop.val);
                }
                result.add(list1);
            }else{
                ArrayList<Integer> list2 = new ArrayList<>();
                while (!stack2.isEmpty()){
                    TreeNode pop = stack2.pop();
                    if (pop.right!=null){
                        stack1.push(pop.right);
                    }
                    if (pop.left!=null){
                        stack1.push(pop.left);
                    }
                    list2.add(pop.val);
                }
                result.add(list2);
            }
        }
        return result;
    }
    
}
