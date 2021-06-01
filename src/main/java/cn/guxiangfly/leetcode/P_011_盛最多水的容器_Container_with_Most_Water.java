package cn.guxiangfly.leetcode;

/**
 * @Author guxiang02
 * @Date 2021/5/22
 **/
public class P_011_盛最多水的容器_Container_with_Most_Water {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left =0;
        int right = height.length-1;


        while (true){

            int leftHeight = height[left];
            int rightHeight = height[right];

            int tempMaxArea = (right-left) * Math.min(leftHeight,rightHeight);
            maxArea = Math.max(tempMaxArea,maxArea);

            if (left>=right){
                break;
            }

            if (leftHeight< rightHeight){
                left ++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
}
