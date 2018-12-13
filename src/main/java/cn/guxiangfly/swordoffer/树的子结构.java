package cn.guxiangfly.swordoffer;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/5/18
 * @desc : DataStructuresandAlgorithms
 */
public class 树的子结构 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null) return  false;

        if (isSameTree(root1,root2))
            return true;

        return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p==null || q==null) return false;

        if (p.val != q.val) return false;

        return isSameTree(q.left,p.left) && isSameTree(q.right , p.right);
    }
}
