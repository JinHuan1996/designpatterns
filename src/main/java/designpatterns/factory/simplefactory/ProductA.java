package designpatterns.factory.simplefactory;

/**
 * 产品A.
 */
public class ProductA implements Product {
    @Override
    public void create() {
        System.out.println("生产产品A");
    }
}
