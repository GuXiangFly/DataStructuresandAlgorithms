package cn.guxiangfly.swordoffer;

import java.util.Stack;


/**
 * @Author guxiang02
 * @Date 2020/1/14 14:38
 **/
public class OFFER_009_用两个栈实现队列2 {


    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public OFFER_009_用两个栈实现队列2() {

    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }


        }

        if(stack2.isEmpty()){
            return -1;
        }
        Integer pop = stack2.pop();
        return pop;
    }
}
