package designpatterns.factory.factorymethod;

/**
 * 产品B.
 */
public class ProductB implements Product {

    @Override
    public void create() {
        System.out.println("生产产品B");
    }
}
