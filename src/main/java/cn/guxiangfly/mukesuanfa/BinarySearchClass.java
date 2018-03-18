package cn.guxiangfly.mukesuanfa;

/**
 * BinarySearchClass
 * 假设是这个数组[1,2,3,4,5,6,7,8,9]
 * @author guxiang
 * @date 2018/3/17
 */
public class BinarySearchClass {

    int binarySearch(int[] arr , int n ,int target){

        int l  =0, r = n-1;
        while (l<=r){
            //int mid = (l+r)/2;
            int mid = l+(r-l)/2;  // 这个是防止int溢出
            //target 是5  mid也是5 就返回为5
            if (arr[mid]== target){
                return mid;
            }

            if (target<arr[mid]){
                //target < mid  就是 [1....4]中找 [l....mid-1]
                r = mid-1;
            }else {
                //target > mid  就是 [6---9]中找 [mid+1..r]
                l = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
