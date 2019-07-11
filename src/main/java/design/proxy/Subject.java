package design.proxy;

/**
 * 抽象主题角色 代理者和被代理者都要实现.
 *
 * @author Mr.Jin
 * @version 1.0
 */
public interface Subject {

    /**
     * 要做的事情.
     */
    void movie();

    /**
     * 指定代理.
     */
    Subject getAgent();

}
