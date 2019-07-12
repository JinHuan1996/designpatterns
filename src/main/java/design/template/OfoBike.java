package design.template;

/**
 * 一句话描述此类.
 *
 * @author Mr.Jin
 * @version 1.0 V 2019-07-12
 */
public class OfoBike extends AbstractBike {
    /**
     * 开锁基本方法，子类需要实现.
     */
    @Override
    protected void unlock() {
        System.out.println("========" + "扫码开锁" + "========");
    }

    /**
     * 骑行基本方法，子类需要实现.
     */
    @Override
    protected void ride() {
        System.out.println(getClass().getSimpleName() + "骑起来很拉风");
    }

    /**
     * 关锁基本方法，子类需要实现.
     */
    @Override
    protected void lock() {
        System.out.println("上锁");
    }

    /**
     * 结算基本方法，子类需要实现.
     */
    @Override
    protected void pay() {
        System.out.println("结算");
    }

    /**
     * 钩子方法，子类可实现.
     *
     * @param isNeedUnlock 是否要开锁
     */
    @Override
    protected void isNeedUnlock(boolean isNeedUnlock) {
        super.isNeedUnlock(isNeedUnlock);
    }
}
