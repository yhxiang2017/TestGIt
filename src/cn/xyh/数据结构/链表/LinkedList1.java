package cn.xyh.数据结构.链表;

/**
 * 数据结构 -- 单向链表
 * 链表特性：方便更新、删除；长度自由
 */
public class LinkedList1<E> {

    /**
     * 私有内部类
     * @param <E>
     */
    private class Node<E> {
        Node next;
        E val;

        public Node(Node next, E val){
            this.next = next;
            this.val = val;
        }
    }

    private int size;

    private Node<E> head;

    public LinkedList1(){
        head = null;
    }

    /**
     * 从链表头部开始添加
     * @param e
     */
    public void addFirst(E e) {
//        Node<E> node = new Node(null, e);
//        node.next = head;
//        head = node;

        head = new Node(head, e);
        size ++;
    }

    /**
     * 指定位置添加元素
     * @param index
     * @param e
     */
    public void addIndex(int index, E e) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("下标非法！");
        }

        if (index == 0) {
            addFirst(e);
        }else{
            Node cur = head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            cur.next = new Node(cur.next, e);
            size ++;
        }
    }

    /**
     * 从末尾添加
     * @param e
     */
    public void addLast(E e) {
        addIndex(size, e);
    }
}
