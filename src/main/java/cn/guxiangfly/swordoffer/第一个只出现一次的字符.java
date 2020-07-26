package cn.guxiangfly.swordoffer;

/**
 * @Author guxiang02
 * @Date 2020/7/25
 **/
public class 第一个只出现一次的字符 {

    public char firstUniqChar(String s) {
        if ("".equals(s)){
            return ' ';
        }
        char[] chars = s.toCharArray();
        int[] tempCount = new int[256];
        for (char aChar : chars) {
            if (tempCount[aChar] == 0){
                tempCount[aChar] =1;
            }else {
                tempCount[aChar] = tempCount[aChar] + 1;
            }
        }

        for (char aChar : chars) {
            if (tempCount[aChar] == 1) {
                return aChar;
            }
        }

        return ' ';
    }
}
