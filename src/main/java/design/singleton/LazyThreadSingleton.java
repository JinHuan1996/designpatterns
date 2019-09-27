package design.singleton;

/**
 * 懒汉式单例(dubbo check).
 *
 * @author Mr.Jin
 * @version 111
 */
public class LazyThreadSingleton {

    private static LazyThreadSingleton LAZY_SINGLETON = null;

    private LazyThreadSingleton() {
    }

    /**
     * 此处使用到了双重锁，保证了此实例绝对是有一个，synchronized存在很大的性能问题，
     * 虽然在jdk1.6已经做了优化，并且没有作用到方法上，依然存在性能问题和反射侵入的问题
     * @return 懒汉
     */
    public static LazyThreadSingleton getInstance() {
        if (null == LAZY_SINGLETON) {
            synchronized (LazyThreadSingleton.class) {
                if (null == LAZY_SINGLETON) {
                    LAZY_SINGLETON = new LazyThreadSingleton();
                }
            }
        }
        return LAZY_SINGLETON;
    }
}
