package cn.guxiangfly.meishu;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 11/29/18
 * @desc : DatabinaryucturesandAlgorithms
 */
public class Problem1 {

    public static  int  binary_to_integer(String binary) {
        if (binary == null || binary.length() == 0) return 0;
        binary = binary.trim();
        char firstChar = binary.charAt(0);
        int sign = 1;
        int start = 0;
        long res = 0;
        if (firstChar == '+') {
            sign = 1;
            start++;
        } else if (firstChar == '-') {
            sign = -1;
            start++;
        }
        for (int i = start; i < binary.length(); i++) {
            if (!Character.isDigit(binary.charAt(i))) {
                return (int) res * sign;
            }
            res = res * 2 + binary.charAt(i) - '0';
            if (sign == 1 && res > Integer.MAX_VALUE) return  Integer.MAX_VALUE;
            if (sign == -1 && res > Integer.MAX_VALUE) return Integer.MIN_VALUE;
        }
        return (int) res * sign;
    }

    public static void main(String[] args) {
        String binary = "11111";
       System.out.println( binary_to_integer(binary));



    }

}
