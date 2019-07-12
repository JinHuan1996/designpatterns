package design.factory;

/**
 * 一句话描述此类.
 *
 * @author Mr.Jin
 * @version 1.0 V 2019-07-11
 */
public class PizzaFactory implements Factory {
    @Override
    public Product factory() {
        return new Pizza();
    }

}
