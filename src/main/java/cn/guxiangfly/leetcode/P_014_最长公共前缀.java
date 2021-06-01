package cn.guxiangfly.leetcode;

/**
 * @Author guxiang02
 * @Date 2021/5/27
 *
 *
 **/

public class P_014_最长公共前缀 {

    /**
     * 纵向扫描法
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";

        Character tempChar = null;
        int charIndex  = 0;
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] chars = str.toCharArray();
            //如果charIndex
            if (charIndex >= chars.length){
                break;
            }



            if (strs.length-1 == i){
                charIndex ++;
            }
        }


        return null;
    }
}
