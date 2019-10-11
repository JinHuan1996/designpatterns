package designpatterns.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

public class ProxyFactorySubject {
    private Object target;

    public ProxyFactorySubject(Object target) {
        this.target = target;
    }

    public Object getInstanceFactory() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println(Thread.currentThread().getName() + "我是动态代理处理之前");
            Object invoke = method.invoke(target, args);
            System.out.println(Thread.currentThread().getName() + "我是动态代理处理之后");
            return null;
        });
    }
}
