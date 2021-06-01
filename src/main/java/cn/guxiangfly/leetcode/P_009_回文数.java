package cn.guxiangfly.leetcode;

/**
 * @Author guxiang02
 * @Date 2021/1/27
 **/
public class P_009_回文数 {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }

        int remainder = 0;

        int initx = x;
        int reverseValue =0 ;
        while (x>0){
            remainder = x %10;
            x = (x - remainder)/10;
            reverseValue = reverseValue * 10 + remainder;

        }

        if (reverseValue == initx){
            return true;
        }

        return  false;
    }

    public static void main(String[] args) {
        boolean reverse = new P_009_回文数().isPalindrome(121);
        System.out.println(reverse);
    }
}
