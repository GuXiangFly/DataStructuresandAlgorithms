package cn.guxiangfly.swordoffer;

/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/11/17 17:17
 */
public class 替换空格 {
    public String replaceSpace(StringBuffer str) {
        StringBuffer resultbuf = new StringBuffer();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' '){
                resultbuf.append("%20");
            }else {
                resultbuf.append(str.charAt(i));
            }
        }
        return resultbuf.toString();
    }
}
