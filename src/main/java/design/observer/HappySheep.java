package design.observer;

public class HappySheep implements Observer {

    /**
     * 获取观察者姓名.
     *
     * @return 观察者姓名
     */
    @Override
    public String getName() {
        return "喜洋洋";
    }

    /**
     * 发布通知.
     *
     * @param str 通知消息内容
     */
    @Override
    public void update(String str) {
        System.out.println("喜洋洋收到通知：" + str);
    }
}
