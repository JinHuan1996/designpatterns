package design.singleton;

public class TestMain {

    public static void main(String[] args) {

        //多线程 获取单例对象
        System.out.println("获取开始");
        Thread t1 = new Thread(new ThreadCrackSingleton());
        Thread t2 = new Thread(new ThreadCrackSingleton());
        t1.start();
        t2.start();

        // 反射攻击
//        try {
//            Class<?> c = FierceLazyThreadSingleton.class;
//            Constructor constructor = c.getDeclaredConstructor();
//            // 强制访问私有方法
//            constructor.setAccessible(true);
//            Object o1 = constructor.newInstance();
//            Object o2 = constructor.newInstance();
//            System.out.println(o1 + ":" + o2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        FierceLazyThreadSingleton instance = FierceLazyThreadSingleton.getInstance();
//        System.out.println(instance);
//        FierceLazyThreadSingleton instance1 = FierceLazyThreadSingleton.getInstance();
//        System.out.println(instance1);
//        FierceLazyThreadSingleton instance2 = FierceLazyThreadSingleton.getInstance();
//        System.out.println(instance2);
//        FierceLazyThreadSingleton instance3 = FierceLazyThreadSingleton.getInstance();
//        System.out.println(instance3);
//        FierceLazyThreadSingleton instance4 = FierceLazyThreadSingleton.getInstance();
//        System.out.println(instance4);

//        FierceLazyThreadSingleton f1 = null;
//        FierceLazyThreadSingleton f2 = FierceLazyThreadSingleton.getInstance();
//
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("FierceLazyThreadSingleton.obj");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(f2);
//            objectOutputStream.flush();
//            objectOutputStream.close();
//            fileOutputStream.close();
//
//            FileInputStream fileInputStream = new FileInputStream("FierceLazyThreadSingleton.obj");
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            f1 = (FierceLazyThreadSingleton) objectInputStream.readObject();
//            fileInputStream.close();
//            objectInputStream.close();
//            System.out.println(f1 == f2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // 注册式创建单例对象
//        Object bean2 = RegisterSingletonForMap.getBean(TestMain.class);
//        Object bean1 = RegisterSingletonForMap.getBean(TestMain.class);
//        System.out.println(bean1);
//        System.out.println(bean2);

//        ThreadLocalSingleton instance1 = ThreadLocalSingleton.getInstance();
//        System.out.println(instance1);
//        ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
//        System.out.println(instance2);
//        ThreadLocalSingleton instance3 = ThreadLocalSingleton.getInstance();
//        System.out.println(instance3);
//        ThreadLocalSingleton instance4 = ThreadLocalSingleton.getInstance();
//        System.out.println(instance4);

    }
}
