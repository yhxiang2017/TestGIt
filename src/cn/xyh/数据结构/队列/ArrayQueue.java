package cn.xyh.数据结构.队列;

import cn.xyh.数据结构.数组.Array;

/**
 * 数据结构 -- 队列
 *
 * 特性是先进先出（First In First Out）
 */
public class ArrayQueue<E> implements Queue<E> {

    /**
     * 使用动态数组实现队列
     */
    private Array<E> data;

    public ArrayQueue() {
        data = new Array();
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * 入队
     * @param e
     */
    @Override
    public void enqueue(E e) {
        data.addLast(e);
    }

    /**
     * 出队
     * @return
     */
    @Override
    public E dequeue() {
        E ret = getFront();
        data.remove(0);
        return ret;
    }

    /**
     * 查看队头元素
     * @return
     */
    @Override
    public E getFront() {
        if (data.isEmpty()){
            throw new IllegalArgumentException("空队列，无法查看队首元素！");
        }
        E e = data.get(0);
        return e;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String format = String.format("ArrayQueue: size=%d\n", getSize());
        sb.append(format).append("[");
        for (int i = 0; i < getSize(); i++) {
            sb.append(data.get(i));
            if (i != getSize() - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }
}
