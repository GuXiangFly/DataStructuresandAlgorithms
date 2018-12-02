package cn.guxiangfly.leetcode;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/1/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_002_Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int sum = 0;
        ListNode p1 = l1, p2 = l2;
        while (p1 != null || p2 != null) {
            if (p1 != null) {
                sum += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                sum += p2.val;
                p2 = p2.next;
            }
            cur.next= new ListNode(sum%10);
            sum /=10; //进位

            cur = cur.next;
        }
        if (sum==1){
            cur.next = new ListNode(sum);
        }

        return dummy.next;
    }
}
