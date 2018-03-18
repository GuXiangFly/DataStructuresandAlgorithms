package cn.guxiangfly.sort;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * HuiWen
 *
 * @author guxiang
 * @date 2018/3/7
 */
public class HuiWen {

    public static String s = "12454398821";
    public static char[] schar= s.toCharArray();
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(i);
        }

        ArrayList<ArrayList<Integer>> subset = getSubset(list);

        String result="";

        for (ArrayList<Integer> integers : subset) {
            char[] excetchars = excetchars(integers);
            if (ishuiwen(excetchars)){
                if (excetchars.length>result.length()){
                    result=String.valueOf(excetchars);
                }
            }
        }

        System.out.println(result);

    }

    public static char[] excetchars(ArrayList<Integer> integers) {
        char[] subchar = new char[integers.size()];
        int i = 0;
        for (Integer integer : integers) {
            subchar[i] = schar[integer];
            i++;
        }

        return subchar;
    }

    private static boolean ishuiwen(char[] chars) {
        int stringlength = chars.length;
        boolean ishuiwen = true;
        for (int i = 0; i < stringlength / 2; i++) {
            if (chars[i] != chars[stringlength - 1 - i])
                ishuiwen = false;
        }
        return ishuiwen;
    }


    public static ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> L) {
        if (L.size() > 0) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < Math.pow(2, L.size()); i++) {// 集合子集个数=2的该集合长度的乘方
                ArrayList<Integer> subSet = new ArrayList<Integer>();
                int index = i;// 索引从0一直到2的集合长度的乘方-1
                for (int j = 0; j < L.size(); j++) {
                    // 通过逐一位移，判断索引那一位是1，如果是，再添加此项
                    if ((index & 1) == 1) {// 位与运算，判断最后一位是否为1
                        subSet.add(L.get(j));
                    }
                    index >>= 1; // 索引右移一位
                }
                result.add(subSet); // 把子集存储起来
            }
            return result;
        } else {
            return null;
        }
    }

}
