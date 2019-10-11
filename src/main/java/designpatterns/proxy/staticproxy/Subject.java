package designpatterns.proxy.staticproxy;

/**
 * 要代理的事情.
 */
public interface Subject {
    /**
     * 具体事情（请求）
     */
    void request();

    /**
     * 指定代理.
     * @return
     */
    Subject assignProxy();
}
