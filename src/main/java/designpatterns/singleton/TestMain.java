package designpatterns.singleton;

public class TestMain {

    public static void main(String[] args) {
        // 测试饿汉式单例
//        HungrySingleton instance1 = HungrySingleton.getInstance();
//        System.out.println(instance1);
//        HungrySingleton instance2 = HungrySingleton.getInstance();
//        System.out.println(instance2);
//        HungrySingleton instance3 = HungrySingleton.getInstance();
//        System.out.println(instance3);
//        HungrySingleton instance4 = HungrySingleton.getInstance();
//        System.out.println(instance4);
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new SingletonThread());
            thread.start();
        }

        // 测试懒汉式单例
//        LazySingleton lazySingleton1 = LazySingleton.getInstance();
//        System.out.println(lazySingleton1);
//        LazySingleton lazySingleton2 = LazySingleton.getInstance();
//        System.out.println(lazySingleton2);
//        LazySingleton lazySingleton3 = LazySingleton.getInstance();
//        System.out.println(lazySingleton3);

        // 测试懒汉式双重锁单例 , 测试最厉害的单例 , 使用枚举创建单例
//        for (int i = 0; i < 100; i++) {
//            Thread thread = new Thread(new SingletonThread());
//            thread.start();
//        }

        // 反射破坏单例
//        Class<LazyFierceSingleton> lazyFierceSingletonClass = LazyFierceSingleton.class;
//        try {
//            Constructor<LazyFierceSingleton> declaredConstructor = lazyFierceSingletonClass.getDeclaredConstructor();
//            declaredConstructor.setAccessible(true);
//            LazyFierceSingleton lazyFierceSingleton1 = declaredConstructor.newInstance();
//            LazyFierceSingleton lazyFierceSingleton2 = declaredConstructor.newInstance();
//            System.out.println(lazyFierceSingleton1 == lazyFierceSingleton2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // 序列化破坏单例
//        LazySingletonEnum l1 = null;
//        LazySingletonEnum l2 = LazySingletonEnum.INSTANCE;
//        l2.setData(new Object());
//        try {
//            // 将l2实例写到磁盘文件
//            FileOutputStream fileOutputStream = new FileOutputStream("LazyFierceSingleton.obj");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(l2);
//            objectOutputStream.flush();
//            objectOutputStream.close();
//            fileOutputStream.close();
//
//            FileInputStream fileInputStream = new FileInputStream("LazyFierceSingleton.obj");
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            l1 = (LazySingletonEnum) objectInputStream.readObject();
//            System.out.println(l1.getData() == l2.getData());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
