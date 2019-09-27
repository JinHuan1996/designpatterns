package design.singleton;

public class ThreadCrackSingleton implements Runnable {

    @Override
    public void run() {
        ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+ ':' +threadLocalSingleton);
        ThreadLocalSingleton threadLocalSingleton1 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+ ':' +threadLocalSingleton1);
    }

}
