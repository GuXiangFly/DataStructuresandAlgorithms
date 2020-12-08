package cn.guxiangfly.meishu;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author guxiang02
 * @Date 2020/7/27
 **/
public class CodeAlibabaSolution2 {



    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        Scanner in = new Scanner(System.in);
        // 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
        n = in.nextInt();
        m = in.nextInt();


        ArrayList<Deque<Integer>> deques = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int firstNum = in.nextInt();
            Deque<Integer> integerArrayDeque = new ArrayDeque<>();
            for (int j = 0; j < firstNum; j++) {
                integerArrayDeque.addFirst(in.nextInt());
            }
            deques.add(integerArrayDeque);
        }

        int resultSum = 0;

        int[] dp = new int[m];



        for (int i = 0; i < m; i++) {
            int max = 0;
            for (Deque<Integer> deque : deques) {
                Integer queueFirst = deque.peekFirst();
                Integer queueLast = deque.peekLast();
                max = Math.max(max, queueFirst);
                max = Math.max(max, queueLast);
            }

            resultSum += max;

            for (Deque<Integer> deque : deques) {
                Integer queueFirst = deque.peekFirst();
                Integer queueLast = deque.peekLast();
                if (max == queueFirst){
                    deque.pollFirst();
                    break;
                }
                if (max == queueLast){
                    deque.pollLast();
                    break;
                }
            }
        }

        System.out.println(resultSum);
    }
}
