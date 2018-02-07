package cn.guxiangfly.sort;

/**
 * Recursion
 *
 * @author guxiang
 * @date 2018/1/12
 */
public class Recursion {

    public static void main(String[] args) {
        System.out.println(fib2(30));;
    }

    public static long fib1(int n){
        if (n==1||n==2){
            return 1;
        }
        else {
            return fib1(n-1)+fib1(n-2);
        }
    }

    public static long fib2(int n){
        if (n==1||n==2){
            return 1;
        }
        long f1 = 1;
        long f2 =1;
        for (int i = 3; i <=n; i++) {
            f2=f1+f2;
            f1=f2-f1;
        }
        return f2;
    }
}
