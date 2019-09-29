package designpatterns.singleton.lazy;

import java.util.Objects;

/**
 * 懒汉式单例.
 *
 * @author Mr.Jin
 * @version 111
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {}

    // 有线程安全问题
    public static LazySingleton getInstance() {
        if (Objects.isNull(lazySingleton)) {
            // 如果多个线程同时都过了这个判断那么就会创建多个实例
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
