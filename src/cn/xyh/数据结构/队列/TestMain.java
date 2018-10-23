package cn.xyh.数据结构.队列;

public class TestMain {

    public static void main(String[] args) {
        Queue queue = new ArrayQueue();
        for (int i = 0; i < 15; i++) {
            queue.enqueue(i);
        }

        System.out.println(queue);
        queue.enqueue(12);
        System.out.println(queue);

        queue.dequeue();
        System.out.println(queue);

    }
}
