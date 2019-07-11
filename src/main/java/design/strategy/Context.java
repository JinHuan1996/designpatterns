package design.strategy;

/**
 * 封装的策略角色.
 *
 * @author Mr.Jin
 * @version 1.0 V 2019-07-11
 */
public class Context {

    /** 策略角色和方法. */
    private Strategy strategy;

    /**
     * 定义策略角色的构造方法.
     * @param strategy 策略角色和方法
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 使用策略.
     */
    public void contextInterface () {
        strategy.algorithmLogic();
    }
}
