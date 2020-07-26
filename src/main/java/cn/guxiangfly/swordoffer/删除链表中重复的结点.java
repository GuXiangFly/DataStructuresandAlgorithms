package cn.guxiangfly.swordoffer;

/**
 * @Author guxiang02
 * @Date 2020/1/21 17:41
 * 在一个排序的链表中，存在重复的结点，
 * 请删除该链表中重复的结点，重复的结点不保留，
 * 返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * <p>
 * <p>
 * 在可能删除头结点的情况中 我们都会定义一个虚拟头结点
 *
 *
 * 思路： 排序的链表代表重复元素在一起
 **/
public class 删除链表中重复的结点 {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode dummy = new ListNode(-1);
        dummy.next = pHead;

        ListNode p = dummy;
        while (p.next != null) {
            ListNode q = p.next;
            while (q != null && p.next.val == q.val) {
                q = q.next;
            }
            if (p.next.next == q) {
                p = p.next;
            }else {
                p.next = q;
            }
        }
        return dummy.next;
    }
}
