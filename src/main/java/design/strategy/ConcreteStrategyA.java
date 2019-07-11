package design.strategy;

/**
 * 具体的策略类A.
 *
 * @author Mr.Jin
 * @version 1.0 V 2019-07-11
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithmLogic() {
        // 具体的算法逻辑（输了比赛）
        System.out.println("第一场：上等马vs上等马  第二场：中等马vs中等马  第三场：下等马vs下等马  赛果：输！");
    }
}
