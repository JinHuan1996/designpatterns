package design.singleton;

import java.io.Serializable;

/**
 * 懒汉式单例.
 *
 * @author Mr.Jin
 * @version 111
 */
public class FierceLazyThreadSingleton implements Serializable {

    private FierceLazyThreadSingleton() {
        if (FierceLazy.FIERCE_LAZY_THREAD_SINGLETON != null) {
            throw new RuntimeException("不能创建多个实例");
        }
    }

    /**
     * 此处使用到了内部静态类，保证了此实例绝对是有一个， 内部静态类只有在使用时加载，静态保证了只有一个 依然存在性能问题和反射侵入的问题
     * 
     * @return 懒汉
     */
    public static FierceLazyThreadSingleton getInstance() {
        return FierceLazy.FIERCE_LAZY_THREAD_SINGLETON;
    }

    private static class FierceLazy {
        private static final FierceLazyThreadSingleton FIERCE_LAZY_THREAD_SINGLETON = new FierceLazyThreadSingleton();
    }

    // 解决序列化之后导致创建了多个实例的问题
    private Object readResolve() {
        return FierceLazy.FIERCE_LAZY_THREAD_SINGLETON;
    }
}
