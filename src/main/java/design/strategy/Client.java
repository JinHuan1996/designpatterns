package design.strategy;

/**
 * 使用类.
 *
 * @author Mr.Jin
 * @version 1.0 V 2019-07-11
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.contextInterface();
        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
    }

}
