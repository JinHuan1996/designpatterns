package design.factory;

/**
 * 调用类.
 *
 * @author Mr.Jin
 * @version 1.0 V 2019-07-11
 */
public class Client {

    public static void main(String[] args) {
        // 生产雪糕
        Factory iceCreamFactory = new IceCreamFactory();
        Product iceCream = iceCreamFactory.factory();
        iceCream.product();
        // 生产披萨
        Factory pizzaFactory = new PizzaFactory();
        Product pizza = pizzaFactory.factory();
        pizza.product();
    }
}
