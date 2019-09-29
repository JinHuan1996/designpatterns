package designpatterns.factory.simplefactory;

/**
 * 测试简单工厂.
 *
 * @author Mr.Jin
 * @version 111
 */
public class TestMain {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Product product = factory.createProduct(ProductA.class);
        product.create();
        product = factory.createProduct("designpatterns.factory.simplefactory.ProductB");
        product.create();
    }
}
