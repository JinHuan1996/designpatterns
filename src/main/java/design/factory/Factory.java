package design.factory;

/**
 * 工厂类.
 */
public interface Factory {

    // 传入参数的是产品类型，这里返回产品类的抽象工厂类Product
    Product factory();
}
