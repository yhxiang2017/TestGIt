package cn.xyh.数据结构.最大堆;

import java.util.ArrayList;

/**
 * 数据结构 -- 最大堆
 * 最大堆就是一颗满的二叉树，它解决了在二叉树会退化为链表的可能。
 * 特性：每一个节点的的孩子节点都小于父节点。
 */
public class MaxHeap<E extends Comparable<E>> {

    private ArrayList<E> data;

    public MaxHeap() {
        data = new ArrayList();
    }

    public MaxHeap(int capacity) {
        data = new ArrayList(capacity);
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * 计算父节点的下标
     * @param index
     * @return
     */
    public int parent(int index){
        return (index - 1) / 2;
    }

    /**
     * 计算左孩子的下标
     * @param index
     * @return
     */
    public int leftChild(int index) {
        return (index * 2) + 1;
    }

    /**
     * 计算右孩子的下标
     * @param index
     * @return
     */
    public int rightChild(int index) {
        return (index * 2) + 2;
    }

    /**
     * 向最大堆中添加元素
     */
    public void add (E e) {
        data.add(e);
        siftUp(data.size() - 1);
    }

    /**
     * 获取最大元素
     * @return
     */
    public E getMax() {
        if (data.size() == 0) {
            throw new IllegalArgumentException("Empty heap error！");
        }
        return data.get(0);
    }

    /**
     * 提取最大值
     * @return
     */
    public E extractMax(){
        E ret = getMax();
        //1.将最后一位元素和第一位元素换位置
        swap(0, data.size() - 1);
        //2.删除最后一位
        data.remove(data.size() - 1);
        //3.做下沉操作
        siftDown(0);
        return ret;
    }

    /**
     * 下沉操作
     * 当提出最大元素时，需要下沉操作，好满足最大堆的特性
     * @param k
     */
    public void siftDown(int k) {

    }

    /**
     * 上浮操作
     * 当新插入的元素和比父节点小时，就交换位置
     * @param k
     */
    private void siftUp(int k){

        //如果父节点值小于当前节点值，就交换位置
        while (k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0) {
            swap(k, parent(k));
            k = parent(k);
        }
    }

    /**
     * 交换两个索引的位置
     * @param z
     * @param j
     */
    private void swap(int z, int j) {
        E vz = data.get(z);
        E vj = data.get(j);

        data.set(z, vj);
        data.set(j, vz);
    }
}
