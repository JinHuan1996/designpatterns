package designpatterns.singleton.hungry;

/**
 * 饿汉式单例.
 *
 * @author Mr.Jin
 * @version 111
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton HUNGRY_SINGLETON;

    // 可以直接在静态块里面初始化
    static {
        HUNGRY_SINGLETON = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    // 1. 构造器私有
    // 2. 公共访问点
    public static HungryStaticSingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
