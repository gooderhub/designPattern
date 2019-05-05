package package3.abstractFactory.listFactory;

import package3.abstractFactory.factory.Factory;
import package3.abstractFactory.factory.Link;
import package3.abstractFactory.factory.Page;
import package3.abstractFactory.factory.Tray;

public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
