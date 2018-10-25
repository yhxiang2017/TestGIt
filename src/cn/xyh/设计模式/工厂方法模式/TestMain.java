package cn.xyh.设计模式.工厂方法模式;

public class TestMain {


    public static void main(String[] args) {

        Class c = TestMain.class;
        System.out.println(c.getName());
        AbstractHumanFactory BaGuaLu = new HumanFactory();

        //女娲第一次造人，火候不足，早出了白人。
        System.out.println("造的是白人");
        WhiteHuman human = (WhiteHuman) BaGuaLu.createHuman(WhiteHuman.class);
        human.getColor();
        human.talk();

        //女娲第二次造人，火候大了，造的是黑人。
        System.out.println("造的是黑人");
        BlackHuamn human1 = (BlackHuamn) BaGuaLu.createHuman(BlackHuamn.class);
        human1.getColor();
        human1.talk();

        //女娲第三次造人，拿捏了火候，造的是黄种人。
        System.out.println("造的是黄种人");
        YellowHuman human2 = (YellowHuman)BaGuaLu.createHuman(YellowHuman.class);
        human2.getColor();
        human2.talk();

    }
}
