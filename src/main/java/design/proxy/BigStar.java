package design.proxy;

/**
 * 巨星代理者.
 *
 * @author Mr.Jin
 * @version 1.0
 */
public class BigStar implements Subject {

    /**
     * 要做的事情.
     */
    @Override
    public void movie() {
        System.out.println(getClass().getSimpleName() + "：我比较不一样,我是巨星");
    }

    /**
     * 指定代理.
     */
    @Override
    public Subject getAgent() {
        return new Agent(this);
    }
}
