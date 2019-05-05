package package3.abstractFactory;

import package3.abstractFactory.factory.Factory;
import package3.abstractFactory.factory.Link;
import package3.abstractFactory.factory.Page;
import package3.abstractFactory.factory.Tray;

//使用抽象工厂，创建抽象零件和产品，没有涉及任何一个具体的类
public class Main {
    public static void main(String[] args) {
        String[] factorys = {"package3.abstractFactory.listFactory.ListFactory", "package3.abstractFactory.tableFactory.TableFactory"};
        Factory factory = Factory.getFactory(factorys[1]);

        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("检索引擎");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "杨文轩");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
