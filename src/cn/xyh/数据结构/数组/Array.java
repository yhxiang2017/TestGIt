package cn.xyh.数据结构.数组;

/**
 * 数据结构 -- 数组
 * 动态数组，可变长度。
 * 特征：可快速定位元素的位置，查找快，修改快。
 */
public class Array<E> {

    private E[] data;

    private int size;

    /**
     * 默认构造函数
     * 默认容量为10
     */
    public Array () {
        this(10);
    }

    /**
     * 指定容量构造函数
     * @param capacity
     */
    public Array(int capacity) {
        data = (E[])new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty () {
        return size == 0;
    }

    /**
     * 向元素末尾添加元素
     * @param e
     */
    public void addLast (E e){

//        if (size >= data.length){
//            resize(data.length * 2);
//        }
//        data[size] = e;
//        size ++;

        addIndex(size, e);
    }

    /**
     * 从第一位开始插入元素
     * @param e
     */
    public void addFirst(E e) {
        addIndex(0, e);
    }

    /**
     * 在指定位置插入元素
     * @param index
     * @param e
     */
    public void addIndex(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("下标非法！");
        }

        if (size + 1 >= data.length){
            resize(data.length * 2);
        }

        for (int i = size; i >= index; i --){
            data[i + 1] = data[i];
        }
        data[index] = e;
        size ++;
    }

    /**
     * 改变容量
     * @param capacity
     */
    private void resize(int capacity) {
            E[] e = (E[]) new Object[capacity];
            for (int i = 0; i < data.length; i ++) {
                e[i] = data[i];
            }
            data = e;
    }

    /**
     * 根据下标查找值
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("下标非法");
        }

        return data[index];
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e){
                return true;
            }
        }
        return false;
    }

    public E get(E e) {
        if (contains(e)){

        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String format = String.format("Array: size = %d; capacity = %d;\n", size, data.length);
        sb.append(format).append("data: [");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i != size - 1)
                sb.append(", ");
        }
        return sb.append("]").toString();
    }
}
