package designpatterns.singleton.hungry;

/**
 * 饿汉式单例.
 *
 * @author Mr.Jin
 * @version 111
 */
public class HungrySingleton {

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {}

    // 1. 构造器私有
    // 2. 公共访问点
    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
