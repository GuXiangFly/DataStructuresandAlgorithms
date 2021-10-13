package cn.guxiangfly.swordoffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author guxiang02
 * @Date 2020/1/20 17:37
 **/
public class OFFER_007_重建二叉树 {
    /**
     * 给定：
     * 前序遍历是：[3, 9, 20, 15, 7]
     * 中序遍历是：[9, 3, 15, 20, 7]
     * <p>
     * 返回：[3, 9, 20, null, null, 15, 7, null, null, null, null]
     * 返回的二叉树如下所示：
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * <p>
     * 思路：根据前序遍历的特性，我们知道树的根节点就是前序遍历的第一个  也就是这个demo的3   根据中序遍历：找到3的位置， 发现3左侧只有一个数，9 。 那么代表根节点左子树只有一个 节点9
     * 递归下去， 我们前序遍历通过排除3和9 我们认为20是 右子树的根节点。    中序遍历找到20  左子树是15 右子树是7
     *
     * @param pre
     * @param in
     * @return
     */

    Map<Integer, Integer> inorderMap = new HashMap<Integer, Integer>();

    int[] preOrder = null;
    int[] inOrder = null;

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        preOrder = pre;
        inOrder = in;
        for (int i = 0; i < in.length; i++) {
            inorderMap.put(in[i], i);
        }

        return dfs(0, preOrder.length - 1, 0, inOrder.length - 1);
    }

    public TreeNode dfs(int preOrderLeft, int preOrderRight, int inOrderLeft, int inOrderRight) {
        if (preOrderLeft > preOrderRight) {
            return null;
        }

        TreeNode root = new TreeNode(preOrder[preOrderLeft]);
        int rootInOrderIndex = inorderMap.get(root.val);

        int leftLength = rootInOrderIndex - inOrderLeft;

        TreeNode left = dfs(preOrderLeft + 1, preOrderLeft + leftLength, inOrderLeft, rootInOrderIndex - 1);

        TreeNode right = dfs(preOrderLeft + leftLength + 1, preOrderRight, rootInOrderIndex + 1, inOrderRight);

        root.left = left;
        root.right = right;
        return root;
    }
}
