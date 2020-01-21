package cn.guxiangfly.swordoffer;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 11/25/18
 * @desc : DataStructuresandAlgorithms
 * <p>
 * A-> B ->C
 * <p>
 * 翻转 B -C  A C B
 *
 * thnph,hnpht
 * 铁火牛排好，和你跑火炭
 */
public class 反转链表 {

    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;

        if (head!=null){
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
}
