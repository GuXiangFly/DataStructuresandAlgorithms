package cn.guxiangfly.leetcode;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/1/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_344_Reverse_String {

    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int start = 0 ,end = s.length()-1;
        while (start<=end){
            char temp = chars[start];
             chars[start] = chars[end];
             chars[end] = temp;
             start++;
             end--;
        }

        return new String(chars);
    }
}
