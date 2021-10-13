package cn.guxiangfly.swordoffer;

import java.util.Stack;


/**
 * @Author guxiang02
 * @Date 2020/1/14 14:38
 **/
public class OFFER_009_用两个栈实现队列 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.size()!=0){
            return stack2.pop();
        }
        while (stack1.size() != 0) {
            Integer pop = stack1.pop();
            stack2.push(pop);
        }

        Integer first = stack2.pop();
        return first;
    }
}
