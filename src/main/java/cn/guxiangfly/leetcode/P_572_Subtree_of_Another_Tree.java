package cn.guxiangfly.leetcode;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/5/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_572_Subtree_of_Another_Tree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p==null || q==null) return false;

        if (p.val != q.val) return false;

        return isSameTree(q.left,p.left) && isSameTree(q.right , p.right);
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return  false;

        if (isSameTree(s,t))
            return true;

        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public static void main(String[] args) {
        BigInteger decimal = new BigInteger(0+"");

        for (int i = 5; i < 2017; i++) {
            decimal= decimal.multiply(new BigInteger(i + ""));
        }

        System.out.println(decimal);
    }
}
