package designpatterns.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
//        ProxyFactorySubject proxy = new ProxyFactorySubject(subject);
//        Subject subject1 = (Subject) proxy.getInstanceFactory();
//        System.out.println(Thread.currentThread().getName() + "-------------------------");
//        subject1.request("金欢");

        ProxyFactoryImplSubject proxyFactoryImplSubject = new ProxyFactoryImplSubject(subject);
        Subject subject2 = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), proxyFactoryImplSubject);
        subject2.request("今后");
    }
}
