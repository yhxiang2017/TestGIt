package cn.xyh.数据结构.链表;

public class TestMain {

    public static void main(String[] args) {
        testLinkedList1();
    }

    public static void testLinkedList1(){
        LinkedList1 linkedList1 = new LinkedList1();

        for (int i = 0; i < 10; i++) {
            linkedList1.addLast(i);
        }
        System.out.println();
    }
}
