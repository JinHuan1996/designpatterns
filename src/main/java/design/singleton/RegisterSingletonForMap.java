package design.singleton;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册单例对象生成的就是单例.
 *
 * @author Mr.Jin
 * @version 111
 */
public class RegisterSingletonForMap {

    private static final Map<String, Object> map = new ConcurrentHashMap<>();

    private RegisterSingletonForMap() {
    }

    public static Object getBean(String className) {
        if (Objects.isNull(className)) {
            return null;
        }
        synchronized (map) {
            if (map.containsKey(className)) {
                return map.get(className);
            } else {
                Object o = null;
                try {
                    o = Class.forName(className).newInstance();
                    map.put(className, o);
                }  catch (Exception e) {
                    e.printStackTrace();
                }
                return o;
            }
        }
    }

    public static Object getBean(Class c) {
        if (Objects.isNull(c)) {
            return null;
        }
        return getBean(c.getName());
    }
}
