package package3.prototype.user;

import package3.prototype.framework.Manager;
import package3.prototype.framework.Product;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("Strong Message", upen);
        manager.register("Warning box", mbox);
        manager.register("Slash box", sbox);


        Product p1 = manager.create("Strong Message");
        p1.use("hello");

        Product p2 = manager.create("Warning box");
        p2.use("hello");

        Product p3 = manager.create("Slash box");
        p3.use("hello");
    }
}
