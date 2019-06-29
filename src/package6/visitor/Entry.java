package package6.visitor;

import java.util.Iterator;

public abstract class Entry implements Element {
    public abstract String getName();

    public abstract int getSize();

    //添加元素方法，抽象的父类无法添加
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    //便利元素方法，抽象的父类无法遍历
    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public String toString() {                                          // 显示字符串
        return getName() + " (" + getSize() + ")";
    }
}
