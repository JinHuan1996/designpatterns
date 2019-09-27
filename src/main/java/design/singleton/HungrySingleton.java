package design.singleton;

/**
 * 饿汉式单例.
 *
 * @author Mr.Jin
 * @version 111
 */
public class HungrySingleton {

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {}

    public HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
