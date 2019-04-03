package package3.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("开始");
        Singleton singleton1= Singleton.getInstance();
        Singleton singleton2= Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("相同");
        } else {
            System.out.println("不同");
        }
    }
}
