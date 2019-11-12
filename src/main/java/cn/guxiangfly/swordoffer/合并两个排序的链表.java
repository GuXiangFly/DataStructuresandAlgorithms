package cn.guxiangfly.swordoffer;

import org.w3c.dom.NodeList;

/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/10/31 20:11
 */
public class 合并两个排序的链表 {

    public ListNode Merge(ListNode list1,ListNode list2) {


        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(list1 !=null && list2 !=null){
            if (list1.val <= list2.val){
                ListNode listNode = new ListNode(list1.val);
                cur.next = listNode;
                list1 = list1.next;
                cur = cur.next;
            }else{
                ListNode  listNode = new ListNode(list2.val);
                cur.next = listNode;
                list2 = list2.next;
                cur = cur.next;
            }
        }

        while (list1 != null ){
            ListNode listNode = new ListNode(list1.val);
            cur.next = listNode;
            list1 = list1.next;
            cur = cur.next;
        }

        while (list2 != null){
            ListNode  listNode = new ListNode(list2.val);
            cur.next = listNode;
            list2 = list2.next;
            cur = cur.next;
        }

        return dummy.next;
    }
}