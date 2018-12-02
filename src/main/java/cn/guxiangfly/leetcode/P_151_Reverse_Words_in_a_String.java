package cn.guxiangfly.leetcode;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/2/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_151_Reverse_Words_in_a_String {

    public static void main(String[] args) {
       String s =  "the sky is blue";
       new P_151_Reverse_Words_in_a_String().reverseWords(s);
    }
    public String reverseWords(String s) {
        String[] strings = s.split("\\s+");

       int left = 0;
       int right = strings.length-1;

       while (left<right){
           String temp = strings[left];
           strings[left] = strings[right];
           strings[right] = temp;

           left ++;
           right--;
       }
       StringBuilder res = new StringBuilder();
        for (String string : strings) {
            res.append(string + " ");
        }
       return res.toString().trim();
    }
}
