package cn.guxiangfly.leetcode;

/**
 * @Author guxiang02
 * @Date 2020/12/14
 **/
public class P_024_两两交换链表中的节点 {

    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null && temp.next.next!=null){
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            node1.next = node2.next;
            temp.next = node2;
            node2.next = node1;
            temp = temp.next.next;
        }

        return dummyHead.next;
    }
}
