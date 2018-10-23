package cn.xyh.数据结构.栈;

import cn.xyh.数据结构.数组.Array;

/**
 * 数据结构 -- 栈
 * 栈的特性是先进后出（First In Last Out）
 */
public class Stack<E> {

    /**
     * 采用动态数组来实现栈
     */
    private Array<E> data;

    public Stack() {
        data = new Array();
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * 入栈
     * @param e
     */
    public void push(E e) {
        data.addLast(e);
    }

    /**
     * 看一下栈顶元素
     * @return
     */
    public E peek () {
        return data.get(data.size() - 1);
    }

    /**
     * 出栈
     * @return
     */
    public E pop(){
        E e = peek();
        data.remove(data.size() - 1);
        return e;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String format = String.format("Stack: size=%d\n", data.size());
        sb.append(format).append("[");
        for (int i = 0; i < size(); i++) {
            sb.append(data.get(i));
            if (i != size() - 1)
                sb.append(", ");
        }
        return sb.append("]").toString();
    }
}
