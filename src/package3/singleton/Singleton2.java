package package3.singleton;

public class Singleton2 {
    private static Singleton2 instance;

    // 构造方法私有化
    private Singleton2() {}

    // 静态方法返回该实例
    public static Singleton2 getInstance() {
        if(instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
