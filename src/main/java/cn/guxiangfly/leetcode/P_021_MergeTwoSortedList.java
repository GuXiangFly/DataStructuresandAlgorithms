package cn.guxiangfly.leetcode;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 10/24/18
 * @desc : JavaHomeWork
 */


public class P_021_MergeTwoSortedList {


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ListNode listNode = new ListNode(l1.val);
                cur.next = listNode;
                l1 = l1.next;
                cur = cur.next;
            } else {
                ListNode listNode = new ListNode(l2.val);
                cur.next = listNode;
                l2 = l2.next;
                cur = cur.next;
            }
        }

        while (l1 != null) {
            ListNode listNode = new ListNode(l1.val);
            cur.next = listNode;
            l1 = l1.next;
            cur = cur.next;
        }
        while (l2 != null) {
            ListNode listNode = new ListNode(l2.val);
            cur.next = listNode;
            l2 = l2.next;
            cur = cur.next;
        }

        return dummy.next;
    }


    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;


        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                ListNode newNode = new ListNode(l1.val);
                cur.next = newNode;
                cur = cur.next;
                l1 = l1.next;
            }else {
                ListNode newNode = new ListNode(l2.val);
                cur.next = newNode;
                cur = cur.next;
                l2 = l2.next;
            }
        }

        while (l1 == null){
            ListNode newNode = new ListNode(l1.val);
            cur.next = newNode;
            cur = cur.next;
            l1 = l1.next;
        }

        while (l2 == null){
            ListNode newNode = new ListNode(l2.val);
            cur.next = newNode;
            cur = cur.next;
            l2 = l2.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
