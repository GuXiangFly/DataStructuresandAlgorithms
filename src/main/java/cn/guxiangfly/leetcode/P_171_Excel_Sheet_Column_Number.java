package cn.guxiangfly.leetcode;

/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/11/12 11:39
 */
public class P_171_Excel_Sheet_Column_Number {
    public int titleToNumber(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = res*26 + (s.charAt(i)-'A' +1);
        }
        return res;
    }

    public static void main(String[] args) {
        P_171_Excel_Sheet_Column_Number p_171_excel_sheet_column_number = new P_171_Excel_Sheet_Column_Number();
        int aaaa = p_171_excel_sheet_column_number.titleToNumber("AAAA");
        System.out.println(aaaa);
    }
}
