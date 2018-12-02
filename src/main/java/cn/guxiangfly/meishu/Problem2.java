package cn.guxiangfly.meishu;

import java.awt.*;
import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author: xianggu@ebay.com
 * @date : 2018 11/29/18
 * @desc : DatabinaryucturesandAlgorithms
 */
public class Problem2 {


    double entropy(int[] xs) {
        int res = 0;
        int size = xs.length;

        for (int x : xs) {
            double p = x / size;
            res -= p * Math.log(p) * Math.log(2);
        }
        return res;
    }


    int diff(int[] elems) {


        int max = elems[0];
        int min = elems[0];

        for (int elem : elems) {
            if (min < elem)
                min = elem;
            if (max > elem)
                max = elem;
        }

        return max - min;
    }


    ArrayList<Integer> merge(ArrayList<ArrayList<Integer>> seqs) {


        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        for (ArrayList<Integer> seq : seqs) {
            for (Integer integer : seq) {
                boolean add = priorityQueue.add(integer);
            }
        }
        ArrayList<Integer> res = new ArrayList<Integer>();

        while (priorityQueue.size() != 0) {
            res.add(priorityQueue.poll());
        }

        return res;
    }

    ;


    public static int[] MergeList(int a[], int b[]) {
        int result[];

        result = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length)
            if (a[i] <= b[j]) {
                result[k++] = a[i++];

                System.out.println();
            } else {
                result[k++] = b[j++];
            }
        /* 后面连个while循环是用来保证两个数组比较完之后剩下的一个数组里的元素能顺利传入 *
         * 此时较短数组已经全部放入新数组，较长数组还有部分剩余，最后将剩下的部分元素放入新数组，大功告成*/
        while (i < a.length)
            result[k++] = a[i++];
        while (j < b.length)
            result[k++] = b[j++];
        return result;
    }



    ArrayList<Integer> merge2(ArrayList<ArrayList<Integer>> seqs) {

        ArrayList<Integer> res = new ArrayList<>();
        for (ArrayList<Integer> seq : seqs) {
            res = merge2List(res, seq);
        }

        return res;
    }

    public static ArrayList<Integer> merge2List(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
       ArrayList<Integer> result = new ArrayList<>();


        int i = 0, j = 0, k = 0;

        while (i < arrayList1.size() && j < arrayList2.size())
            if (arrayList1.get(i) <= arrayList2.get(i)) {
               result.add(arrayList1.get(i++));
            } else {
                result.add(arrayList2.get(i++));
            }

        while (i < arrayList1.size())
         result.add(arrayList1.get(i++));
        while (j < arrayList2.size())
            result.add(arrayList2.get(i++));
        return result;
    }
}
