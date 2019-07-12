package design.template;

/**
 * 一句话描述此类.
 *
 * @author Mr.Jin
 * @version 1.0 V 2019-07-12
 */
public class Client {

    public static void main(String[] args) {
        OfoBike ofoBike = new OfoBike();
//        ofoBike.isNeedUnlock(false);
        ofoBike.use();
        System.out.println("--------------------");
        BlueBike blueBike = new BlueBike();
        blueBike.isNeedUnlock(false);
        blueBike.use();
    }
}
