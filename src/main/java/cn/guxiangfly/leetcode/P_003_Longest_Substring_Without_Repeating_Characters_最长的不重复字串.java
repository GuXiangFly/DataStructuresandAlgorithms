package cn.guxiangfly.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 11/23/18
 * @desc : DataStructuresandAlgorithms
 */
public class P_003_Longest_Substring_Without_Repeating_Characters_最长的不重复字串 {

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


    public int lengthOfLongestSubstring2(String s) {

        int i = 0;
        int j = 0;
        int maxLength = 0;

        Set<Character> set = new HashSet<>();

        for (i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))){
                j++;
            }else {
                set.add(s.charAt(i));
                maxLength = Math.max(maxLength, set.size());
            }
        }
        return  maxLength;
    }
}
