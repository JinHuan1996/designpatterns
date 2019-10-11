package designpatterns.proxy.staticproxy;

public class ProxyTest {
    public static void main(String[] args) {
        Subject subject = new ProxySubject(new RealSubject());
        subject.request();
    }
}
