package design.observer;

/**
 * 观察者启动类.
 *
 * @author Mr.Jin
 * @version V 1.0 2019-01-31
 */
public class Application {

    public static void main(String[] args) {

        // 被观察者--狼
        Wolf wolf = new Wolf();

        // 观察者--喜洋
        HappySheep happySheep = new HappySheep();

        // 观察者--懒洋洋
        LazySheep lazySheep = new LazySheep();

        PanShuWen panShuWen = new PanShuWen();

        // 添加观察者
        wolf.addObserver(happySheep);
        wolf.addObserver(lazySheep);
        wolf.addObserver(panShuWen);

        // 如何使观察者不知道灰太狼来搞事情了，只有删除观察者
        wolf.deleteObserver(happySheep);

        // 入侵
        wolf.invade();

    }
}
