package cn.guxiangfly.swordoffer;

import java.util.Stack;

/**
 * @Author guxiang02
 * @Date 2020/1/21 16:11
 *
 * 开两个栈
 * stack
 * minStack (表示前n个元素里的最小元素)
 *
 *     stack：[-1,3,-4,-8,5]
 *  stackMin：[-1,-1,-4,-8,-8]
 **/
public class 包含min函数的栈 {

    Stack<Integer> stack =  new Stack<Integer>();
    Stack<Integer> stackMin =  new Stack<Integer>();

    public void push(int node) {
        stack.push(node);
        if (stackMin.isEmpty()){
            stackMin.push(node);
        }else {
            Integer peek = stackMin.peek();
            int min = Math.min(node, peek);
            stackMin.push(min);
        }
    }

    public void pop() {
        stack.pop();
        stackMin.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
       return stackMin.peek();
    }
}
