package cn.guxiangfly.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author guxiang02
 * @Date 2020/8/13
 **/
public class P_078_子集 {


    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> tmpList = new ArrayList<>();
        if (nums.length == 0) {
            result.add(tmpList);
            return result;
        }

        loop(0, tmpList, nums);

        return result;
    }


    public void loop(int i, List<Integer> tmpList, int[] nums) {
        if (i == nums.length) {
            result.add(tmpList);
            return;
        }
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(tmpList);
        list1.add(nums[i]);
        loop(i + 1, list1, nums);

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(tmpList);
        list2.add(nums[i]);
        loop(i + 1, list2, nums);
    }
}
