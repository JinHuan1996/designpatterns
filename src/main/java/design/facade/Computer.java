package design.facade;

/**
 * 电脑.
 *
 * @author Mr.Jin
 * @version 1.0 V 2019-07-15
 */
public class Computer {

    private Cpu cpu;

    private Memory memory;

    private Disk disk;

    public Computer() {
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }

    public void start() {
        System.out.println("Computer start");
        cpu.start();
        memory.start();
        disk.start();
        System.out.println("Computer start finish");
    }

    public void end() {
        System.out.println("Computer end");
        cpu.end();
        memory.end();
        disk.end();
        System.out.println("Computer end finish");
    }
}
