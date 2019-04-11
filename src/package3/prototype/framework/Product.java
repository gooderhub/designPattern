package package3.prototype.framework;

public interface Product extends Cloneable {
    public abstract void use(String s);
    //复制实例的方法
    public abstract Product createClone();
}
