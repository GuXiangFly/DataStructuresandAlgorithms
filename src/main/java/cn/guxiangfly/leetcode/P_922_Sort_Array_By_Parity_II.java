package cn.guxiangfly.leetcode;

public class P_922_Sort_Array_By_Parity_II {
    public int[] sortArrayByParityII(int[] A) {
        int odd = 1;  //奇数
        for (int i = 0; i <A.length; i++) {
            if (i%2 ==0 ){

                if (A[i]%2 == 1){
                    while (A[odd]%2==1){
                        odd+=2;
                    }
                    //swap
                    int temp = A[i];
                    A[i] = A[odd];
                    A[odd] = temp;
                }
            }
        }

        return A;
    }
}

