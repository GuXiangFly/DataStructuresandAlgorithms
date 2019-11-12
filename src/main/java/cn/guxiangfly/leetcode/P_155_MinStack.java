package cn.guxiangfly.leetcode;

import java.util.Stack;

public class P_155_MinStack {

    /** initialize your data structure here. */
    /**
     * 155. Min Stack
     * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
     * push(x) -- Push element x onto stack.
     * pop() -- Removes the element on top of the stack.
     * top() -- Get the top element.
     * getMin() -- Retrieve the minimum element in the stack.
     * Example:
     * MinStack minStack = new MinStack();
     * minStack.push(-2);
     * minStack.push(0);
     * minStack.push(-3);
     * minStack.getMin();   --> Returns -3.
     * minStack.pop();
     * minStack.top();      --> Returns 0.
     * minStack.getMin();   --> Returns -2.
     * 在-128~127的Integer值并且以Integer x = value;的方式赋值的Integer值在进行==和equals比较时，都会返回true，
     * 因为Java里面对处在在-128~127之间的Integer值，用的是原生数据类型int，会在内存里供重用，
     * 也就是说这之间的Integer值进行==比较时只是进行int原生数据类型的数值比较，而超出-128~127的范围，进行==比较时是进行地址及数值比较
     * time : O(1)
     * space : O(n)
     */

    public static  Stack<Integer> stack;
    public static  Stack<Integer> minStack;

    static {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x){
        stack.push(x);
        if (!minStack.isEmpty()){
            int min = minStack.peek();
            if (x<=min){
                minStack.push(x);
            }
        }else{
            minStack.push(x);
        }
    }

    public void pop(){
        int x = stack.pop();
        if (!minStack.isEmpty()){
            if (x==minStack.peek()){
                minStack.pop();
            }
        }
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }

}
