package cn.guxiangfly.swordoffer;

import java.util.ArrayList;

/**
 * @Author guxiang02
 * @Date 2020/1/20 17:26
 **/
public class 从尾到头打印链表 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if (listNode==null){
            return res;
        }
        if (listNode.next==null){
            res.add(listNode.val);
            return res;
        }

        ListNode head = listNode;
        ListNode pre = null;
        while (head!=null){
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }

        while (pre!=null){
            res.add(pre.val);
            pre = pre.next;
        }

        return res;
    }
}
