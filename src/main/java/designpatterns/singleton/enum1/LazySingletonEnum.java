package designpatterns.singleton.enum1;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 使用枚举创建单例.
 *
 */
public enum LazySingletonEnum {

    INSTANCE;

    private Object data;

    private final Map<String, Object> map = new HashMap<>();

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = getInstance(data.getClass());
    }

    /**
     * 使用枚举实现注册式单例.
     *
     * @author Mr.Jin
     * @param clazz 类
     * @return 返回对象
     */
    private Object getInstance(Class clazz) {
        if (Objects.isNull(clazz)) {
            return null;
        }
        String name = clazz.getName();
        Object o = null;
        synchronized (map) {
            if (map.containsKey(name)) {
                o = map.get(name);
            } else {
                try {
                    Class<?> aClass = Class.forName(name);
                    Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
                    declaredConstructor.setAccessible(true);
                    o = declaredConstructor.newInstance();
                    map.put(name, o);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return o;
    }

}
