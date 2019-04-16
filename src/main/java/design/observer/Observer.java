package design.observer;

/**
 * 观察者接口
 *
 * @author Mr.Jin
 * @version V 1.0 2019-01-31
 */
public interface Observer {

    /**
     * 获取观察者姓名.
     * 
     * @return 观察者姓名
     */
    String getName();

    /**
     * 发布通知.
     * 
     * @param str 通知消息内容
     */
    void update(String str);
}
