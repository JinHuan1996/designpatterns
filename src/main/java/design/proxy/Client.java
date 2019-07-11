package design.proxy;

/**
 * 调用方.
 *
 * @author Mr.Jin
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Subject star = new Star();
        Subject agent = new Agent(star);
        agent.movie();
        System.out.println("==================");
        Subject agent1 = star.getAgent();
        agent1.movie();
        System.out.println("==================");
        BigStar bigStar = new BigStar();
        Subject agent2 = bigStar.getAgent();
        agent2.movie();
    }

}
