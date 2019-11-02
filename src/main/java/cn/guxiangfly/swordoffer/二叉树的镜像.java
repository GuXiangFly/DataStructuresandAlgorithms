package cn.guxiangfly.swordoffer;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/1/18
 * @desc : DataStructuresandAlgorithms
 */
public class 二叉树的镜像 {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right ==null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if (root.left!=null){
            Mirror(root.left);
        }
        if (root.right !=null){
            Mirror(root.right);
        }
    }


    public void Mirror2(TreeNode root) {
        if (root==null){
            return;
        }
        if (root.left == null && root.right==null){
            return;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if (root.left!=null){
            Mirror2(root.left);
        }
        if (root.right!=null){
            Mirror2(root.right);
        }
    }
}
