package designpatterns.factory.factorymethod;

/**
 * 测试简单工厂.
 *
 * @author Mr.Jin
 * @version 111
 */
public class TestMain {

    public static void main(String[] args) {
        Factory factory = new FactoryA();
        Product product = factory.create();
        product.create();
        factory = new FactoryB();
        product = factory.create();
        product.create();
    }
}
