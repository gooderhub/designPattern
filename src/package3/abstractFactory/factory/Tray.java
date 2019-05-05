package package3.abstractFactory.factory;

import java.util.ArrayList;

//抽象的零件类
//“托盘类”，是个可以存放多个tray和link类的容器
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        tray.add(item);
    }
}
