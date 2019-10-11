package designpatterns.proxy.dynamic.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactoryCglibSubject implements MethodInterceptor {

    private Object target;

    public ProxyFactoryCglibSubject(Object target) {
        this.target = target;
    }

    //为目标对象生成代理对象
    public Object getProxyInstance() {
        //工具类
        Enhancer en = new Enhancer();
        //设置父类
        en.setSuperclass(target.getClass());
        //设置回调函数
        en.setCallback(this);
        //创建子类对象代理
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println(Thread.currentThread().getName() + "我是动态代理处理之前");
        Object invoke = method.invoke(target, args);
        System.out.println(Thread.currentThread().getName() + "我是动态代理处理之后");
        return null;
    }
}
