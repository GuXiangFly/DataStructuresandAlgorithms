package cn.guxiangfly.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 11/22/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_001_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }

        int[] res = new int[]{-1, -1};
        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(target - nums[i])) {
                res[0] = hashmap.get(target-nums[i]);
                res[1] =i;
                break;
            }
            hashmap.put(nums[i], i);
        }

        return res;
    }
}
