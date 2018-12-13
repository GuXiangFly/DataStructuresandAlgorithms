package cn.guxiangfly.swordoffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/4/18
 * @desc : DataStructuresandAlgorithms
 */
public class 最小的K个数 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int length = input.length;
        if (length < k || k == 0) {
            return result;
        }

        //change to max heap
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i : input) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(i);
            } else {
                if (priorityQueue.peek() > i) {
                    priorityQueue.poll();
                    priorityQueue.offer(i);
                }
            }
        }
        for (Integer integer : priorityQueue) {
            result.add(integer);
        }

        return result;
    }
}
