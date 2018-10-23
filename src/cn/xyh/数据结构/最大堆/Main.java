package cn.xyh.数据结构.最大堆;

import cn.xyh.数据结构.最大堆.MaxHeap;

public class Main {

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();

        int[] nums = {78, 60, 49, 38, 42, 43, 48, 20, 19, 41};
        for (int i = 0; i < nums.length; i ++) {
            maxHeap.add(nums[i]);
        }

        maxHeap.add(63);

        System.out.println();
    }
}
