package cn.guxiangfly.leetcode;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/2/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_008_String_to_Integer {

    public int myAtoi(String str) {
        if (str==null) return 0;
        str = str.trim();
        if (str.length() == 0) return 0;
        char[] arr = str.toCharArray();
        int firstchar =arr[0];
        int sign =1;
        int start = 0;
        long res = 0;


        if (firstchar=='-'){
            sign=-1;
            start++;
        }if (firstchar =='+'){
            sign=1;
            start++;
        }
        for (int i = start; i < arr.length; i++) {
            if (!Character.isDigit(arr[i])){
                return  (int) res*sign;
            }

            int a = arr[i] - '0';
            res =res*10 + a;

            if (sign == 1 &&res>Integer.MAX_VALUE){
              return Integer.MAX_VALUE;
            }
            if (sign == -1 &&res>Integer.MAX_VALUE){
                return Integer.MIN_VALUE;
            }
        }

        return (int) res * sign;
    }
}
