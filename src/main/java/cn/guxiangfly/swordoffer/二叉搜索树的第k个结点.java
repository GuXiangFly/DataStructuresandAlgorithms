package cn.guxiangfly.swordoffer;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/2/18
 * @desc : DataStructuresandAlgorithms
 */
public class 二叉搜索树的第k个结点 {

    public static int count = 0;

    public static TreeNode res = null;

    TreeNode KthNode(TreeNode pRoot, int k) {

        count = k;
        helper(pRoot);
        return  res;
    }

    public void helper(TreeNode proot) {
        if (proot== null) return;

        helper(proot.left);
        --count ;
        if (count==0){
            res = proot;
            return;
        }
        helper(proot.right);
    }
}
