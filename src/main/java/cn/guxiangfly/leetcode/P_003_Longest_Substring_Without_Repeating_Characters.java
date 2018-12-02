package cn.guxiangfly.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 11/23/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_003_Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s) {
        if (s==null|| s.length()==0) return 0;
        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();

        int res = 0;
        for (int i = 0,j=0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))){
                j= Math.max(j,hashMap.get(s.charAt(i))+1);
            }
            hashMap.put(s.charAt(i),i);
            Math.max(res,i-j+1);
        }

        return  res;
    }
}
