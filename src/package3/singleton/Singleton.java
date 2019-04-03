package package3.singleton;

public class Singleton {
    //在类被加载的时候运行一次，这是本类构造函数的唯一一次使用。
    //未被使用之前就已经实例化完成，称为饿汉式
    private static Singleton singleton = new Singleton();

    //构造函数为私有的，只有本类才能构造实例
    private Singleton() {
        System.out.println("生成了一个Singleton实例");
    }

    //外界只能通过唯一的getInstance方法获得这个唯一的实例
    public static Singleton getInstance() {
        return singleton;
    }
}
