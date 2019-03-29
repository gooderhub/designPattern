package package1.adapter.useobject;

import package1.adapter.useobject.Print;
import package1.adapter.useobject.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
