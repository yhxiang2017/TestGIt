package cn.xyh.设计模式.工厂方法模式;

/**
 * 白色人种
 */
public class WhiteHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("白色人种");
    }

    @Override
    public void talk() {
        System.out.println("白色人种讲话听不懂&*……&*1！@#￥");
    }
}
