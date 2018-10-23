package cn.xyh.数据结构.数组;

public class TestMain {

    public static void main(String[] args) {
        Array a = new Array();
        for (int i = 0; i < 14; i ++) {
            a.addLast(i + 1);
        }

        System.out.println(a.contains(20));
        System.out.println(a.contains(12));

        System.out.println(a);

        a.remove(2);

        System.out.println(a);

    }


}
