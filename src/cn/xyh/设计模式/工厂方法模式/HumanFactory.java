package cn.xyh.设计模式.工厂方法模式;

/**
 * 抽象工厂实现类
 */
public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T)human;
    }

//    @Override
//    public Object createHuman(Class c) {
//        Object o = null;
//        try {
//            o = Class.forName(c.getName()).newInstance();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return o;
//    }
}
