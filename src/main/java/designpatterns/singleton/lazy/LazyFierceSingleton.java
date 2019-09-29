package designpatterns.singleton.lazy;

import java.io.Serializable;
import java.util.Objects;

/**
 * 使用静态内部类创建单例.
 *
 * @author Mr.Jin
 * @version 111
 */
public class LazyFierceSingleton implements Serializable {

    private LazyFierceSingleton() {
        if (Objects.nonNull(LazyFierce.LAZY_FIERCE_SINGLETON)) {
            throw new RuntimeException("不能创建多个实例");
        }
    }

    public static LazyFierceSingleton getInstance() {
        return LazyFierce.LAZY_FIERCE_SINGLETON;
    }

    private static final class LazyFierce {
        private static final LazyFierceSingleton LAZY_FIERCE_SINGLETON = new LazyFierceSingleton();
    }

    private Object readResolve() {
        return LazyFierce.LAZY_FIERCE_SINGLETON;
    }

}
