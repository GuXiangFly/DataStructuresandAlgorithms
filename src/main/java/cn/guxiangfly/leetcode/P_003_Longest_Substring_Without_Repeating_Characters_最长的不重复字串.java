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





    /**
     * 这个是一个 sliding window 的程序， 滑动窗口
     * 里面维护一个 set,
     * 1. 创建一个set
     * 2.两个指针 i 和 j 指向 string 开头 ,并且记录maxLength
     * 3. 如果set里面没有 s.charAt(i) 的字母，那么就把s.charAt(i)的值放到set中 更新set的 maxlength
     * 4. 如果set里面有 s.charAt(i)的字母，那么就删除最始添加的数据，更新
     * 5.
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s==null || s.length() == 0){
            return 0;
        }

        int i = 0;
        int j = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        for (i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                maxLength = Math.max(maxLength, set.size());
            }else {
                while (set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(s.charAt(i));
                maxLength = Math.max(maxLength, set.size());
            }
        }

        return maxLength;
    }

}
