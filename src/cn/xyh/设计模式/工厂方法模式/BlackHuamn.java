package cn.xyh.设计模式.工厂方法模式;

/**
 * 黑色人种
 */
public class BlackHuamn implements Human{
    @Override
    public void getColor() {
        System.out.println("黑色人种");
    }

    @Override
    public void talk() {
        System.out.println("黑色人种讲话*Y&*^!@#!");
    }
}
