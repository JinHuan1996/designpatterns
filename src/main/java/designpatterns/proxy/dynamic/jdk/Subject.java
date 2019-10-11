package designpatterns.proxy.dynamic.jdk;

/**
 * 要代理的事情.
 */
public interface Subject {
    /**
     * 具体事情（请求）
     */
    void request(String s);
}
