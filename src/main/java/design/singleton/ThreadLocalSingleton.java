package design.singleton;

/**
 * 使用ThreadLocal创建单例.
 *
 * @author Mr.Jin
 * @version 111
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {}

    /**
     * 使用ThreadLocal创建单例 ThreadLocal天生就是线程安全的，能保证在单线程中这个实例时单例的
     * @return ThreadLocalSingleton实例
     */
    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL.get();
    }
}
