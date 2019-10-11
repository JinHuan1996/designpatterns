package designpatterns.proxy.dynamic.jdk;

public class RealSubject implements Subject {

    @Override
    public void request(String s) {
        System.out.println(Thread.currentThread().getName() + s + "我是真实的做事的人");
    }

}
