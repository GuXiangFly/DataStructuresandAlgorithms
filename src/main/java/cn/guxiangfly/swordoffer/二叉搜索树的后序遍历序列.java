package cn.guxiangfly.swordoffer;

import com.sun.org.apache.bcel.internal.generic.RET;

/**
 * @author guxiang (guxiang@rd.netease.com)
 * @date 2019/11/4 22:32
 */
public class 二叉搜索树的后序遍历序列 {

    public boolean VerifySquenceOfBST(int [] sequence) {

        if(sequence == null || sequence.length == 0){
            return false;
        }
        if(sequence.length == 1){
            return true;
        }
        return search(sequence,0,sequence.length-1);
    }

    public boolean search(int [] seq , int start, int end ){

        //遍历完数组的一部分，没报错，返回true
        if(start > end ){
            return true;
        }
        int i = end;
        //i从最后往前倒，一直找到第一个比当前根节点小的数，从这个数开始将字符串分为前后两部分
        while(i>start && seq[i-1] > seq[end]){
            i--;
        }
        //前办部门如果有比根节点大的数，返回false
        for(int j=0;j<i-1;j++){
            if(seq[j] > seq[end]){
                return false;
            }
        }
        //遍历数组的前半部分和后半部分
        return  search(seq,start,i-1)&&search(seq,i,end-1);

    }

}
