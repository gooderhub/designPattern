package package3.abstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

//抽象的产品类
public abstract class Page {
    protected String title;
    protected String author;
    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    //页面内容，可以包含多个link或者tray零件。
    protected ArrayList content = new ArrayList();
    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + " 编写完成。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //产品类自己的makeHTML方法
    public abstract String makeHTML();
}
