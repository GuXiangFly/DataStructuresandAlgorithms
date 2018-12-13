package cn.guxiangfly.leetcode;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/2/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_083_Remove_Duplicates_from_Sorted_List {

    public ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next==null) return head;

        ListNode cur = head;
        while (cur.next!=null){
            if (cur.val == cur.next.val){
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }

        return head;
    }
}
