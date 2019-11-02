package cn.guxiangfly.swordoffer;

/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/11/2 17:38
 */
public class 链表中环的入口结点 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead==null){
            return null;
        }

        boolean flag = false;

        /** 先判断是否成环*/
        ListNode fast =pHead;
        ListNode slow = pHead;

        while (fast!=null && slow!=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
               flag = true;
               break;
            }
        }
        if (!flag){
            return null;
        }else {

            fast = pHead;
            while (fast != slow){
                fast= fast.next;
                slow = slow.next;
            }
            return fast;

        }

    }


}
