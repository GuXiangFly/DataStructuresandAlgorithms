package cn.guxiangfly.leetcode;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/2/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_230_Kth_Smallest_Element_in_a_BST {


    public  static  int count = 0;
    public  static  int res = 0;

    public int kthSmallest(TreeNode root, int k) {
      count = k;
      helper(root);
      return  res;
    }

    public void  helper(TreeNode root ){
        if (root == null) return;
        helper(root.left);
        count --;
        if (count == 0){
            res = root.val;
            return;
        }
        helper(root.right);
    }
}
