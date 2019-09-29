package designpatterns.singleton;

import designpatterns.singleton.threadlocal.ThreadLocalSingleton;

public class SingletonThread implements Runnable {

    @Override
    public void run() {
//        HungrySingleton instance = HungrySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        LazyFierceSingleton instance = LazyFierceSingleton.getInstance();
//        LazySingletonEnum.INSTANCE.setData(new Object());
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance1 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+ ":" + instance);
        System.out.println(Thread.currentThread().getName()+ ":" + instance1);
        System.out.println(Thread.currentThread().getName()+ ":" + instance2);

    }

}
