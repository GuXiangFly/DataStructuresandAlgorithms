package cn.guxiangfly.swordoffer;

/**
 * 思路1  链表反转
 * 思路2. 先遍历获取链表长度，  然后从尾到头部打印链表
 */
public class OFFER_006_从尾到头打印链表 {
    public int[] reversePrint(ListNode head) {
        //先获取链表长度，创建对应长度数组
        ListNode currNode = head;
        int len = 0;
        while(currNode != null){
            len ++;
            currNode = currNode.next;
        }
        int[] result = new int[len];

        //再次遍历链表，将值倒序填充至结果数组
        currNode = head;
        while(currNode != null){
            result[len - 1] = currNode.val;
            len --;
            currNode = currNode.next;
        }
        return result;
    }

}
