package cn.guxiangfly.swordoffer;

/**
 *
 * 题目： 给定一棵二叉树的其中一个节点，请找出中序遍历序列的下一个节点。
 *
 * 假定二叉树是：[2, 1, 3, null, null, null, null]， 给出的是值等于2的节点。
 *
 * 则应返回值等于3的节点。
 *
 * 解释：该二叉树的结构如下，2的后继节点是3。
 *   2
 *  / \
 * 1   3
 * @Author guxiang02
 * @Date 2020/1/21 10:57
 **/
public class 二叉树的下一个结点 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {

        //如果 pNode有右节点，那么就是它右节点的最小的左子树
        if (pNode.right!=null){
            pNode = pNode.right;
            while (pNode.left!=null){
                pNode=pNode.left;
            }
            return pNode;
        }

        // 如果pNode没有右边节点 , 并且pnode 没有父节点，那么就是null了
        if (pNode.next==null){
            return null;
        }

        // 如果pNode没有右边节点， pNode是父节点的左子树， 那么pNode的父节点就是下一个节点
        if (pNode.next != null && pNode.next.left == pNode){
            return pNode.next;
        }

        // 如果pNode没有右边节点， pNode是父节点的右子树，  那么pNode的下一个节点  是它最先成为左子树的上级节点
        while (pNode.next!=null && pNode.next.right == pNode){
            pNode = pNode.next;
        }
        return pNode.next;

    }


    /**
     * 下面的是简化版
     * @param pNode
     * @return
     */
    public TreeLinkNode GetNextSimpleVerion(TreeLinkNode pNode) {

        //如果 pNode有右节点，那么就是它右节点的最小的左子树
        if (pNode.right!=null){
            pNode = pNode.right;
            while (pNode.left!=null){
                pNode=pNode.left;
            }
            return pNode;
        }


        while (pNode.next!=null && pNode.next.right == pNode){
            pNode = pNode.next;
        }
        return pNode.next;
    }
}
