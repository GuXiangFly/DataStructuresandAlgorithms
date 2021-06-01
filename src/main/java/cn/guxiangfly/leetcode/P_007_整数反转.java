package cn.guxiangfly.leetcode;

/**
 * @Author guxiang02
 * @Date 2021/1/26
 *
 *  给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * .
 * 思路：  1234 -->  4321
 *  1234 拆解为  1234 = 123 * 10 + 4
 *
 **/
public class P_007_整数反转 {
    public int reverse(int x) {
        double min = Math.pow(-2, 31);
        double max = Math.pow(2, 31) -1;

        boolean single = true;
        if (x<0){
            single = false;
        }

        x = Math.abs(x);

        long result = 0;
        int remainder = 0;



        while (x>0){
            remainder = x % 10;
            x = (x-remainder) /10;
            result = result *10 + remainder;

            if (result > max){
                return 0;
            }
        }

        if (!single){
            return (int) (0-result);
        }

        return (int) result;
    }


    public static void main(String[] args) {
        P_007_整数反转 temp = new P_007_整数反转();

        temp.reverse(-1000);
    }

}
