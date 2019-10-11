package designpatterns.proxy.dynamic.cglib;

public class ProxyTest {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        ProxyFactoryCglibSubject proxyFactoryCglibSubject = new ProxyFactoryCglibSubject(realSubject);
        RealSubject proxy = (RealSubject) proxyFactoryCglibSubject.getProxyInstance();
        proxy.request("今后");
    }
}
