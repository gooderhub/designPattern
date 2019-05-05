package package3.abstractFactory.factory;

//是Link和Tray类的父类，这样Link和Tray类就有可替换性了
public abstract class Item {
    //标题
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    //返回HTML文件内容
    public abstract String makeHTML();
}

