package cn.guxiangfly.leetcode;

import org.w3c.dom.NodeList;

import java.util.List;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/1/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_002_Add_Two_Numbers_两数相加 {
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
            cur.next = new ListNode(sum % 10);
            sum /= 10; //进位

            cur = cur.next;
        }
        if (sum == 1) {
            cur.next = new ListNode(sum);
        }

        return dummy.next;
    }


    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            int nodeVal = 0;

            if (sum>=10){
                carry = 1;
                nodeVal = sum-10;
            }

            curr.next = new ListNode(sum % 10);
        }

        if (carry > 0){
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }


    public ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode  curr = dummy;
        int jinwei = 0;
        while (l1!=null && l2 !=null){
            int tmp = l1.val + l2.val + jinwei;
            if (tmp>= 10){
                jinwei = 1;
                tmp = tmp-10;
            }else {
                jinwei = 0;
            }
            ListNode node = new ListNode(tmp);
            curr.next = node;
            l1 = l1.next;
            l2 = l2.next;
            curr = curr.next;
        }

        while (l1 != null){
            int tmp = l1.val + jinwei;
            if (tmp>= 10){
                jinwei = 1;
                tmp = tmp-10;
            }else {
                jinwei = 0;
            }
            ListNode node = new ListNode(tmp);
            curr.next = node;
            l1 = l1.next;
            curr = curr.next;

        }

        while (l2 != null){
            int tmp = l2.val + jinwei;
            if (tmp>= 10){
                jinwei = 1;
                tmp = tmp-10;
            }else {
                jinwei = 0;
            }
            ListNode node = new ListNode(tmp);
            curr.next = node;
            l2 = l2.next;
            curr = curr.next;
        }

        if (jinwei>0){
            ListNode node = new ListNode(jinwei);
            curr.next = node;
            curr = curr.next;
        }

        return dummy.next;
    }



    public ListNode addTwoNumbers4(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int jinwei = 0;
        while (l1 != null && l2!=null){
            int total = l1.val + l2.val + jinwei;
            ListNode tempNode = new ListNode(0);
            if (total>=10){
                tempNode = new ListNode(total-10);
                jinwei =1;
            }else {
                tempNode = new ListNode(total);
                jinwei = 0;
            }

            curr.next = tempNode;
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1!=null){
            int total = jinwei + l1.val;
            ListNode tempNode = new ListNode(0);
            if (total>=10){
                tempNode = new ListNode(total-10);
                jinwei =1;
            }else {
                tempNode = new ListNode(total);
                jinwei = 0;
            }

            curr.next= tempNode;
            curr = curr.next;
            l1 = l1.next;
        }

        while (l2 != null){
            int total = jinwei + l2.val;
            ListNode tempNode = new ListNode(0);
            if (total>=10){
                tempNode = new ListNode(total-10);
                jinwei =1;
            }else {
                tempNode = new ListNode(total);
                jinwei = 0;
            }
            curr.next = tempNode;
            curr = curr.next;
            l2 = l2.next;

        }

        if (jinwei != 0){
            curr.next = new ListNode(jinwei);
        }

        return dummy.next;
    }

}
