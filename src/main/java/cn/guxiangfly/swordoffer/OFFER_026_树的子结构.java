package cn.guxiangfly.swordoffer;

public class OFFER_026_树的子结构 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A==null || B == null){
            return false;
        }

        // A 的根节点 和 B的根节点相同， 比较他们B和A是否相等结构
        // A 的根节点和B的根节点不同， 比较B是否是 A.left的子结构
        // A 的根节点和B的根节点不同， 比较B是否是 A.right的子结构
        return isSub(A,B) || isSubStructure(A.left,B)|| isSubStructure(A.right,B);
    }


    public boolean isSub(TreeNode A, TreeNode B){
        if (B == null){
            return true;
        }
        if (A == null){
            return false;
        }

        if (A.val != B.val){
            return false;
        }

        return isSub(A.left, B.left) && isSub(A.right, B.right);
    }
}
