package design.agency;

/**
 * 被代理者.
 *
 * @author Mr.Jin
 * @version 1.0
 */
public class Star implements Subject {

    /**
     * 代理事务.
     */
    @Override
    public void movie() {
        // 独有做事风格
        System.out.println(getClass().getSimpleName() + "：经纪人接了一部电影，我负责拍就好");
    }

    /**
     * 指定代理.
     */
    @Override
    public Subject getAgent() {
        return new Agent(this);
    }
}
