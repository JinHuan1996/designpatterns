package design.factory;

/**
 * 雪糕创建工厂.
 *
 * @author Mr.Jin
 * @version 1.0 V 2019-07-11
 */
public class IceCreamFactory implements Factory {
    @Override
    public Product factory() {
        return new IceCream();
    }
}
