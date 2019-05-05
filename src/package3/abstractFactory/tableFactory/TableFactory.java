package package3.abstractFactory.tableFactory;

import package3.abstractFactory.factory.Factory;
import package3.abstractFactory.factory.Link;
import package3.abstractFactory.factory.Page;
import package3.abstractFactory.factory.Tray;

public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
