package cn.xyh.数据结构.栈;

public class TestMain {

    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println(stack);
        stack.push(12);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
