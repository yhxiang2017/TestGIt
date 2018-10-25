package cn.xyh.设计模式.工厂方法模式;

/**
 * 抽象的八卦炉 -- 人类工厂
 *
 *          工厂接口            业务接口
 *             |                   |
 *        工厂实现类            业务实现类
 *        方法参数接收
 *        业务的Class，
 *        通过反射创建类
 *        并返回。
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);

//    public abstract Object createHuman(Class c);
}
