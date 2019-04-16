package design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象观察者操作
 *
 * @author Mr.Jin
 * @version V 1.0 2019-01-31
 */
public abstract class Subject {

    /** 观察者集合. */
    private List<Observer> observerList = new ArrayList<>();

    /**
     * 新增观察者.
     *
     * @author Mr.Jin
     * @param observer 观察者
     */
    public void addObserver(Observer observer) {
        observerList.add(observer);
        System.out.println("新增观察者：" + observer.getName());
    }

    /**
     * 删除观察者.
     *
     * @author Mr.Jin
     * @param observer 观察者
     */
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
        System.out.println("删除观察者：" + observer.getName());
    }

    /**
     * 通知所有观察者.
     */
    public void informAllObserver() {
        for (Observer observer : observerList) {
            observer.update("灰太狼来搞事情了");
        }
    }
}
