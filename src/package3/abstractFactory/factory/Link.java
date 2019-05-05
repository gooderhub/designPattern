package package3.abstractFactory.factory;

//抽象零件类
public abstract class Link extends Item {
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
    //没有实现父类的抽象方法，Link也是抽象类
    //public abstract String makeHTML();
}
