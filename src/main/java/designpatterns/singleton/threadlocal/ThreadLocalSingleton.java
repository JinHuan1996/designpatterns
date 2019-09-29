package designpatterns.singleton.threadlocal;

/**
 * threadLocal构建伪单例.
 *
 * @author Mr.Jin
 * @version 111
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL = ThreadLocal.withInitial(ThreadLocalSingleton::new);

    private ThreadLocalSingleton() {

    }

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL.get();
    }

}
