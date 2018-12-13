package cn.guxiangfly.leetcode;

import java.util.concurrent.Executors;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 10/25/18
 * @desc : JavaHomeWork
 */
public class P_141_Linked_List_Cycle {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        Executors.newCachedThreadPool();
        return false;
    }

    public static void main(String[] args) {

    }
}
