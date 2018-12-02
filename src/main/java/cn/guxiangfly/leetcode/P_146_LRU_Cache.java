package cn.guxiangfly.leetcode;

import cn.guxiangfly.linkList.Node;

import java.util.HashMap;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 11/20/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_146_LRU_Cache {
    private HashMap<Integer,DoubleNode> map;
    private Integer  capacity;
    private DoubleNode head;
    private DoubleNode tail;

    public P_146_LRU_Cache(int capacity){
        map= new HashMap<Integer, DoubleNode>();
        this.capacity = capacity;
        this.head= null;
        this.tail = null;
    }

    public void put(int key, int value){
        DoubleNode doubleNode = map.get(key);
        if (doubleNode!=null){

        }else {
            DoubleNode newNode = new DoubleNode(key, value);
            if (capacity==0){
                DoubleNode temp = head;
                head = head.next;  //Linkedlist delete
                map.remove(temp.key);
                capacity++;
            }
            if (head == null && tail == null){
                head = newNode;
            }else {

            }
        }
    }
}
