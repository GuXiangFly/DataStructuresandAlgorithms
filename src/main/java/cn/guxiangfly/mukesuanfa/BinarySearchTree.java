package cn.guxiangfly.mukesuanfa;

import com.sun.org.apache.regexp.internal.RE;
import jdk.nashorn.internal.ir.IfNode;

import java.security.Key;

/**
 * BinarySearchTree
 *
 * @author guxiang
 * @date 2018/3/17
 */
public class BinarySearchTree<V> {
    class Node {
        int key;
        V value;
        Node left;
        Node right;

        public Node(int key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    Node root;
    int count;

    public BinarySearchTree() {
        this.root = null;
        this.count = 0;
    }

    public BinarySearchTree(Node root, int count) {
        this.root = root;
        this.count = count;
    }

    public int size() {
        return count;
    }

    /**
     * 向以node为根的二叉搜索树中插入节点（key，value）
     * 返回插入新节点后的二叉搜索树的根
     *
     * @param node
     * @param key
     * @param value
     * @return
     */
    Node insert(Node node, int key, V value) {

        if (node == null) {
            count++;
            return new Node(key, value);
        }
        //相等就覆盖
        if (key == node.key) {
            node.value = value;
        } else if (key < node.key) {
            node.left = insert(node.left, key, value);
        } else if (key > node.key) { //向右子树里面插入
            node.right = insert(node.right, key, value);
        }

        return node;
    }

    boolean contain(int key){

        return contain(root,key);
    }

    /**
     * 查找以node为根的节点是否包含节点为key的节点
     * @param node
     * @param key
     * @return
     */
    private boolean contain(Node node, int key) {
        if (node == null){
            return false;
        }
        if (node.key == key){
            return true;
        }else if (key<node.key){
            return contain(node.left,key);
        }else {// (key>node.key)
            return contain(node.right,key);
        }
    }

    private V search(int key){
        return search(root,key);
    }

    private V search(Node node, int key) {
        if (node == null){
            return null;
        }
        if (key == node.key){
            return node.value;
        }
        else if (key<node.key){
            return search(node.left,key);
        }else {//key>node.key
            return search(node.right,key);
        }
    }

    /**
     * 查找key最小的节点
     */
    int minimum(){
        Node minimum = minimum(root);
        return minimum.key;
    }

    private Node minimum(Node node) {
        if (node.left!=null){
            return minimum(node.left);
        }
        return node;
    }

    /**
     * 查找key最大的节点
     */
    int maxmum(){
        Node maxmum = maxmum(root);
        return maxmum.key;
    }

    private Node maxmum(Node node) {
        if (node.left!=null){
            return maxmum(node.left);
        }
        return node;
    }
}
