package cn.guxiangfly.swordoffer;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 11/25/18
 * @desc : DataStructuresandAlgorithms
 * <p>
 * A-> B ->C
 * <p>
 * 翻转 B -C  A C B
 * <p>
 * thnph,hnpht
 * 铁火牛排好，和你跑火炭
 */
public class 反转链表 {

    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;

        if (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

    // th.nph   h.npht
    //纵向读：他和你配合  和你配合他
    //横向读； thn   hnp   ph ht
    //   她和你   很配合  配合  后台

    public ListNode ReverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

}
