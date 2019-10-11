package designpatterns.proxy.staticproxy;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("我是真实的做事的人");
    }

    @Override
    public Subject assignProxy() {
        return new ProxySubject(this);
    }
}
