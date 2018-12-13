package cn.guxiangfly.leetcode;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/10/18
 * @desc : DataStructuresandAlgorithms
 *  /**
 *      * Given a binary tree, find the maximum path sum.
 *      For this problem, a path is defined as any sequence of nodes from some starting node to any node
 *      in the tree along the parent-child connections. The path must contain at least one node and does not
 *      need to go through the root.
 *      For example:
 *      Given the below binary tree,
 *        1
 *       / \
 *      2   3
 *      Return 6.
 *           3
 *          / \
 *         9  20
 *       /  \
 *      15   7
 *      time : O(n)
 *      space : O(n)
 */


public class P_124_Binary_Tree_Maximum_Path_Sum {

    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        dfs(root);
        return res;
    }

    public int dfs(TreeNode root){
        if (root==null) return 0;
        int left = Math.max(0, dfs(root.left));
        int right = Math.max(0, dfs(root.right));

        int tempres = left + right+ root.val;
        res = Math.max(res,tempres);
        return Math.max(left, right) + root.val;
    }


}
