package cn.guxiangfly.swordoffer;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/2/18
 * @desc : DataStructuresandAlgorithms
 */
public class 二叉树的深度 {

    public int TreeDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }

        int rightHight = TreeDepth(root.right);
        int leftHight = TreeDepth(root.left);

        return Math.max(rightHight,leftHight) +1;
    }
}