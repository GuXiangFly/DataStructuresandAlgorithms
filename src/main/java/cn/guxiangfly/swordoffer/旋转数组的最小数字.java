package cn.guxiangfly.swordoffer;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * <p>
 * 思路： 通过二分法-- 通过二分法查询到整个区间，第一个比 array[0] 小的数字
 * <p>
 * 视频连接：https://www.acwing.com/video/146/
 * <p>
 * 数组由大到小排列如下
 * /
 * /
 * /
 * --/     /-----
 * /
 * /
 * /
 * /
 *
 * @Author guxiang02
 * @Date 2020/1/21 12:01
 **/
public class 旋转数组的最小数字 {
    public int minNumberInRotateArray(int[] array) {
        int n = array.length - 1;
        if (array.length == 0) {
            return 0;
        }
        while (n > 0 && array[n] == array[0]) {
            n--;
        }
        if (array[0] <= array[n]) {
            return array[0];
        }

        int l = 0;
        int r = n;

        /**
         * 二分思路为 将区间分为 [0,mid] 和 [mid+1,n] 两个区间
         * 如果mid 小于 array[0] 那么最小值在 [0,mid]之间
         * 如果mid 大于 array[0] 那么最小值在 [mid+1,n] 之间
         */
        while (l < r) {
            int mid = (l + r) / 2;
            if (array[mid] < array[0]) {
                r = mid;
            }else {
                l = mid+1;
            }
        }

        return array[l];

    }
}
