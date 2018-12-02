package cn.guxiangfly.leetcode;

import java.util.List;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 11/25/18
 * @desc : DataStructuresandAlgorithms
 * <p>
 * 3->4->5
 * 5->4->3
 * <p>
 * 3->4->5
 * h  t
 * 3 -> pre(null)  4->5
 * head            temp
 * <p>
 * pre = head
 * <p>
 * 3
 * pre
 */
public class P_206_Reverse_Linked_List {

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }


    Node reverse(Node head) {
        if (head == null || head.next == null) return head;
        Node pre = null;
        while (head != null) {
            Node temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }


    /**
     * t h p h  踢黄拍黄
     * h p h t
     *
     * @param head
     * @return
     */
    public Node reverse3(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node pre = null;

        while (head != null) {
            Node temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }


















































    /**
     * 试题2刷
     */
    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        while (head!=null || head.next!=null){
            ListNode temp = head.next;
            head.next =pre;
            pre = head;
            head = temp;
        }

        return pre;
    }
}