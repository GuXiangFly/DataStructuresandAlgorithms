package cn.guxiangfly.swordoffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/11/1 0:50
 */
public class 字符串括号匹配 {
    private static final Map<Character, Character> brackets = new HashMap<>();

    static {
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
    }

    public static boolean isMatch(String str) {
        if (str == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (brackets.containsKey(ch)) {
                stack.push(ch);
            } else if (brackets.containsKey(ch)) {
                if (stack.isEmpty() || !stack.pop().equals( brackets.get(ch))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
