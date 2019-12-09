package cn.guxiangfly.leetcode;

import java.util.HashMap;

/**
 * @desc : DataStructuresandAlgorithms
 * @author: xianggu@ebay.com
 * @date : 2018 11/20/18
 */
public class P_146_LRU_Cache {

    public static class DLinkedNode{
        int value;
        DLinkedNode pre;
        DLinkedNode post;

        public DLinkedNode(int value){
            this.value = value;
        }
    }


    private HashMap<Integer,DLinkedNode>  cache= new HashMap<Integer, DLinkedNode>();
    private Integer  capacity =0;
    private DLinkedNode head;
    private DLinkedNode tail;
    private int count =0;


    public P_146_LRU_Cache(int capacity){
        this.capacity = capacity;
        this.head= new DLinkedNode(0);
        this.tail = null;
    }

    public void moveToHead(DLinkedNode node){
        //将节点摘出
        DLinkedNode pre = node.pre;
        DLinkedNode next = node.post;
        pre.post = node.post;
        next.pre = node.pre;


        //将节点加到头结点
        DLinkedNode headNext = head.post;
        head.post = node;
        headNext.pre = node;
        node.post = headNext;
        next.pre = head;
    }


    public void addToHead(DLinkedNode node){
        DLinkedNode next = node.post;

        DLinkedNode headNext = head.post;
        head.post = node;
        headNext.pre = node;
        node.post = headNext;
        next.pre = head;
    }

    public void put(int key, int value){
        DLinkedNode node = cache.get(key);
        if (node==null){
            DLinkedNode newNode = new DLinkedNode(value);
            cache.put(key, newNode);
            addToHead(newNode);
            count++;
            if (count>capacity){
                
            }
        }
    }

    public int get(int key){
        DLinkedNode node = cache.get(key);
        if (node==null){
            return -1;
        }

        moveToHead(node);
        return node.value;
    }

}
