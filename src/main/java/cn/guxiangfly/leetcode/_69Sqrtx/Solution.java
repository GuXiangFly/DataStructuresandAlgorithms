package cn.guxiangfly.leetcode._69Sqrtx;

import com.sun.org.apache.regexp.internal.RE;

/**
 *  y = 根号x
 *  y^2 = x
 *
 *  y 无限大，让他接近x
 */
public class Solution {

    public boolean guess(long y, long x){
        if ((long)y*y <= x){
            return true;
        }
        return false;
    }

    public int mySqrt(int x) {
        long L = 0 ;
        long R = (long) x+1;
        long ans = 0;
        while (L< R){
            long mid = L+(R-L)/2;
            if (guess(mid, x)) {
                ans=mid;
                L = mid+1;
            }else{
                R = mid;
            }
        }
        return  (int) ans;
    }
}