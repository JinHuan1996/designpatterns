package design.observer;

/**
 * 被观察者.
 *
 * @author Mr.Jin
 * @version V 1.0 2019-01-31
 */
public class Wolf extends Subject {

    public void invade() {
        System.out.println("灰太狼：我要搞事情了");
        // 通知所有观察者
        informAllObserver();
    }
}
