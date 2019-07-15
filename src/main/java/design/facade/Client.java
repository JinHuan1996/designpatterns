package design.facade;

/**
 * 启动类.
 *
 * @author Mr.Jin
 * @version 1.0 V 2019-07-15
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.end();
    }
}
