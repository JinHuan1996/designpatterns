package design.proxy;

/**
 * 代理者.
 *
 * @author Mr.Jin
 * @version 1.0
 */
public class Agent implements Subject {

    private Subject star;

    public Agent(Subject star) {
        this.star = star;
    }

    /**
     * 要做的事情.
     */
    @Override
    public void movie() {
        // 代理者实现具体一些事宜
        System.out.println(getClass().getSimpleName() + "：剧本很好，这部电影接下了");
        star.movie();
    }

    /**
     * 指定代理.
     */
    @Override
    public Subject getAgent() {
        return this;
    }
}
