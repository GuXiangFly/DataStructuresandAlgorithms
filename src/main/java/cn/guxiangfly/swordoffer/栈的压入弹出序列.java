package cn.guxiangfly.swordoffer;

import java.util.Stack;

public class 栈的压入弹出序列 {

    /**
     * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
     * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
     * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（
     * 注意：这两个序列的长度是相等的）
     * <p>
     * 思路：
     * 判断当前栈顶元素是否是下一个要输出的元素：
     * 是： 必然会将当前栈顶元素弹出
     * 否： 必然将下一个元素压入栈中
     * <p>
     * <p>
     * 视频连接：https://www.acwing.com/video/212/
     *
     * @param pushA
     * @param popA
     * @return
     */
    public boolean IsPopOrder(int[] pushA, int[] popA) {

        if (popA.length != pushA.length) {
            return false;
        }

        Stack<Integer> stack = new Stack<Integer>();

        int i = 0;
        for (int val : pushA) {
            stack.push(val);

            while (stack.size()!=0 && stack.peek() == popA[i]){
                stack.pop();
                i++;
            }
        }

        return stack.size()==0;
    }
}
