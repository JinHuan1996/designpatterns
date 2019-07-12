package design.factory;

/**
 * pizza.
 *
 * @author Mr.Jin
 * @version 1.0 V
 */
public class Pizza implements Product {
    @Override
    public void product() {
        /**
         * 具体的业务逻辑.
         */
        System.out.println("披萨做好了！！");
    }
}
