package designpatterns.singleton.lazy;

import java.util.Objects;

/**
 *
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;

    private LazyDoubleCheckSingleton() {}

    // synchronized 在性能上面有问题，虽然已经作用到了方法里面，以及JDK1.6
    // 对于synchronized作了优化对于性能方面还是拖了后腿
    public static LazyDoubleCheckSingleton getInstance() {
        if (Objects.isNull(lazyDoubleCheckSingleton)) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (Objects.isNull(lazyDoubleCheckSingleton)) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
