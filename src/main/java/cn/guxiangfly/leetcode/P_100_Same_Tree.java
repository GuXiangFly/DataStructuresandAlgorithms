package cn.guxiangfly.leetcode;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/5/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_100_Same_Tree {


    /**
     * 100. Same Tree
     Given two binary trees, write a function to check if they are equal or not.
     Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
     time : O(n);
     space : O(n);
     * @param p
     * @param q
     * @return
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p==null || q==null) return false;

        if (p.val != q.val) return false;

        return isSameTree(q.left,p.left) && isSameTree(q.right , p.right);
    }
}
