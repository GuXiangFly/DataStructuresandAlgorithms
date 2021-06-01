package cn.guxiangfly.leetcode;

/**
 * @Author guxiang02
 * @Date 2021/1/26
 **/
public class P_005_最长回文子串 {

    String inputStr = "";
    int maxLength = 1;

    // 这个start 主要为了最后来截取字符串
    int start = 0;

    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }


        inputStr = s;

        for (int i = 0; i < s.length(); i++) {
            expandAroundCenter(i,i);
            expandAroundCenter(i,i+1);
        }

        return s.substring(start,start+maxLength);

    }


    public void expandAroundCenter(int left, int right) {
        while (left >= 0 && right < inputStr.length() && inputStr.charAt(left) == inputStr.charAt(right)) {
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
            left--;
            right++;
        }
    }
}
