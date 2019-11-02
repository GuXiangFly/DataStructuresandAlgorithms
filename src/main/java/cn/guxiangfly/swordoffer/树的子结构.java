package cn.guxiangfly.swordoffer;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/5/18
 * @desc : DataStructuresandAlgorithms
 */
public class 树的子结构 {
/*    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return  false;
        }

        if (isSameTree(root1,root2)){
            return true;
        }

        return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p==null || q==null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(q.left,p.left) && isSameTree(q.right , p.right);
    }*/


    /**
     * 判断root2 是否为 root1的子结构   于LeetCode不同的在于，root1 有的 root2可以没有。 root2可以是root1的上面部分或者下面部分
     *
     * @param root1
     * @param root2
     * @return
     */
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null  || root2 == null ){
            return false;
        }


        //首先判断 root是否相等
        if (root1.val == root2.val){
            boolean flag1 = twoIsSameTree(root1, root2);
            if (flag1){
                return true;
            }
        }

        // 判断左子树是否相等
        boolean flag2 = twoIsSameTree(root1.left, root2);
        if (flag2){
            return true;
        }

        Boolean  flag3 = twoIsSameTree(root1.right,root2);
        if (flag3){
            return true;
        }
        return false;
    }


    public boolean twoIsSameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return false;
        }
        if (root2 == null) {
            return true;
        }
        if (root1.val == root2.val) {
            Boolean leftequals = false;
            Boolean rightequals =false;

            if (root2.left == null){
                leftequals = true;
            }else{
                leftequals =  twoIsSameTree(root1.left,root2.left);
            }

            if (root2.right == null){
                rightequals = true;
            }else{
                rightequals = twoIsSameTree(root1.right,root2.right);
            }

            if (leftequals && rightequals) {
                return true;
            }
        }
        return false;

    }
}
