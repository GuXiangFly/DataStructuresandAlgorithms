package cn.guxiangfly.swordoffer;

/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/11/14 16:10
 */
public class 跳台阶 {
    public int JumpFloor2(int target) {
        if (target<1){
            return 0;
        }
        if (target==1){
            return 1;
        }
        if (target==2){
            return 2;
        }
        int result =0;
        int a =1;
        int b = 2;
        for (int i = 3; i < target+1; i++) {

            result = a+b;
            a = b;
            b=result;
        }
        return result;
    }

    public int JumpFloor(int target) {
        if (target<1){
            return 0;
        }
        if (target==1){
            return 1;
        }
        if (target==2){
            return 2;
        }
        int result = JumpFloor(target-1) +JumpFloor(target-2);
        return result;
    }
}
