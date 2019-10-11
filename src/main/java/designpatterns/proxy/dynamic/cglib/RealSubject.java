package designpatterns.proxy.dynamic.cglib;

public class RealSubject {

    public void request(String s) {
        System.out.println(Thread.currentThread().getName() + s + "我是真实的做事的人");
    }

}
