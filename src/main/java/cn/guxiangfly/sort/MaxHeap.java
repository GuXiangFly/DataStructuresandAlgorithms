package cn.guxiangfly.sort;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Arrays;
import java.util.Date;

/**
 * MaxHeap
 *
 * @author guxiang
 * @date 2018/3/15
 */
public class MaxHeap {
    private int[] data;
    private int count;
    private int capacity;

    public MaxHeap(int capacity) {
        data = new int[capacity + 1];
        this.capacity = capacity;
    }

    public MaxHeap(int[] arr, int n) {
        data = new int[n + 1];
        for (int i = 0; i < n; i++) {
            data[i + 1] = arr[i];
        }
        count = n;
    }

    int size() {
        return count;
    }

    boolean isEmpty() {
        return count == 0;
    }

    void insert(int i) {

        if (count + 1 > capacity) {
            throw new RuntimeException("容量不够了");
        }

        data[count + 1] = i;
        count++;
        shiftUp(count);
    }

    int extractMax() {
        if (count <= 0) {
            throw new RuntimeException("堆为空");
        }

        int ret = data[1];
        swap(1, count, data);
        data[count] = 0;
        count--;
        shiftDown(1);
        return ret;
    }


    /**
     * 将插入的元素 放上去
     *
     * @param k
     */
    private void shiftUp(int k) {
        while (k > 1 && data[k / 2] < data[k]) {
            swap(k / 2, k, data);
            k /= 2;
        }
    }

    private void shiftDown(int k) {
        while (2 * k <= count) {
            int j = 2 * k;
            if (j + 1 <= count && data[j + 1] > data[j])
                j += 1;

            if (data[k] >= data[j]) {
                break;
            }
            swap(k, j, data);
            k = j;
        }
    }


    private void swap(int datum, int datum1, int[] data) {
        int temp = data[datum];
        data[datum] = data[datum1];
        data[datum1] = temp;
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(100);
        for (int i = 0; i < 50; i++) {
            int n = i;
            maxHeap.insert(n);
        }

        System.out.println(Arrays.toString(maxHeap.data));

        // int i = maxHeap.extractMax();
        // System.out.println(Arrays.toString(maxHeap.data));

        for (int j = 0; j < 50; j++) {
            System.out.println(maxHeap.extractMax());
        }

    }
}
