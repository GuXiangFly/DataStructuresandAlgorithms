package cn.guxiangfly.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author guxiang02
 * @Date 2019/12/23 00:20
 * @url https://leetcode-cn.com/problems/combinations/
 **/
public class P_077_组合_回溯问题 {

    public static List<List<Integer>> res = null;


    public static Integer[] initArr = null;
    public static boolean[] used = null;

    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        initArr = new Integer[n];
        used = new boolean[n];
        for (int i = 0; i < n; i++) {
            initArr[i] = i + 1;
        }

        if (n <= 0 || k <= 0 || k > n) {
            return res;
        }
        if (k == n) {
            List<Integer> integers = Arrays.asList(initArr);
            res.add(integers);
            return res;
        }


        findCombination(initArr,0,new LinkedList<>(),k);
        return res;
    }

    public void findCombination(Integer[] initArr , int index , LinkedList<Integer> subList, int k){
        if (index == k){
            LinkedList<Integer> tempList = (LinkedList<Integer>) subList.clone();
            res.add(tempList);
            return;
        }
        for (int i = index; i < initArr.length; i++) {
            if (used[i] == false){
                subList.addLast(initArr[i]);
                used[i] = true;
                findCombination(initArr,index+1,subList,k);
                subList.removeLast();
                used[i] = false;
            }
        }
    }
}
