package cn.xyh.设计模式.工厂方法模式;

/**
 * 黄色人种
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种讲话能听懂：你好！");
    }
}
