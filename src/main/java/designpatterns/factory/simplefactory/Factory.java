package designpatterns.factory.simplefactory;

import java.util.Objects;

/**
 * 简单工厂.
 *
 * @author Mr.Jin
 * @version 111
 */
public class Factory {

    /**
     * 工厂生产产品方法.
     * 
     * @param className
     * @return
     */
    public Product createProduct(String className) {
        if (Objects.nonNull(className)) {
            try {
                return (Product) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 重载工厂生产产品方法.
     *
     * @param c
     * @return
     */
    public Product createProduct(Class c) {
        if (Objects.nonNull(c)) {
            return createProduct(c.getName());
        }
        return null;
    }

}
