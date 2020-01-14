package cn.guxiangfly.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author guxiang02
 * @Date 2019/12/22 12:24
 **/
public class P_017_电话号码的字母组合 {

    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    public static List<String> res = new ArrayList<>();


    public List<String> letterCombinations(String digits) {
        res.clear();
        if (digits == null || digits.length() == 0){
            return res;
        }
        findCombination(digits,0,"");
        return res;
    }

    private void findCombination(String digits, int index, String s){
        if (index == digits.length()){
            res.add(s);
            return;
        }

        char number_key = digits.charAt(index);
        String char_string = phone.get(number_key+"");
        for (char c : char_string.toCharArray()) {
            String tempstr= s+ c;
            findCombination(digits,index+1,tempstr);
        }

    }
}
