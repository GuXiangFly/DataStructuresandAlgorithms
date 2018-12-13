package cn.guxiangfly.swordoffer;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/2/18
 * @desc : DataStructuresandAlgorithms
 */
public class 链表中倒数第k个结点 {
    public ListNode FindKthToTail(ListNode head,int k) {


        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {

            if (fast == null)
                return null;
            fast = fast.next;
        }
        while (fast != null){
            slow= slow.next;
            fast= fast.next;
        }

        return slow;
    }
}
