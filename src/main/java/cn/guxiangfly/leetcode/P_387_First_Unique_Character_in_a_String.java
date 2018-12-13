package cn.guxiangfly.leetcode;

import java.util.HashMap;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 12/2/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_387_First_Unique_Character_in_a_String {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer>  map  = new HashMap<>();
        char[] arrs = s.toCharArray();
        for (int i = 0; i < arrs.length; i++) {
            map.put(arrs[i],map.getOrDefault(arrs[i] ,0)+1);
        }

        for (int i = 0; i < arrs.length; i++) {
            if (map.get(arrs[i]) == 1)
                return i;
        }

        return -1;
    }
}
