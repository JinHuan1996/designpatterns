package design.singleton;

/**
 * 懒汉式单例.
 *
 * @author Mr.Jin
 * @version 111
 */
public class LazySingleton {

    private static LazySingleton LAZY_SINGLETON = null;

    private LazySingleton() {}

    /**
     * 此处会有线程安全的问题，多个线程同时判断了该对象为空就会创建多个实例，就不是单例了
     * @return 懒汉
     */
    public static LazySingleton getInstance() {
        if (null == LAZY_SINGLETON) {
            LAZY_SINGLETON = new LazySingleton();
        }
        return LAZY_SINGLETON;
    }
}
