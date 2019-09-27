package design.singleton;

/**
 * 饿汉式单例.
 *
 * @author Mr.Jin
 * @version 111
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton HUNGRY_SINGLETON;

    static {
        HUNGRY_SINGLETON = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {}

    public static HungryStaticSingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
