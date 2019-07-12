package design.template;

/**
 * 模板抽象.
 *
 * @author Mr.Jin
 * @version 1.0 V 2019-07-12
 */
public abstract class AbstractBike {

    // 默认需要开锁
    protected boolean isNeedUnlock = true;

    /**
     * 开锁基本方法，子类需要实现.
     */
    protected abstract void unlock();

    /**
     * 骑行基本方法，子类需要实现.
     */
    protected abstract void ride();

    /**
     * 关锁基本方法，子类需要实现.
     */
    protected abstract void lock();

    /**
     * 结算基本方法，子类需要实现.
     */
    protected abstract void pay();

    /**
     * 钩子方法，子类可实现.
     *
     * @param isNeedUnlock 是否要开锁
     */
    protected void isNeedUnlock(boolean isNeedUnlock) {
        this.isNeedUnlock = isNeedUnlock;
    }

    /**
     * 模板方法，负责调度基本方法，子类不可实现.
     */
    public final void use() {
        if (isNeedUnlock) {
            unlock();
        } else {
            System.out.println("========锁坏了，不用解锁========");
        }
        ride();
        if (isNeedUnlock) {
            pay();
        } else {
            System.out.println("========锁坏了，不用结算========");
        }
        lock();
    }
}
