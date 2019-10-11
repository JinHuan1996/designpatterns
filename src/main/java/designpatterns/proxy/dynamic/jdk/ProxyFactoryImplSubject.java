package designpatterns.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyFactoryImplSubject implements InvocationHandler {

    private Object object;

    public ProxyFactoryImplSubject(Object subject) {
        this.object = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        System.out.println(Thread.currentThread().getName() + name + args[0] + "我是动态代理处理之前");
        method.invoke(object, args);
        System.out.println(Thread.currentThread().getName() + name + args[0] + "我是动态代理处理之后");
        return null;
    }
}
