package designpatterns.proxy.staticproxy;

public class ProxySubject implements Subject {

    /** 真实代理引用. */
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("我是代理引用方法之前");
        subject.request();
        System.out.println("我是代理引用方法之后");
    }

    @Override
    public Subject assignProxy() {
        return this;
    }
}
