package cn.guxiangfly.linkList;

import java.util.List;

/**
 * LinkedListCreator
 *
 * @author guxiang
 * @date 2017/11/17
 */
public class LinkedListCreator {
    public Node createLinkedList(List<Integer> data){
        Node firstNode = new Node(data.get(0));
        return firstNode;
    }
}
