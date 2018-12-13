package cn.guxiangfly.leetcode;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/10/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_236_Lowest_Common_Ancestor_of_a_Binary_Tree {
    /**
     * 236. Lowest Common Ancestor of a Binary Tree
     * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
     * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v
     * and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”
     * time: O(n);
     * space : O(n);
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        /** 如果左节点 和 右节点 都是*/
        if (left != null && right != null) {
            return root;
        }
        if (left == null && right != null) {
            return right;
        } else
            return left;
    }
}
